package ru.lifejava.models;

public class Bug extends Item {

  public Bug(String name, String description, String comment) {
    super();
    this.name = name;
    this.description = description;
    this.comment = comment;
  }
  
  public String calculatePrice() {
    return "70%";
  }
}