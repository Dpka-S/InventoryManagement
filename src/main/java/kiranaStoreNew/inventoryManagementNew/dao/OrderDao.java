package kiranaStoreNew.inventoryManagementNew.dao;

import java.util.List;

import kiranaStoreNew.inventoryManagementNew.dto.Customer;
import kiranaStoreNew.inventoryManagementNew.dto.Order;

public interface OrderDao {
public Boolean add(Order ord);
	
	public Boolean update(Order ord);
	
	public Boolean delete(Integer orderId);
	
	public Order  searchById(Integer orderId);
	
	public List<Order> orderList();

}