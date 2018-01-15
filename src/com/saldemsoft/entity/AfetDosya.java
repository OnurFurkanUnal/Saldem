package com.saldemsoft.entity;

import java.io.Serializable;

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
@Table(name = "afet_dosya")
public class AfetDosya implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2344290600375970490L;
	private Long id;
	private Afet afet;
	private String dosyaAdi;
	private byte[] dosya;

	@Id
	@SequenceGenerator(name = "seq_afet_dosya", allocationSize = 1, sequenceName = "seq_afet_dosya")
	@GeneratedValue(generator = "seq_afet_dosya", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="afet_id")
	public Afet getAfet() {
		return afet;
	}
	
	public void setAfet(Afet afet) {
		this.afet = afet;
	}

	@Column(name = "dosya_adi", length = 500)
	public String getDosyaAdi() {
		return dosyaAdi;
	}

	public void setDosyaAdi(String dosyaAdi) {
		this.dosyaAdi = dosyaAdi;
	}

	@Column(name = "dosya")
	public byte[] getDosya() {
		return dosya;
	}

	public void setDosya(byte[] dosya) {
		this.dosya = dosya;
	}

}
