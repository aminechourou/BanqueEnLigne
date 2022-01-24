package projetIMAFA.controller;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Controller;
import lombok.Getter;
import lombok.Setter;
import projetIMAFA.entity.Action;
import projetIMAFA.entity.CompteTitre;
import projetIMAFA.entity.Data_action;
import projetIMAFA.entity.EmployeeSalary;
import projetIMAFA.entity.Formation;
import projetIMAFA.entity.Obligation;
import projetIMAFA.entity.Obligationc;
import projetIMAFA.entity.Ordre;
import projetIMAFA.entity.TypeOrdre;
import projetIMAFA.entity.TypeProduitFin;
import projetIMAFA.repo.DataRepository;
import projetIMAFA.service.ComptetitreService;
import projetIMAFA.service.IActionService;
import projetIMAFA.service.IDataService;
import projetIMAFA.service.IObligationService;
import projetIMAFA.service.IObligationcService;
import projetIMAFA.service.IOrdreService;
import projetIMAFA.service.ISicavService;


@Transactional
@Scope(value = "session")
@Controller(value = "OrdreController") // Name of the bean in Spring IoC
@ELBeanName(value = "OrdreController") // Name of the bean used by JSF
public class OrdreControllerJSF {
	@Autowired
	IOrdreService ordreService ;
	/*@Autowired
	CompteTitreRepository compteTitreRepository;*/
	
	@Autowired
	IActionService actionService;

	@Autowired
	IObligationcService obligationcService;
	
	@Autowired
	ComptetitreService compteTitreRepository;

	@Autowired
	IObligationService obligationService;
	
	@Autowired
	IDataService dataService;
	
	@Autowired
	ISicavService sicavService;
	
	private TypeOrdre type;	
	private TypeProduitFin typepf;
	private int idpf;
	private Date dateOrdre;
    private int idsd;
	/** action **/
	private Date date;
	private String operation;	
	private String isin;
	private String ticker;
	private float open;
	private float high;
	private float low;
	private float yield;
	private float close;
	private float closew;
	private long volume;
	private String variation;
	private List<Action> actions;
	private List<Action> actionss;
	
	/** data_action **/	
	private Date dated;
	private float opend;
	private float highd;
	private int id;
	private float lowd;
	private float closed;
	private long volumed;	
	private String libelled;	
	private List<String> datalib;
	private List<Data_action> datas;
	private LineChartModel  linemodel;

	/** Obligation **/
	private int obligation_ID;
	private Date date_emission; 
	private String nomentreprise; 
	private int maturite; //echeance
	private int valeurnominal; //valeur nominale
	private float tauxactuariel;
	private float tauxcoupon;
	private int quantite;
	private List<Obligation> obligations;

	/** Obligation client **/

	private int obligationc_ID;	
	private float montant_investi ;
	private Date date_emissionc;
	private float montant_rembourse ;

	@PostConstruct
	public void init() {
		/*Data_action da=dataService.getData(id);
		System.out.print(da);
       linemodel= new LineChartModel();     
        for(int i=0;i<dataService.afflibe(da.getLibelled()) .size();i++){
        	LineChartSeries series1 = new LineChartSeries();
        	 series1.setLabel(da.getLibelled());
        	series1.set(da.getLibelled(),dataService.afflibe(da.getLibelled()) .get(i));
        	System.out.print(dataService.afflibe(da.getLibelled()) .get(i));
        	linemodel.addSeries(series1);
        }
        

        linemodel.setTitle("Users per date");
        linemodel.setLegendPosition("e");
        linemodel.setShowPointLabels(true);
        linemodel.getAxes().put(AxisType.X, new CategoryAxis("Dates"));
        Axis yyAxis = linemodel.getAxis(AxisType.Y);
        yyAxis.setLabel("Users");*/
        //yyAxis.setMin(0);
        //yyAxis.setMax(10);
	      linemodel = new LineChartModel();
	      LineChartSeries s = new LineChartSeries();
	      s.setLabel("Population");

	      s.set(1, 5.20);
	      s.set(2, 19.63);
	      s.set(3, 59.01);
	      s.set(4, 139.76);
	      s.set(5, 300.4);
	      s.set(6, 630);

	      linemodel.addSeries(s);
	      linemodel.setLegendPosition("e");
	      Axis y = linemodel.getAxis(AxisType.Y);
	      y.setMin(0.5);
	      y.setMax(700);
	      y.setLabel("Millions");

	      Axis x = linemodel.getAxis(AxisType.X);
	      x.setMin(0);
	      x.setMax(7);
	      x.setTickInterval("1");
	      x.setLabel("Number of Years");
	}
	
	public String affaction(int id)
	{
		this.setId(id);
		return "stataction.jsf?faces-redirect=true"; 
	}
	
	public String addaction(int id)
	{
		Data_action da=dataService.getData(id);
		Date currentUtilDate = new Date();
		Action a;
		CompteTitre compte = compteTitreRepository.retrieveComptetitre(1);
		a=actionService.addAction(new Action(currentUtilDate,1,da.getLibelled(),da.getLibelled(),da.getOpend(),da.getHighd(),da.getLowd(),15,da.getClosed(),da.getVolumed(),"11",compte));
		ordreService.addOrdre(new Ordre(TypeOrdre.Achat, TypeProduitFin.Action,a.getAction_ID(),currentUtilDate));
		return "afficheraction.jsf?faces-redirect=true"; 
	}
	public List<Obligationc> getObligationcs() {
		
		return obligationcService.compteObligation(1);
		
	}
	public float redemption()
	{
		float redemption=0;
		float coupon;
		Date current = new Date();
        List<Obligationc> oc = obligationcService.compteObligation(1);
        for(Obligationc Obligationc : oc)
		{
        Obligation o = obligationService.retrieveObligation(Obligationc.getObligation().getObligation_ID());
        coupon=(o.getTauxcoupon()/100)*o.getValeurnominal();
        int y=current.getYear()-o.getDate_emission().getYear();
        if(y==o.getMaturite())
        {
        
            redemption +=(coupon*o.getMaturite())+o.getValeurnominal();
        	
        }
        else
        {
           redemption+=(coupon*y);
        }
        if((Obligationc.getMontant_investi()/o.getValeurnominal())>1)
        {
        	int a=(int) (Obligationc.getMontant_investi()/o.getValeurnominal());
        	redemption=redemption*a;
        }
		}       
		return redemption; 
	}
	
	public String addobligation()
	{
		Date currentUtilDate = new Date();
		Obligation a;
		//CompteTitre compte = compteTitreRepository.retrieveComptetitre(1);
		a=obligationService.addObligation(new Obligation(currentUtilDate,nomentreprise,maturite,valeurnominal,quantite,tauxactuariel,tauxcoupon));
		ordreService.addOrdre(new Ordre(TypeOrdre.Achat, TypeProduitFin.Obligation,a.getObligation_ID(),currentUtilDate));
		return "afficheraction.jsf?faces-redirect=true"; 
	}
	
	public String displayObligation(Obligation empl)
	{

		this.setObligation_ID(empl.getObligation_ID());
		this.setDate_emission(empl.getDate_emission());
		this.setMaturite(empl.getMaturite());
		this.setNomentreprise(empl.getNomentreprise());
		this.setQuantite(empl.getQuantite());	
		this.setValeurnominal(empl.getValeurnominal());
		this.setTauxactuariel(empl.getTauxactuariel());
		this.setTauxcoupon(empl.getTauxcoupon());
		return("/ordrect/ajouterobligationc.jsf?faces-redirect=true");

	}
	
	public String addobligationc()
	{
		Obligation da=obligationService.retrieveObligation(obligation_ID);
		Date currentUtilDate = new Date();
		CompteTitre compte = compteTitreRepository.retrieveComptetitre(1);
		montant_rembourse=0;
		int q1=0;
		q1=(int) (montant_investi/da.getValeurnominal());
		int q=0;
		q=da.getQuantite()-q1;
		obligationService.verifiequantite(q,obligation_ID);
		obligationcService.addObligationc(new Obligationc(montant_investi,montant_rembourse,currentUtilDate,compte,da));
		return "/ordrect/afficherobligation.jsf?faces-redirect=true"; 
	}
	public IOrdreService getOrdreService() {
		return ordreService;
	}

	public void setOrdreService(IOrdreService ordreService) {
		this.ordreService = ordreService;
	}

	public IActionService getActionService() {
		return actionService;
	}

	public void setActionService(IActionService actionService) {
		this.actionService = actionService;
	}

	public IObligationService getObligationService() {
		return obligationService;
	}

	public void setObligationService(IObligationService obligationService) {
		this.obligationService = obligationService;
	}

	public ISicavService getSicavService() {
		return sicavService;
	}

	public void setSicavService(ISicavService sicavService) {
		this.sicavService = sicavService;
	}

	public TypeOrdre getType() {
		return type;
	}

	public void setType(TypeOrdre type) {
		this.type = type;
	}

	public TypeProduitFin getTypepf() {
		return typepf;
	}

	public void setTypepf(TypeProduitFin typepf) {
		this.typepf = typepf;
	}

	public int getIdpf() {
		return idpf;
	}

	public void setIdpf(int idpf) {
		this.idpf = idpf;
	}

	public Date getDateOrdre() {
		return dateOrdre;
	}

	public void setDateOrdre(Date dateOrdre) {
		this.dateOrdre = dateOrdre;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public float getOpen() {
		return open;
	}

	public void setOpen(float open) {
		this.open = open;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}

	public float getYield() {
		return yield;
	}

	public void setYield(float yield) {
		this.yield = yield;
	}

	public float getClose() {
		return close;
	}

	public void setClose(float close) {
		this.close = close;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public String getVariation() {
		return variation;
	}

	public void setVariation(String variation) {
		this.variation = variation;
	}

	public IDataService getDataService() {
		return dataService;
	}

	public void setDataService(IDataService dataService) {
		this.dataService = dataService;
	}

	public Date getDated() {
		return dated;
	}

	public void setDated(Date dated) {
		this.dated = dated;
	}

	public float getOpend() {
		return opend;
	}

	public void setOpend(float opend) {
		this.opend = opend;
	}

	public float getHighd() {
		return highd;
	}

	public void setHighd(float highd) {
		this.highd = highd;
	}

	public float getLowd() {
		return lowd;
	}

	public void setLowd(float lowd) {
		this.lowd = lowd;
	}

	public float getClosed() {
		return closed;
	}

	public void setClosed(float closed) {
		this.closed = closed;
	}

	public long getVolumed() {
		return volumed;
	}

	public void setVolumed(long volumed) {
		this.volumed = volumed;
	}

	public String getLibelled() {
		return libelled;
	}

	public void setLibelled(String libelled) {
		this.libelled = libelled;
	}

	public List<String> getDatalib() {
		datalib = dataService.afflib();
		return datalib;
	}

	public void setDatalib(List<String> datalib) {
		this.datalib = datalib;
	}

	public List<Action> getActions() {
		actions =actionService.retrieveAllActions();
		return actions;
	}

	public void setActions(List<Action> actions) {
		
		this.actions = actions;
	}

	public List<Data_action> getDatas() {
		datas=dataService.affdatas();
		System.out.print(datas);
		return datas;
	}

	public void setDatas(List<Data_action> datas) {
		this.datas = datas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LineChartModel getLinemodel() {
		return linemodel;
	}

	public void setLinemodel(LineChartModel linemodel) {
		this.linemodel = linemodel;
	}

	public int getIdsd() {
		return idsd;
	}

	public void setIdsd(int idsd) {
		this.idsd = idsd;
	}

	public List<Action> getActionss() {
		actionss= actionService.retrieveActionsByCompte(1);
		return actionss;
	}
	
	public void setActionss(List<Action> actionss) {
		this.actionss = actionss;
	}

	public float getClosew() {
		closew = actionService.retrieveActionsWall(1);
		return closew;
	}

	public void setClosew(float closew) {
		this.closew = closew;
	}

	public int getObligation_ID() {
		return obligation_ID;
	}

	public void setObligation_ID(int obligation_ID) {
		this.obligation_ID = obligation_ID;
	}

	public Date getDate_emission() {
		return date_emission;
	}

	public void setDate_emission(Date date_emission) {
		this.date_emission = date_emission;
	}

	public String getNomentreprise() {
		return nomentreprise;
	}

	public void setNomentreprise(String nomentreprise) {
		this.nomentreprise = nomentreprise;
	}

	public int getMaturite() {
		return maturite;
	}

	public void setMaturite(int maturite) {
		this.maturite = maturite;
	}

	public int getValeurnominal() {
		return valeurnominal;
	}

	public void setValeurnominal(int valeurnominal) {
		this.valeurnominal = valeurnominal;
	}

	public float getTauxactuariel() {
		return tauxactuariel;
	}

	public void setTauxactuariel(float tauxactuariel) {
		this.tauxactuariel = tauxactuariel;
	}

	public float getTauxcoupon() {
		return tauxcoupon;
	}

	public void setTauxcoupon(float tauxcoupon) {
		this.tauxcoupon = tauxcoupon;
	}

	public List<Obligation> getObligations() {
		return obligationService.retrieveObligationsByQ();
	}

	public void setObligations(List<Obligation> obligations) {
		this.obligations = obligations;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getObligationc_ID() {
		return obligationc_ID;
	}

	public void setObligationc_ID(int obligationc_ID) {
		this.obligationc_ID = obligationc_ID;
	}

	public float getMontant_investi() {
		return montant_investi;
	}

	public void setMontant_investi(float montant_investi) {
		this.montant_investi = montant_investi;
	}

	public Date getDate_emissionc() {
		return date_emissionc;
	}

	public void setDate_emissionc(Date date_emissionc) {
		this.date_emissionc = date_emissionc;
	}

	public float getMontant_rembourse() {
		return montant_rembourse;
	}

	public void setMontant_rembourse(float montant_rembourse) {
		this.montant_rembourse = montant_rembourse;
	}



}
