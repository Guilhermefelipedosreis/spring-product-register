package mvc.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "world");
		return "hello";
	}
	
	
}
