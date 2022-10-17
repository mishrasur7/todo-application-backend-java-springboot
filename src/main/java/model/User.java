package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String email;
	private String password;

	@CreationTimestamp
	private LocalDate createdTime;

	@UpdateTimestamp
	private LocalDate updatedTime;

	@OneToMany
	private List<Todo> todolist;

	public User() {
	}

	public User(Long id, String email, String password, LocalDate createdTime, LocalDate updatedTime,
			List<Todo> todolist) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.todolist = todolist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<Todo> getTodolist() {
		return todolist;
	}

	public void setTodolist(List<Todo> todolist) {
		this.todolist = todolist;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + ", todolist=" + todolist + "]";
	}

}
