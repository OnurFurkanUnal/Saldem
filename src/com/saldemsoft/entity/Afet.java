package com.saldemsoft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "afet")
public class Afet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4533314758071088091L;
	private Long id;
	private String seriNo;
	private Date baslamaTarihi;
	private Date bitisTarihi;
	private Integer sureGun;
	private Il il;
	private Ilce ilce;
	private Koy koy;
	private String beldeMevki;
	private String neden;
	private String enlem;
	private String boylam;
	private String nedenAciklama;
	private String etkiledigiYerler;
	private String kaynak;

	@Id
	@SequenceGenerator(name = "seq_afet", allocationSize = 1, sequenceName = "seq_afet")
	@GeneratedValue(generator = "seq_afet", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "seri_no", length = 100)
	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	@Column(name = "baslama_tarihi")
	public Date getBaslamaTarihi() {
		return baslamaTarihi;
	}

	public void setBaslamaTarihi(Date baslamaTarihi) {
		this.baslamaTarihi = baslamaTarihi;
	}

	@Column(name = "bitis_tarihi")
	public Date getBitisTarihi() {
		return bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

	@Column(name = "sure")
	public Integer getSureGun() {
		return sureGun;
	}

	public void setSureGun(Integer sureGun) {
		this.sureGun = sureGun;
	}

	@ManyToOne
	@JoinColumn(name = "il_id")
	public Il getIl() {
		return il;
	}

	public void setIl(Il il) {
		this.il = il;
	}

	@ManyToOne
	@JoinColumn(name = "ilce_id")
	public Ilce getIlce() {
		return ilce;
	}

	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}

	@ManyToOne
	@JoinColumn(name = "koy_id")
	public Koy getKoy() {
		return koy;
	}

	public void setKoy(Koy koy) {
		this.koy = koy;
	}

	@Column(name = "belde_mevki", length = 100)
	public String getBeldeMevki() {
		return beldeMevki;
	}

	public void setBeldeMevki(String beldeMevki) {
		this.beldeMevki = beldeMevki;
	}

	@Column(name = "neden", length = 500)
	public String getNeden() {
		return neden;
	}

	public void setNeden(String neden) {
		this.neden = neden;
	}

	@Column(name = "enlem", length = 50)
	public String getEnlem() {
		return enlem;
	}

	public void setEnlem(String enlem) {
		this.enlem = enlem;
	}

	@Column(name = "boylam")
	public String getBoylam() {
		return boylam;
	}

	public void setBoylam(String boylam) {
		this.boylam = boylam;
	}

	@Column(name = "neden_aciklama", length = 500)
	public String getNedenAciklama() {
		return nedenAciklama;
	}

	public void setNedenAciklama(String nedenAciklama) {
		this.nedenAciklama = nedenAciklama;
	}

	@Column(name = "etkilenen_yerler", length = 500)
	public String getEtkiledigiYerler() {
		return etkiledigiYerler;
	}

	public void setEtkiledigiYerler(String etkiledigiYerler) {
		this.etkiledigiYerler = etkiledigiYerler;
	}

	@Column(name = "kaynak", length = 500)
	public String getKaynak() {
		return kaynak;
	}

	public void setKaynak(String kaynak) {
		this.kaynak = kaynak;
	}

}
