package org.model;

import java.sql.Timestamp;

/**
 * Huifu entity. @author MyEclipse Persistence Tools
 */

public class Huifu implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tieid;
	private String username;
	private String content;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public Huifu() {
	}

	/** full constructor */
	public Huifu(Integer id, Integer tieid, String username, String content,
			Timestamp date) {
		this.id = id;
		this.tieid = tieid;
		this.username = username;
		this.content = content;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTieid() {
		return this.tieid;
	}

	public void setTieid(Integer tieid) {
		this.tieid = tieid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}