package com.tg.educonnect.appointmentservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tg.educonnect.appointmentservice.dto.UserDTO;

@FeignClient(name = "userservice")
public interface UserClient {
	
	@GetMapping("user/{userId}")
	public UserDTO getUserById(@PathVariable Long userId);

}
