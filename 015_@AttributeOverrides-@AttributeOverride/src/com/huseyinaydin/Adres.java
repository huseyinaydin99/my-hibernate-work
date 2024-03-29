package com.huseyinaydin;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adres {
	@Column(name = "IL_SEHIR")
	String sehir;
	@Column(name = "IL_SEMT")
	String semt;
	@Column(name = "IL_MAALLE")
	String mahalle;
	@Column(name = "IL_CODDE")
	String cadde;
	@Column(name = "IL_GAPINO")
	String kapiNo;
	@Column(name = "IL_GAT")
	String kat;
	@Column(name = "IL_DAIRE")
	String daireNo;
	@Column(name = "IL_POST")
	String postaKodu;
	
	
	
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getSemt() {
		return semt;
	}
	public void setSemt(String semt) {
		this.semt = semt;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getKapiNo() {
		return kapiNo;
	}
	public void setKapiNo(String kapiNo) {
		this.kapiNo = kapiNo;
	}
	public String getKat() {
		return kat;
	}
	public void setKat(String kat) {
		this.kat = kat;
	}
	public String getDaireNo() {
		return daireNo;
	}
	public void setDaireNo(String daireNo) {
		this.daireNo = daireNo;
	}
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	
	
}
