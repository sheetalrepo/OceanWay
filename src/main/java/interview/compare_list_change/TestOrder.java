package interview.compare_list_change;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOrder {

	//@Test
	public void testWithDiffSize() {
		List<Order> actualList = new ArrayList<>();
		actualList.add(new Order(10L, 100.00, "INR"));
		actualList.add(new Order(10L, 100.00, "INR"));
		actualList.add(new Order(20L, 200.00, "USD"));
		Assert.assertFalse(OrderChecker.isOrderChanged(actualList));
	}

	//matchAll test
	//@Test
	public void testWithSameElement() {
		List<Order> actualList = new ArrayList<>();
		actualList.add(new Order(10L, 100.00, "INR"));
		actualList.add(new Order(20L, 200.00, "USD"));
		Assert.assertTrue(OrderChecker.isOrderChanged(actualList));
	}

	//matchNone
	//@Test
	public void testNoneMatch() {
		List<Order> actualList = new ArrayList<>();
		actualList.add(new Order(40L, 400.00, "INR"));
		actualList.add(new Order(50L, 500.00, "AED"));
		Assert.assertTrue(OrderChecker.isOrderChanged(actualList));
	}

	

	//matchAnyOne
	//@Test
	public void testAnyOne() {
		List<Order> actualList = new ArrayList<>();
		actualList.add(new Order(10L, 100.00, "INR"));
		actualList.add(new Order(30L, 300.00, "USD"));
		Assert.assertTrue(OrderChecker.isOrderChanged(actualList));
	}
	

}
