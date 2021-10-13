package kiranaStoreNew.inventoryManagementNew.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import kiranaStoreNew.inventoryManagementNew.dao.OrderDao;
import kiranaStoreNew.inventoryManagementNew.dao.ProductDao;
import kiranaStoreNew.inventoryManagementNew.databaseConfig.DbConfig;
import kiranaStoreNew.inventoryManagementNew.dto.Order;
import kiranaStoreNew.inventoryManagementNew.dto.Product;

public class OrderDaoImpl implements OrderDao {
	//point 1
	//cal the total price and  grand total price for same customer 101
	//2 Television 2*25000=50000(total price)
	//3 mobile 3*15000=45000(total price)
	// total grand price 50000+45000= 95000
	
	//point 2
	//buying quantity must be minus from product availability
	//productavailabilty - orderquantity;
	
	DbConfig dbConfig;
	PreparedStatement stmt;
	private ProductDao productDao;
	public OrderDaoImpl()
	{
		dbConfig = DbConfig.getDbConfig(); 
		productDao=new ProductDaoImpl();
		
	}
	
	public Boolean add(Order ord) {
		try
		{
			//stmt = dbConfig.getCon().
		stmt = dbConfig.getCon().prepareStatement("INSERT into ordertable(orderId,empId,cid,pID,orderQuantity,orderDate,totalPrice)VALUES(?,?,?,?,?,?,?,?);");
		
		Integer orderId=ord.getOrderId();
		Integer empId=ord.getEmpId();
		Integer cid=ord.getCid();
		Integer pID=ord.getpId();
		Integer orderQuantity=ord.getOrderQuantity();
		//Date date = new Date();
		//Timestamp orderDate=new Timestamp(new Date().getTime());
		Timestamp instant= Timestamp.from(Instant.now());  
		Integer totalPrice=ord.getTotalPrice();
		
		Product product=productDao.searchById(pID);
		if(product.getProAvailablity()<orderQuantity)
		{
			throw new ArithmeticException("We dont have enough quantity of "+ product.getProName()+" . We have only "+ product.getProAvailablity());
		}
		if(totalPrice <=0 || totalPrice==null)
		{
			throw new NullPointerException("You must buy atleast one product");
		}
		
		stmt.setInt(1, orderId);
		stmt.setInt(2, empId);
		stmt.setInt(3, cid);
		stmt.setInt(4, pID);
		stmt.setInt(5, orderQuantity);
		stmt.setTimestamp(6, instant);
		stmt.setInt(7, totalPrice);
		
		int rowAffected=stmt.executeUpdate();
		return true;
		
		}
		catch(SQLException | ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}	
	}

	public Boolean update(Order ord) 
	{
		return null;
	}

	@Override
	public List<Order> orderList() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order searchById(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}