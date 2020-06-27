package com.example.itproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="javaScript")
public class JavaScript {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="lnforLearn")
	private String lnforLearn;
	
	@Column(name="lnforPj")
	private String lnforPj;
	
	@Column(name="lnforUtube")
	private String lnforUtube;
	
	@Column(name="lnforFb")
	private String lnforFb;

	public JavaScript(String lnforLearn, String lnforPj, String lnforUtube, String lnforFb) {
		super();
		this.lnforLearn = lnforLearn;
		this.lnforPj = lnforPj;
		this.lnforUtube = lnforUtube;
		this.lnforFb = lnforFb;
	}

	public JavaScript() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLnforLearn() {
		return lnforLearn;
	}

	public void setLnforLearn(String lnforLearn) {
		this.lnforLearn = lnforLearn;
	}

	public String getLnforPj() {
		return lnforPj;
	}

	public void setLnforPj(String lnforPj) {
		this.lnforPj = lnforPj;
	}

	public String getLnforUtube() {
		return lnforUtube;
	}

	public void setLnforUtube(String lnforUtube) {
		this.lnforUtube = lnforUtube;
	}

	public String getLnforFb() {
		return lnforFb;
	}

	public void setLnforFb(String lnforFb) {
		this.lnforFb = lnforFb;
	}

	

	

}
