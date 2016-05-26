package ru.lifejava.models;
import java.util.*;

public class Tracker {
  private Item[] items = new Item[10];
  private int position = 0;
  private static final Random RN = new Random();

  String generateId() {
    return String.valueOf(System.currentTimeMillis() + RN.nextInt());
  }

  public Item add(Item item) {
    item.setId(this.generateId());
    this.items[position++] = item;
    return item;
  }

  public void edit(String name, String description, String comment) {
    this.items[position - 1].name = name;
    this.items[position - 1].description = description;
    this.items[position - 1].comment = comment;
  }
  public void delete(int del) {
    items[del] = null;
  }

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

  protected Item findById(String id) {
    Item result = null;
    for (Item item : items) {
      if(item != null && item.getId().equals(id)) {
        result = item;
        break;
      }
    }
    return result;
  }

  public Item[] getAll() {
    return items;
  }
}

