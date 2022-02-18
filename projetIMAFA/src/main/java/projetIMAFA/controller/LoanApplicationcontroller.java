/*package projetIMAFA.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.primefaces.PrimeFaces;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.title.Title;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;
import org.primefaces.util.LangUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import projetIMAFA.entity.Loan;
import projetIMAFA.entity.LoanApplication;
import projetIMAFA.entity.Loanstatus;
import projetIMAFA.entity.ownership;
import projetIMAFA.service.LoanApplicationServiceImpl;
import projetIMAFA.service.LoanServiceImpl;
import projetIMAFA.service.UserService;



@Scope(value = "session")
@Controller(value = "loanapplicationcontroller")
@ELBeanName(value = "loanapplicationcontroller")
public class LoanApplicationcontroller {
	

	@Autowired
	LoanApplicationServiceImpl loanApplicationServiceImpl ;
	
	@Autowired
	UserService userService;
	
	@Autowired
	LoanServiceImpl LoanServiceImpl ;
	
	private PieChartModel pieModel ;
	private BarChartModel barModel2;
	private LineChartModel lineModel1;
	
	
	public LineChartModel getLineModel1() {
		return lineModel1;
	}


	public void setLineModel1(LineChartModel lineModel1) {
		this.lineModel1 = lineModel1;
	}


	public BarChartModel getBarModel2() {
		return barModel2;
	}


	public void setBarModel2(BarChartModel barModel2) {
		this.barModel2 = barModel2;
	}
	
	private long userid;
	private long age;
	private double annualincome;
	private double emplduration;
	private BigDecimal loanamount;
	private ownership homeownership;
	private String description;
	private int period;
	
	private List<LoanApplication> loanapps;

	private LoanApplication selectedloanapp;

	private List<LoanApplication> filtredloanapps;

	private List<SortMeta> sortBy;
	
	public List<LoanApplication> getFiltredloanapps() {
		return filtredloanapps;
	}


	public List<SortMeta> getSortby() {
		return sortBy;
	}


	public void setSortby(List<SortMeta> sortby) {
		this.sortBy = sortby;
	}


	public void setFiltredloanapps(List<LoanApplication> filtredloanapps) {
		this.filtredloanapps = filtredloanapps;
	}


	public LoanApplication getSelectedloanapp() {
		return selectedloanapp;
	}


	public void setSelectedloanapp(LoanApplication selectedloanapp) {
		this.selectedloanapp = selectedloanapp;
	}


	public List<LoanApplication> getLoanapps() {
		if(loanapps == null){
			loanapps = loanApplicationServiceImpl.getAllLoanApplications();
		}

		return loanapps;
	}


	public void setLoanapps(List<LoanApplication> loanapps) {
		this.loanapps = loanapps;
	}
	
	public long getUserid() {
		return userid;
	}


	public void setUserid(long userid) {
		this.userid = userid;
	}


	public long getAge() {
		return age;
	}


	public void setAge(long age) {
		this.age = age;
	}


	public double getAnnualincome() {
		return annualincome;
	}


	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}


	public double getEmplduration() {
		return emplduration;
	}


	public void setEmplduration(double emplduration) {
		this.emplduration = emplduration;
	}


	public BigDecimal getLoanamount() {
		return loanamount;
	}


	public void setLoanamount(BigDecimal loanamount) {
		this.loanamount = loanamount;
	}


	public ownership getHomeownership() {
		return homeownership;
	}


	public void setHomeownership(ownership homeownership) {
		this.homeownership = homeownership;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPeriod() {
		return period;
	}


	public void setPeriod(int period) {
		this.period = period;
	}
	
	@PostConstruct
	public void init(){

		loanapps = getLoanapps();

		sortBy = new ArrayList<>();

		sortBy.add(SortMeta.builder()
				.field("solvability")
				.order(SortOrder.ASCENDING)
				.build());
		sortBy.add(SortMeta.builder()
				.field("age")
				.order(SortOrder.ASCENDING)
				.priority(1)
				.build());

		createPieModel();
		createBarModel2();
		createLineModels();
	}
	
	
	public void addloanapplication(){

		addMessage("Confirmed", "succesfully applied for a loan");
		LoanApplication ln = new LoanApplication();

		ln.setUserid(userid);
		ln.setAge(age);
		ln.setAnnualincome(annualincome);
		ln.setDescription(description);
		ln.setHomeownership(homeownership);
		ln.setEmplduration(emplduration);
		ln.setPeriod(period);
		ln.setLoanamount(loanamount);






		RestTemplate restTemplate = new RestTemplate();
		final String url = "http://127.0.0.1:3446/model";
		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("person_age", ln.getAge())
				.queryParam("person_income", ln.getAnnualincome())
				.queryParam("person_emp_length", ln.getEmplduration())
				.queryParam("loan_amnt", ln.getLoanamount())
				.queryParam("loan_int_rate", 6.6)
				.queryParam("person_home_ownership", ln.getHomeownership());

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.getForEntity(builder.build().encode().toUri(), String.class);

		String str = response.getBody().substring(1, response.getBody().length()-1);


		ln.setSolvability((int) ((1-Double.parseDouble(str))*100));
		ln.setApplicationdate(ln.getApplicationdate().now());
		ln.setLoanstatus(Loanstatus.WAITING);
		ln.setInterest(6.6);
		loanapps.add(ln);
		LoanApplication loanapplication = loanApplicationServiceImpl.addLoanApplication(ln);
		createPieModel();
		PrimeFaces.current().ajax().update("form:pie", "form:dt-products");



	}
	
	public List<LoanApplication> getallloanapp(){

		loanapps = loanApplicationServiceImpl.getAllLoanApplications();

		return loanapps;
	}

	public void deleteloanapp(){
		loanapps.remove(this.selectedloanapp);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Loan Request Removed"));
		loanApplicationServiceImpl.deleteLoanApplicationByID(this.selectedloanapp.getId());
		createPieModel();
		PrimeFaces.current().ajax().update("form:pie","form:messages", "form:dt-products");
	}

	public void acceptloanapp(){

		addMessage("Confirmed" , "Loan Request accepted");
		Loan loan = new Loan();

		this.selectedloanapp.setLoanstatus(Loanstatus.APPROVED);
		loan.setUserId(this.selectedloanapp.getUserid());
		loan.setAmount(Money.of(CurrencyUnit.EUR, this.selectedloanapp.getLoanamount()));
		loan.setApplicationDate(loan.getApplicationDate().now());
		loan.setLoanend(loan.getApplicationDate().plusMonths(this.selectedloanapp.getPeriod()));
		loan.setInterest(6.6);
		loanApplicationServiceImpl.addLoanApplication(this.selectedloanapp);
		LoanServiceImpl.addLoan(loan);

		PrimeFaces.current().ajax().update("form:pie","form:messages", "form:dt-products");
	}

	public void refuseloanapp(){

		addMessage("Confirmed" , "Loan Request refused");
	

		this.selectedloanapp.setLoanstatus(Loanstatus.REFUSED);

	

		loanApplicationServiceImpl.addLoanApplication(this.selectedloanapp);

		PrimeFaces.current().ajax().update("form:message", "form:dt-products");

	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public boolean filter(Object value, Object filter, Locale locale){
		String filterText = (filter == null) ? null : filter.toString().trim().toLowerCase();

		if (LangUtils.isValueBlank(filterText)) {
			return true;
		}

		int filterInt = getInteger(filterText);

		LoanApplication ln = (LoanApplication)value;

		return ln.getLoanstatus().name().toLowerCase().contains(filterText)||

				ln.getHomeownership().name().toLowerCase().contains(filterText) ||

				ln.getApplicationdate().toString().toLowerCase().contains(filterText) ||

				ln.getSolvability() < filterInt;

	}

	private int getInteger(String string) {
		try {
			return Integer.parseInt(string);
		}
		catch (NumberFormatException ex) {
			return 0;
		}
	}


	public void reset() {
		PrimeFaces.current().resetInputs("form:pnl");
	}


	private void createPieModel() {
		pieModel = new PieChartModel();
		ChartData data = new ChartData();
		int i = 0;
		int j = 0;
		int x = 0;
		for (LoanApplication ln : loanapps) {
			if(ln.getHomeownership().equals(ownership.OWN)){
				i++;
			}
			else if (ln.getHomeownership().equals(ownership.RENT)) {
				j++;
			}
			else{

				x++;
			}
		}
		PieChartDataSet dataSet = new PieChartDataSet();
		List<Number> values = new ArrayList<>();
		values.add(i);
		values.add(j);
		values.add(x);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(255, 99, 132)");
		bgColors.add("rgb(54, 162, 235)");
		bgColors.add("rgb(255, 205, 86)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("OWN");
		labels.add("RENT");
		labels.add("MOTGAGE");
		data.setLabels(labels);

		pieModel.setData( data);    
	}




	public PieChartModel getPieModel() {
		return pieModel;
	}


	public void setPieModel(PieChartModel pieModel) {
		this.pieModel = pieModel;
	}

	public void createBarModel2() {
		barModel2 = new BarChartModel();
		ChartData data = new ChartData();

		BarChartDataSet barDataSet = new BarChartDataSet();
		barDataSet.setLabel("Solvability");
		barDataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
		barDataSet.setBorderColor("rgb(255, 99, 132)");
		barDataSet.setBorderWidth(1);
		List<Number> values = new ArrayList<>();

		for (LoanApplication ln : loanapps) {

			values.add(ln.getSolvability());
		}
		barDataSet.setData(values);

		BarChartDataSet barDataSet2 = new BarChartDataSet();
		barDataSet2.setLabel("Age");
		barDataSet2.setBackgroundColor("rgba(255, 159, 64, 0.2)");
		barDataSet2.setBorderColor("rgb(255, 159, 64)");
		barDataSet2.setBorderWidth(1);
		List<Number> values2 = new ArrayList<>();
		
		for (LoanApplication ln : loanapps) {

			values2.add(ln.getAge());
		}
		barDataSet2.setData(values2);

		data.addChartDataSet(barDataSet);
		data.addChartDataSet(barDataSet2);

		List<String> labels = new ArrayList<>();
		for (LoanApplication ln : loanapps) {
			
			labels.add(ln.getUserid()+"");
		}
		data.setLabels(labels);
		barModel2.setData(data);

		//Options
		BarChartOptions options = new BarChartOptions();
		CartesianScales cScales = new CartesianScales();
		CartesianLinearAxes linearAxes = new CartesianLinearAxes();
		linearAxes.setOffset(true);
		CartesianLinearTicks ticks = new CartesianLinearTicks();
		ticks.setBeginAtZero(true);
		linearAxes.setTicks(ticks);
		cScales.addYAxesData(linearAxes);
		options.setScales(cScales);

		Title title = new Title();
		title.setDisplay(true);
		title.setText("Solvability/Employment Duration");
		options.setTitle(title);

		barModel2.setOptions(options);
	}
	
	

	public void itemSelect(ItemSelectEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
				"Item Index: " + event.getItemIndex() + ", DataSet Index:" + event.getDataSetIndex());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Age");

       for (LoanApplication ln : loanapps) {
    	   
    	   series1.set(ln.getAge(), ln.getSolvability());
		
	}

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Employment Duration");
        	
        for (LoanApplication ln : loanapps) {
     	   
     	   series2.set(ln.getEmplduration(), ln.getSolvability());
 		
 	}
        

        model.addSeries(series1);
        model.addSeries(series2);

        return model;
    }
	
	 private void createLineModels() {
	        lineModel1 = initLinearModel();
	        lineModel1.setTitle(" solvability / Age & Employment Duration  ");
	        lineModel1.setLegendPosition("e");
	        Axis yAxis = lineModel1.getAxis(AxisType.Y);
	        yAxis.setMin(0);
	        yAxis.setMax(100);
	    }

}*/
