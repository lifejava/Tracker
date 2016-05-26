package ru.lifejava.models;
import java.util.*;

public class Tracker {
  private Item[] items;
  private static int id = 0;
  
  public Tracker (int size){
    this.items = new Item[size];
  }
  
  public String generateId() {
    id++;
    return (String.valueOf(id));
  }

  public void add(int index, Item item) {
    item.setId(generateId());
    this.items[index] = item;
  }
  
  public void delete(int index) {
    this.items[index] = null;
  }
  
  public void edit(String id) {
    Item i = this.findById(id);
  }

  public Item findById(String id) {
    for (int i = 0; i < items.length; i++) {
      if(items[i] != null) {
	String s = items[i].getId();
	if(s.equals(id)) {
	  return items[i];
	}
      }
    }
    return null;
  }
  
  /*
  public Item[] filter() {
    Item[] result = new Item[position];

    for (int i = 0; i < result.length; i++) {
        result[i] = this.items[i];
    }

    for (int i = result.length - 1; i > 0; i--) {
      for ( int j = 0; j < i; j++) {
        if (result[j].getCreate() > result[j+1].getCreate()) {
            Item swap = result[j];
            result[j] = result[j + 1];
            result[j + 1] = swap;
        }
      }
    }
    return result;
  }

}*/
  public Item[] getAll() {
    return items;
  }
}

