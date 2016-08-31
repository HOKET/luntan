package org.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private Integer power;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String password, Integer power) {
		this.username = username;
		this.password = password;
		this.power = power;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPower() {
		return this.power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

}