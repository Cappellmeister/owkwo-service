package de.owkwo.model.posts;

import java.util.ArrayList;
import java.util.Date;

import de.owkwo.model.profile.User;

/**
 * @author Jeffrey Groneberg A Post in the WkW-timeline
 * 
 */
public class NewsPost {

	private String id;
	private User author;
	private Date postDate;
	private String message;

	public NewsPost(String id, User author, Date postDate, String message) {
		super();
		this.id = id;
		this.author = author;
		this.postDate = postDate;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostDate() {
		return postDate;
	}

}