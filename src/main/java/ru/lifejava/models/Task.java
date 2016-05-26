package ru.lifejava.models;

public class Task extends Item{

  public Task(String name, String description, String comment, long create) {
    this.name = name;
    this.description = description;
    this.comment = comment;
    this.createDate = create;  
  }
  
  public String calculatePrice() {
    return "100%";
  }
}