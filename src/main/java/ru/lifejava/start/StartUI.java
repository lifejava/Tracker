package ru.lifejava.start;

import ru.lifejava.models.*;

public class StartUI {
  public static void main(String[] args) {

    Tracker tracker = new Tracker(20);
    tracker.add(new Task("first task", "first desc", "коментарий"));
    //tracker.edit("Bagbag", "fd", "измененый");
    tracker.add(new Bug("нет сигнали", "потеря сигнала", "коментарий"));
    tracker.add(new Bug("сбой", "сбой в системе", "коментарий"));
    tracker.add(new Bug("темный экран", "пропажа изображения", "коментарий"));
    tracker.add(new Task("first task", "first desc", "коментарий"));
    //tracker.delete(1);

    
    
   /*
    for (Item item : tracker.filter(23, 28)) {
     if(item != null) {
      System.out.printf("Имя: %s. Описание: %s.  Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getCreate(), item.getId());  
     }
    }*/
    for (Item item : tracker.getAll()) {
      if(item != null) {
	 System.out.printf("Имя: %s. Описание: %s.  Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getCreate(), item.getId());
      }
    }
  }
}