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
  
  public Item[] filter(long a, long b) {
    int k = 0;
    Item[] result = new Item[items.length];
    for(int i = 0; items[i] != null && i < items.length; i++) {
      if((items[i].getCreate() >= a) && (items[i].getCreate() <= b)) {
	result[k] = items[i];
	k++;
      }
    }
    return result;
  }
  
  public Item[] getAll() {
    return items;
  }
}

