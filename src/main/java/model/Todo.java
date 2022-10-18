package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

	// an enum values
	enum Status {
		NotStarted, Ongoing, NotGoing
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String description;
	private Long userId;
	private LocalDate createdTime;
	private LocalDate updatedTime;
	private Status status;

	// constructor without params
	public Todo() {

	}

	// constructor with params
	public Todo(String name, String description, Long userId, LocalDate createdTime, LocalDate updatedTime,
			Status status) {
		super();
		this.name = name;
		this.description = description;
		this.userId = userId;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.status = status;
	}

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDate getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDate createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDate getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(LocalDate updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// public toString method  
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", userId=" + userId
				+ ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", status=" + status + "]";
	}

}
