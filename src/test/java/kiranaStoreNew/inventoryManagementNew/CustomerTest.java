package kiranaStoreNew.inventoryManagementNew;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import junit.framework.Assert;
import kiranaStoreNew.inventoryManagementNew.dao.CustomerDao;
import kiranaStoreNew.inventoryManagementNew.daoImpl.CustomerDaoImpl;
import kiranaStoreNew.inventoryManagementNew.dto.Customer;

//import junit.framework.Assert;

public class CustomerTest {
	
	//public Boolean add(Customer c);
	
	//public Boolean update(Customer c);
	
	//public Boolean delete(Integer cid);
	
	//public Customer searchById(Integer cid);
	
	//public List<Customer> customerList();
	
	CustomerDao customerdao;
	@Before
	public void setUp()
	{
		customerdao =new CustomerDaoImpl();
	}
	
//	@Test
	public void testAddCustomer()
	{
		Customer c=new Customer();
		c.setcAge(22);
		c.setcId(200);
		c.setcName("hai");
		c.setcPhone("98766");
		Assert.assertTrue(customerdao.add(c));
	}
	
	//@Test
	public void testSearchById()
	{
		Customer cust=customerdao.searchById(200);
		Customer cust1=customerdao.searchById(200);
		//Assert.assertNotNull(cust);
		//Assert.assertNull(cust);
		Assert.assertEquals(cust, cust1);
	}
	@Test
	
	public void testCustomerList()
	{
		Assert.assertTrue(customerdao.customerList().size()>0);
	}
	
	
	

}