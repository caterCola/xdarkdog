package com.xdarkdog.pojo;

import java.util.Date;

public class User {
	private int id;
	private String userkey;
	private String username;
	private String phone;
	private int gender;
	private String password;
	private Date first_time;
	private Date registration_time;
	private Date last_signin_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserkey() {
		return userkey;
	}
	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFirst_time() {
		return first_time;
	}
	public void setFirst_time(Date first_time) {
		this.first_time = first_time;
	}
	public Date getRegistration_time() {
		return registration_time;
	}
	public void setRegistration_time(Date registration_time) {
		this.registration_time = registration_time;
	}
	public Date getLast_signin_time() {
		return last_signin_time;
	}
	public void setLast_signin_time(Date last_signin_time) {
		this.last_signin_time = last_signin_time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((first_time == null) ? 0 : first_time.hashCode());
		result = prime * result + gender;
		result = prime * result + id;
		result = prime
				* result
				+ ((last_signin_time == null) ? 0 : last_signin_time.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime
				* result
				+ ((registration_time == null) ? 0 : registration_time
						.hashCode());
		result = prime * result + ((userkey == null) ? 0 : userkey.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (first_time == null) {
			if (other.first_time != null)
				return false;
		} else if (!first_time.equals(other.first_time))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (last_signin_time == null) {
			if (other.last_signin_time != null)
				return false;
		} else if (!last_signin_time.equals(other.last_signin_time))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (registration_time == null) {
			if (other.registration_time != null)
				return false;
		} else if (!registration_time.equals(other.registration_time))
			return false;
		if (userkey == null) {
			if (other.userkey != null)
				return false;
		} else if (!userkey.equals(other.userkey))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userkey=" + userkey + ", username="
				+ username + ", phone=" + phone + ", gender=" + gender
				+ ", password=" + password + ", first_time=" + first_time
				+ ", registration_time=" + registration_time
				+ ", last_signin_time=" + last_signin_time + "]";
	}
	
}
