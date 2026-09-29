package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
     
	@GetMapping("/hi")
	public String createServlet() {
		return "hello.jsp";
	}
}
