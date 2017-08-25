package buycart;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		
		RecInfo rec1 = new RecInfo(1, "致馨公寓", "保安-jack", true);
		RecInfo rec2 = new RecInfo(1, "neusoft大厦", "保安队长-boss", false);
		RecInfo[] infos = { rec1 , rec2 };
		
		c1.setRecInfos(infos);
		
		Item item01 = new Item(p1 , 2 );
		Item item02 = new Item(p2 , 6 );
		Item item03 = new Item(p2 , 1);
		
//		Item[] items = { item01 , item02 , item03};
		
		BuyCart cart = new BuyCart();
		cart.addItems(item01);
		cart.addItems(item02);
		cart.addItems(item03);
		
//		cart.setItems(items);
		
		//做处理  , 　多余的让其加数量　　　减少项
//		cart.handler();
		
		//////////////////////
		//查看购物车
		cart.showBuyCart();
		
		////////////////////
		//生成订单
		Orders order=new Orders("1",null,rec1,cart);
		order.showOrders();
		
		
		
	}
	

}
