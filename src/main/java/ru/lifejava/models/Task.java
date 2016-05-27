package ru.lifejava.models;

public class Task extends Item{

  public Task(String name, String description, String comment) {
    super();
    this.name = name;
    this.description = description;
    this.comment = comment; 
  }
  
  public String calculatePrice() {
    return "100%";
  }
}