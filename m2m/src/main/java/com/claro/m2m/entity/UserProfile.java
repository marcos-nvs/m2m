package com.claro.m2m.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserProfile")
public class UserProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="idProfile")
	private Integer idProfile;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idProfile == null) ? 0 : idProfile.hashCode());
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
		UserProfile other = (UserProfile) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idProfile == null) {
			if (other.idProfile != null)
				return false;
		} else if (!idProfile.equals(other.idProfile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserProfile [email=" + email + ", idProfile=" + idProfile + "]";
	}
	
}
