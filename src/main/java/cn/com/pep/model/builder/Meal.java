package cn.com.pep.model.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0f;
		for (Item item : items) {
			cost += item.getCost();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.err.print("Item :" + item.name());
			System.err.print(", Packing :" + item.pack().packing());
			System.err.println(",Price :" + item.getCost());
		}
	}

}
