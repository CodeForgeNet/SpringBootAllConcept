package in.cfn.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		return "register";
	}
	
}
