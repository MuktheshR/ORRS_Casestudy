package com.RailwayUserManagenet.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.mongodb.lang.NonNull;

@Document(collection = "userSignUpDetails")
public class UserSignUp {
	
	 @Transient
	    public static final String SEQUENCE_NAME = "userId_sequence";

	@org.springframework.data.annotation.Id
//	 @GeneratedValue(strategy=GenerationType.AUTO)
	private String Id;
	private String emailId;
	private Long contact;
	private String username;
	
    @NonNull
	@NotBlank(message = "New password is mandatory")
	private String password;
	

	@NonNull
	@NotBlank(message = "Confirm Password is mandatory")
	private String confirmpassword;
	
	
	
	

	public UserSignUp(String id, String emailId, Long contact, String username, String password,
			String confirmpassword) {
		super();
		Id = id;
		this.emailId = emailId;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public UserSignUp() {
		super();
	}

	


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "UserSignUp [Id=" + Id + ", emailId=" + emailId + ", contact=" + contact + ", username=" + username
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}

}