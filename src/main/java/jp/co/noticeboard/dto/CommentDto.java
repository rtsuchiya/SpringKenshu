package jp.co.noticeboard.dto;

import java.sql.Date;

public class CommentDto {
	private Integer id;
	private Integer userId;
	private Integer messageId;
	private String text;
	private Date createdAt;

	public CommentDto(Integer id, Integer userId, Integer messageId, String text, Date createdAt) {
		this.id = id;
		this.userId = userId;
		this.messageId = messageId;
		this.text = text;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
