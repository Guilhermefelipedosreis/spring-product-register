package mvc.gui.dto;

import jakarta.validation.constraints.NotBlank;
import mvc.gui.model.OrderStatus;
import mvc.gui.model.Product;


public class RequestNewProduct {
	
	@NotBlank
	private String productName;
	
	@NotBlank
	private String urlProduct;

	@NotBlank
	private String productImage;
	private String productDescription;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUrlProduct() {
		return urlProduct;
	}
	public void setUrlProduct(String urfProduct) {
		this.urlProduct = urfProduct;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Product toProduct() {
		
		Product product = new Product();
		product.setNameProduct(productName);
		product.setUrlProduct(urlProduct);
		product.setUrlImage(productImage);
		product.setDescription(productDescription);
		product.setStatus(OrderStatus.WAITING);
		
		return product;
	}
	
	
	
}
