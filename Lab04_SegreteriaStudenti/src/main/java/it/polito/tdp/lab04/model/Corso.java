package it.polito.tdp.lab04.model;

public class Corso implements Comparable<Corso>{
 private String codins;
 private Integer crediti;
 private String nomeCorso;
 private Integer pd;
public Corso(String codins, Integer crediti, String nomeCorso, Integer pd) {
	super();
	this.codins = codins;
	this.crediti = crediti;
	this.nomeCorso = nomeCorso;
	this.pd = pd;
}
public String getCodins() {
	return codins;
}
public void setCodins(String codins) {
	this.codins = codins;
}
public Integer getCrediti() {
	return crediti;
}
public void setCrediti(Integer crediti) {
	this.crediti = crediti;
}
public String getNomeCorso() {
	return nomeCorso;
}
public void setNomeCorso(String nomeCorso) {
	this.nomeCorso = nomeCorso;
}
public Integer getPd() {
	return pd;
}
public void setPd(Integer pd) {
	this.pd = pd;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codins == null) ? 0 : codins.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Corso other = (Corso) obj;
	if (codins == null) {
		if (other.codins != null)
			return false;
	} else if (!codins.equals(other.codins))
		return false;
	return true;
}
public int compareTo(Corso c) {
	return this.codins.compareTo(c.codins);
	
}
public String toString() {
	return nomeCorso;
}
 
 
}
