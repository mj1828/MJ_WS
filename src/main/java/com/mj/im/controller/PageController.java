package com.mj.im.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/socket")
	public String socket() {
		return "socket";
	}

	@GetMapping("/barrage")
	public String barrage() {
		return "barrage";
	}
}
