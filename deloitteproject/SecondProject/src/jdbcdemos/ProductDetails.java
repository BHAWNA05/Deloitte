package jdbcdemos;

import java.util.Scanner;

public class ProductDetails {
	private int productId;
	private String productName;
	private int price;
	private int qoh;
	public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product id : "); productId= scanner.nextInt();
        System.out.println("Enter Product name : "); productName = scanner.next();
        System.out.println("Enter Product price : "); price = scanner.nextInt();
        System.out.println("Enter Product qoh: "); qoh = scanner.nextInt();
    }
	public void acceptOnly() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Product id to delete : "); productId= scanner1.nextInt();
	}
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qoh="
				+ qoh + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public ProductDetails(int productId, String productName, int price, int qoh) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qoh = qoh;
	}
	public ProductDetails() {
		// TODO Auto-generated constructor stub
	}
	
}
