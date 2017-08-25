package buycart;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class BuyCart {

//	private Item[] items; 
	private List<Item> items=new ArrayList<Item>();

	
	
	
//	public Item[] getItems() {
//		return items;
//	}
//	
//	public void setItems(Item[] items) {
//		this.items = items;
//	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	//
//	public void handler() {
//		for (int i = 0; i < items.length-1; i++) {
//			if(items[i].equals(items[i+1])) {
//				items[i].setAmount(items[i].getAmount()+items[i+1].getAmount()); // 6+1
//				items[i+1] = null;
//				//裁剪数组
//				items = ArrayUtils.subarray(items, 0, items.length-1);
//			}
//		}
//	}
	
	
	public void addItems(Item items) {
		if(this.items.contains(items)) {
			for (Item i : this.items) {
				if(i.equals(items)) {
					i.setAmount(i.getAmount()+items.getAmount());
				}
			}
		}
		else {
			this.items.add(items);
		}
		
	}

	public void showBuyCart() {
		double totalPrice=0;

		for (Item item : items) {
			System.out.println(item);
			totalPrice+=item.getAmount()*item.getProduct().getPrice();
		}
		System.out.println("总价："+totalPrice);
		

	}

}
