package ru.lifejava.models;

public class Item {
  private int id;
  public String name;
  public String description;
  public String comment;
  public long createDate;
  
  public String getName() {
    return this.name;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public long getCreate() {
    return this.createDate;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
}