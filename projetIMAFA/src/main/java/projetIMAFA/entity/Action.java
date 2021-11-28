package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Action implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private int action_ID;

@Temporal(TemporalType.DATE)
private Date date;
// 1 = achat / 0 = vente
private int operation;	

@Column(name="isin")
private String isin;

@Column(name="ticker")
private String ticker;

@Column(name="open")
private float open;

@Column(name="high")
private float high;


@Column(name="low")
private float low;

@Column(name="yield")
private float yield;

@Column(name="close")
private float close;

@Column(name="volume")
private long volume;

@Column(name="variation")
private String variation;
/**/
private int Num_compte;
public int getAction_ID() {
	return action_ID;
}
public void setAction_ID(int action_ID) {
	this.action_ID = action_ID;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getOperation() {
	return operation;
}
public void setOperation(int operation) {
	this.operation = operation;
}

public int getNum_compte() {
	return Num_compte;
}
public void setNum_compte(int num_compte) {
	Num_compte = num_compte;
}
public static long getSerialversionuid() {
	return serialVersionUID;
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

@Override
public String toString() {
	return "Action [action_ID=" + action_ID + ", date=" + date + ", operation=" + operation + ", isin=" + isin
			+ ", ticker=" + ticker + ", open=" + open + ", high=" + high + ", low=" + low + ", yield=" + yield
			+ ", close=" + close + ", volume=" + volume + ", variation=" + variation + ", Num_compte=" + Num_compte
			+ "]";
}

public Action(int action_ID, Date date, int operation, String isin, String ticker, float open, float high, float low,
		float yield, float close, long volume, String variation, int num_compte) {
	super();
	this.action_ID = action_ID;
	this.date = date;
	this.operation = operation;
	this.isin = isin;
	this.ticker = ticker;
	this.open = open;
	this.high = high;
	this.low = low;
	this.yield = yield;
	this.close = close;
	this.volume = volume;
	this.variation = variation;
	Num_compte = num_compte;
}
public Action(Date date, int operation, String isin, String ticker, float open, float high, float low,
		float yield, float close, long volume, String variation, int num_compte) {
	super();
	this.date = date;
	this.operation = operation;
	this.isin = isin;
	this.ticker = ticker;
	this.open = open;
	this.high = high;
	this.low = low;
	this.yield = yield;
	this.close = close;
	this.volume = volume;
	this.variation = variation;
	Num_compte = num_compte;
}

public Action() {
	super();
}



}