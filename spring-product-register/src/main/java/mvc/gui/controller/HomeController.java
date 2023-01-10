package mvc.gui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.gui.model.OrderStatus;
import mvc.gui.model.Product;
import mvc.gui.repository.ProductRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public String home(Model model) {
		
		List<Product> product = productRepository.findAll();
		model.addAttribute("orders", product);
		
		return "home";
	}
	
	@GetMapping("/{status}")
	public String waiting(@PathVariable("status") String status, Model model) {
		
		List<Product> product = productRepository.findByStatus(OrderStatus.valueOf(status.toUpperCase()));
		model.addAttribute("orders", product);
		model.addAttribute("status", status);
		
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
	
}
