package ru.lifejava.models;

public class Item {
  private String id;
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
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
}