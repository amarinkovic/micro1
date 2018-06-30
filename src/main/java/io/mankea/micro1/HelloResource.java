package io.mankea.micro1;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/hello")
	public String hello() {
		return "[ " + LocalDateTime.now() +  " ] hello there!";
	}

}
