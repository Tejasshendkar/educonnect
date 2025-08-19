package com.tg.educonnect.courseservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tg.educonnect.courseservice.dto.UserDTO;

@FeignClient(name = "userservice")
public interface UserClient {
   
	  @GetMapping("user/{id}")
	  UserDTO getUserById(@PathVariable Long id);
}
