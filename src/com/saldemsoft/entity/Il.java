package com.saldemsoft.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "il")
public class Il implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2583237001824790168L;
	private Long id;
	private String tanim;

	@Id
	@SequenceGenerator(name = "seq_il", allocationSize = 1, sequenceName = "seq_il")
	@GeneratedValue(generator = "seq_il", strategy = GenerationType.SEQUENCE)
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

}
