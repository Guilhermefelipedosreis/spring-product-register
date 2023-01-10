package mvc.gui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import mvc.gui.dto.RequestNewProduct;
import mvc.gui.model.Product;
import mvc.gui.repository.ProductRepository;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("form")
	public String form(RequestNewProduct request) {
		return "order/form";		
	}
	
	@PostMapping("newOrder")
	public String newOrder(@Valid RequestNewProduct request, BindingResult result) {
		
		if(result.hasErrors()) {
			return "order/form";
		}
		
		Product product = request.toProduct();
		productRepository.save(product);
		
		return "order/form";
	}
	
}
