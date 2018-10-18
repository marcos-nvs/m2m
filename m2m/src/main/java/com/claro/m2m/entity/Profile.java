package com.claro.m2m.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Profile")
public class Profile implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name="seqProfile", sequenceName="seq_profile", allocationSize= 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProfile")
	@Column(name="id")
	private Integer id;
	
	@Column(name="idRole")
	private Integer idRole;
	
	@Column(name="email")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created")
	private Date created;
	
	@Temporal(TemporalType.DATE)
	@Column(name="initialDate")
	private Date initialDate;

	@Temporal(TemporalType.DATE)
	@Column(name="finalDate")
	private Date finalDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idRole == null) ? 0 : idRole.hashCode());
		result = prime * result + ((initialDate == null) ? 0 : initialDate.hashCode());
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
		Profile other = (Profile) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (finalDate == null) {
			if (other.finalDate != null)
				return false;
		} else if (!finalDate.equals(other.finalDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idRole == null) {
			if (other.idRole != null)
				return false;
		} else if (!idRole.equals(other.idRole))
			return false;
		if (initialDate == null) {
			if (other.initialDate != null)
				return false;
		} else if (!initialDate.equals(other.initialDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", idRole=" + idRole + ", email=" + email + ", created=" + created
				+ ", initialDate=" + initialDate + ", finalDate=" + finalDate + "]";
	}
	

	
}
