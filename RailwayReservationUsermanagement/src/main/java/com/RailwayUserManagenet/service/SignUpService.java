package com.RailwayUserManagenet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.RailwayUserManagenet.Repository.UserSignUpRepository;
import com.RailwayUserManagenet.model.UserSignUp;

/**
 * This Class Is Used As A Service Where You Can
 *  Explicitly Execute Methods For Controllers
 */
@Service
public class SignUpService {
	/*** Autowired User SignUp Repository ***/
	@Autowired
	private UserSignUpRepository userSignUpRepository;
	
	
	  @Autowired
	 public SequenceGeneratorService sequenceGeneratorService;

	/*** Method For Adding Data ***/
	public String addUser(UserSignUp userSignUp) {
		
//		 userSignUp.setPassword(new BCryptPasswordEncoder().encode(userSignUp.getPassword()));
//		 userSignUp.setConfirmpassword(new BCryptPasswordEncoder().encode(userSignUp.getConfirmpassword()));
		 
		return (""+userSignUpRepository.save(userSignUp)+"");
	}

	/*** Method For Listing The Data ***/
	public List<UserSignUp> getuser() {
		List<UserSignUp> s = userSignUpRepository.findAll();
		return s;
	}
	/*
	 * public String getuser(String Id) { return
	 * (""+userSignUpRepository.findById(Id));
	 * 
	 * }
	 */

	/*** Method For Updating The Data ***/
	public void updateUser(String id, UserSignUp userSignUp) {
		userSignUpRepository.save(userSignUp);
	}

	/*** Method For Deleting The Data ***/
	public void deleteUser(String id) {
		userSignUpRepository.deleteById(id);
	}

}
