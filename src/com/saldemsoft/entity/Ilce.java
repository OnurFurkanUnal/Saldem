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
@Table(name = "ilce")
public class Ilce implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6372391568129550045L;
	private Long id;
	private String tanim;
	private Il il;

	@Id
	@SequenceGenerator(name = "seq_ilce", allocationSize = 1, sequenceName = "seq_ilce")
	@GeneratedValue(generator = "seq_ilce", strategy = GenerationType.SEQUENCE)
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
	@JoinColumn(name = "il_id")
	public Il getIl() {
		return il;
	}

	public void setIl(Il il) {
		this.il = il;
	}
}
