package qa.com.main.function;

import java.util.ArrayList;
import java.util.List;

public class QAffee {
	public static List<String> orders = new ArrayList<>();
	public static void addOrder(String order) {
		System.out.println("Adding " + order + " to ArrayList");
		orders.add(order);
		
	}
	public static String returnOrder(int i) {
		System.out.println(orders.get(i-1));
		return orders.get(i-1);
	}
	public static void updateOrder(int i , String order) {
		String a=orders.get(i-1);
		orders.set(i-1, order);
		System.out.println("Order "+ a + " changed to "+ orders.get(i-1));
	}
	public static void deleteOrder(int i) {
		System.out.println("Removing " + orders.get(i-1));
		orders.remove(i-1);
		
	}
	public static void printOrder() {
		System.out.println(orders);
	}
	public static void clearOrder() {
		orders.clear();
	}
	
	
	
	

}
