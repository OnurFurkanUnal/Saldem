package com.saldemsoft.model;

import java.util.Date;

public class AfetModel {
	private String seriNo;
	private Date baslamaTarihi;
	private Date bitisTarihi;
	private Integer sureGun;
	private Long ilId;
	private Long ilceId;
	private Long koyId;
	private String beldeMevki;
	private String neden;
	private String enlem;
	private String boylam;
	private String nedenAciklama;
	private String etkiledigiYerler;
	private String kaynak;

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public Date getBaslamaTarihi() {
		return baslamaTarihi;
	}

	public void setBaslamaTarihi(Date baslamaTarihi) {
		this.baslamaTarihi = baslamaTarihi;
	}

	public Date getBitisTarihi() {
		return bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

	public Integer getSureGun() {
		return sureGun;
	}

	public void setSureGun(Integer sureGun) {
		this.sureGun = sureGun;
	}

	public Long getIlId() {
		return ilId;
	}

	public void setIlId(Long ilId) {
		this.ilId = ilId;
	}

	public Long getIlceId() {
		return ilceId;
	}

	public void setIlceId(Long ilceId) {
		this.ilceId = ilceId;
	}

	public Long getKoyId() {
		return koyId;
	}

	public void setKoyId(Long koyId) {
		this.koyId = koyId;
	}

	public String getBeldeMevki() {
		return beldeMevki;
	}

	public void setBeldeMevki(String beldeMevki) {
		this.beldeMevki = beldeMevki;
	}

	public String getNeden() {
		return neden;
	}

	public void setNeden(String neden) {
		this.neden = neden;
	}

	public String getEnlem() {
		return enlem;
	}

	public void setEnlem(String enlem) {
		this.enlem = enlem;
	}

	public String getBoylam() {
		return boylam;
	}

	public void setBoylam(String boylam) {
		this.boylam = boylam;
	}

	public String getNedenAciklama() {
		return nedenAciklama;
	}

	public void setNedenAciklama(String nedenAciklama) {
		this.nedenAciklama = nedenAciklama;
	}

	public String getEtkiledigiYerler() {
		return etkiledigiYerler;
	}

	public void setEtkiledigiYerler(String etkiledigiYerler) {
		this.etkiledigiYerler = etkiledigiYerler;
	}

	public String getKaynak() {
		return kaynak;
	}

	public void setKaynak(String kaynak) {
		this.kaynak = kaynak;
	}

}
