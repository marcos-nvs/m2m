package com.claro.m2m.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="ProfileRole")
public class ProfileRole implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="seqProfileRole", sequenceName="seq_profilerole", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seqProfileRole")
	@Column(name="id")
	private Integer id;
	
	@Column(name="idRole")
	private Integer idRole;

	@Column(name="idProfile")
	private Integer idProfile;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Created")
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

	public Integer getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
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
		result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idProfile == null) ? 0 : idProfile.hashCode());
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
		ProfileRole other = (ProfileRole) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
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
		if (idProfile == null) {
			if (other.idProfile != null)
				return false;
		} else if (!idProfile.equals(other.idProfile))
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
		return "ProfileRole [id=" + id + ", idRole=" + idRole + ", idProfile=" + idProfile + ", created=" + created
				+ ", initialDate=" + initialDate + ", finalDate=" + finalDate + "]";
	}
	
}
