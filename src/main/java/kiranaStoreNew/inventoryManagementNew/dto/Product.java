package kiranaStoreNew.inventoryManagementNew.dto;

public class Product {
	private Integer pId;
	private String proName;
	private Integer proPrice;
	private Integer proAvailablity;
//	public Product(){}
	
	public Product(Integer pId, String proName, Integer proPrice, Integer proAvailablity) {
		super();
		this.pId = pId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proAvailablity = proAvailablity;
	}

	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Integer getProPrice() {
		return proPrice;
	}
	public void setProPrice(Integer proPrice) {
		this.proPrice = proPrice;
	}
	public Integer getProAvailablity() {
		return proAvailablity;
	}
	public void setProAvailablity(Integer proAvailablity) {
		this.proAvailablity = proAvailablity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", proName=" + proName + ", proPrice=" + proPrice + ", proAvailablity="
				+ proAvailablity + "]";
	}
	 
	 
	 
}