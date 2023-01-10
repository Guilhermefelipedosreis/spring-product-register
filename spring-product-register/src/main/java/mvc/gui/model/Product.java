package mvc.gui.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nameProduct;
	
	private BigDecimal amountNegotiated;
	private LocalDate dateOfDelivery;
	private String urlProduct;
	private String urlImage;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nomeProduto) {
		this.nameProduct = nomeProduto;
	}
	public BigDecimal getAmountNegotiated() {
		return amountNegotiated;
	}
	public void setAmountNegotiated(BigDecimal valorNegociado) {
		this.amountNegotiated = valorNegociado;
	}
	public LocalDate getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(LocalDate dataDaEntrega) {
		this.dateOfDelivery = dataDaEntrega;
	}
	public String getUrlProduct() {
		return urlProduct;
	}
	public void setUrlProduct(String urlProduto) {
		this.urlProduct = urlProduto;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImagem) {
		this.urlImage = urlImagem;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descricao) {
		this.description = descricao;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
}
