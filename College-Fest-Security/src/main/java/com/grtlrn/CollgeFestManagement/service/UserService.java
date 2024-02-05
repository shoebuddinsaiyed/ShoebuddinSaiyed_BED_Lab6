package com.grtlrn.CollgeFestManagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.grtlrn.CollgeFestManagement.DTO.SignUpDto;
import com.grtlrn.CollgeFestManagement.Entity.User;

public interface UserService extends UserDetailsService {
	public User save(SignUpDto signUpDto);

}
