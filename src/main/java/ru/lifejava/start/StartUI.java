package ru.lifejava.start;

import ru.lifejava.models.*;

public class StartUI {
  public static void main(String[] args) {

    Tracker tracker = new Tracker(20);
    tracker.add(0, new Task("first task", "first desc", "коментарий", 22));
    //tracker.edit("Bagbag", "fd", "измененый");
    tracker.add(1, new Bug("нет сигнали", "потеря сигнала", "коментарий", 24));
    tracker.add(2, new Bug("сбой", "сбой в системе", "коментарий", 36));
    tracker.add(3, new Bug("темный экран", "пропажа изображения", "коментарий", 24));
    tracker.add(4, new Task("first task", "first desc", "коментарий", 27));
    //tracker.delete(1);

    System.out.println(tracker.findById("1")); //Поиск по id
    
    
    for (Item item : tracker.getAll()) {
      if(item != null) {
	 System.out.printf("Имя: %s. Описание: %s. Коментарий: %s. Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getComment(), item.getCreate(), item.getId());
      }
    }/*
    System.out.println("------------------------Сортируем по дате--------------------");
    for (Item item : tracker.filter()) {
      System.out.printf("Имя: %s. Описание: %s. Коментарий: %s. Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getComment(), item.getCreate(), item.getId());
    }*/

  }
}