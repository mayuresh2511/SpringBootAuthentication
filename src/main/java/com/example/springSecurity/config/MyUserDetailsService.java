package com.example.springSecurity.config;

import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Users user = userRepository.findByUsername(username);

    if (user == null){
      System.out.println("User not found : " + username);
      throw new UsernameNotFoundException("Not found : " + username);
    }
    return new MyUserDetails(user);
  }
}
