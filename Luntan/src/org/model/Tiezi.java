package org.model;

import java.sql.Timestamp;

/**
 * Tiezi entity. @author MyEclipse Persistence Tools
 */

public class Tiezi implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private Timestamp date;
	private String title;
	private String content;

	// Constructors

	/** default constructor */
	public Tiezi() {
	}

	/** full constructor */
	public Tiezi(Integer id, String username, Timestamp date, String title,
			String content) {
		this.id = id;
		this.username = username;
		this.date = date;
		this.title = title;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}