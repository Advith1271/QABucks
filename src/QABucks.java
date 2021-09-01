import java.util.ArrayList;

public class QABucks {

	static ArrayList<Orders> orders = new ArrayList<>();
	static ArrayList<Orders> ordersDone = new ArrayList<>();
	public QABucks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		addOrder("yes","small","none","none");

	}
	public static ArrayList<Orders> addOrder(String name,String size,String extras,String Drink) {
		Orders newOrder = new Orders();
		newOrder.name = name;
		newOrder.size = size;
		newOrder.drink = Drink;
		newOrder.extras = extras;
		orders.add(newOrder);
		return orders;
	}
	public static ArrayList<Orders> checkOrder(Orders order, String modify, String modification){
		if(!orders.contains(order)) {
			System.out.println("Order does not exist");
			return orders;
		}
		int index;
		index = orders.indexOf(order);
		
		if(modify == "name") {
			orders.get(index).name = modification;
		}else if(modify == "size") {
			orders.get(index).size = modification;
		}
		else if(modify == "drink") {
			orders.get(index).drink = modification;
		}
		else if(modify == "extras") {
			orders.get(index).extras = modification;
		}
		
		
		return orders;
	}
	public static ArrayList<Orders> removeOrder(Orders order){
		if(orders.contains(order))
			orders.remove(order);
		else 
			System.out.println("Order list does not contain that order");
		
		ordersDone.add(order);
		return orders;
	}
	public static void returnLength() {
		System.out.println(orders.size());
		System.out.println(ordersDone.size());
	}
	public static void clearList(String whichList) {
		if(whichList == "orders")
			orders.clear();
		else
			ordersDone.clear();
		
	}
}

class Orders{
	String name;
	String size;
	String drink;
	String extras;
	
}
