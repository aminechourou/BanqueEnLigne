package projetIMAFA.controller;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import projetIMAFA.entity.Action;
import projetIMAFA.entity.Ordre;
import projetIMAFA.entity.TypeOrdre;
import projetIMAFA.entity.TypeProduitFin;
import projetIMAFA.service.IActionService;
import projetIMAFA.service.IObligationService;
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
	IObligationService obligationService;
	
	@Autowired
	ISicavService sicavService;
	
	private TypeOrdre type;	
	private TypeProduitFin typepf;
	private int idpf;
	private Date dateOrdre;
	
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
	private long volume;
	private String variation;
	
	public String addaction()
	{
		Date currentUtilDate = new Date();
		int i=0;
		if(operation.equals("Achat"))
		{i=1;}
		else{i=0;}
		
		Action a=actionService.addAction(new Action(currentUtilDate,i,isin,ticker,open,high,low,yield,close,volume,variation,0));
		if(i==1)
		{
		ordreService.addOrdre(new Ordre(TypeOrdre.Achat, TypeProduitFin.Action,a.getAction_ID(),currentUtilDate));
		}
		else{
		ordreService.addOrdre(new Ordre(TypeOrdre.Vente, TypeProduitFin.Action,a.getAction_ID(),currentUtilDate));	
		}
		return "ajouteraction.jsf?faces-redirect=true";
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
	

}
