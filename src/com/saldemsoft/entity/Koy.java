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
@Table(name = "koy")
public class Koy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1969103920578958935L;
	private Long id;
	private String tanim;
	private Ilce ilce;

	@Id
	@SequenceGenerator(name = "seq_koy", allocationSize = 1, sequenceName = "seq_koy")
	@GeneratedValue(generator = "seq_koy", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "tanim", length = 100)
	public String getTanim() {
		return tanim;
	}

	public void setTanim(String tanim) {
		this.tanim = tanim;
	}

	@ManyToOne
	@JoinColumn(name = "ilce_id")
	public Ilce getIlce() {
		return ilce;
	}

	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}
}
