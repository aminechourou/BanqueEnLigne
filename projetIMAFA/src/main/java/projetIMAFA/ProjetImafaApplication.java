package projetIMAFA;

import java.util.EnumSet;

import javax.faces.webapp.FacesServlet;
import javax.servlet.DispatcherType;

import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ProjetImafaApplication extends WebMvcConfigurerAdapter   {

	

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/template/index.jsf").setViewName("index.jsf");
	}

	
	public static void main(String[] args) {
		SpringApplication.run(ProjetImafaApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
	FacesServlet servlet = new FacesServlet();
	return  new ServletRegistrationBean(servlet, "*.jsf"); 
	
	}
	@Bean
	public FilterRegistrationBean rewriteFilter() {
	FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
	rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
	DispatcherType.ASYNC, DispatcherType.ERROR));
	rwFilter.addUrlPatterns("/*");
	return rwFilter;
	}
	

}
