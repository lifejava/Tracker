package ru.lifejava.start;

import ru.lifejava.models.*;

public class StartUI {
  public static void main(String[] args) {

    Tracker tracker = new Tracker();
    tracker.add(new Task("first task", "first desc", "коментарий", 22));
    tracker.edit("Bagbag", "fd", "измененый");
    tracker.add(new Bug("нет сигнали", "потеря сигнала", "коментарий", 24));
    tracker.add(new Bug("сбой", "сбой в системе", "коментарий", 36));
    tracker.add(new Bug("темный экран", "пропажа изображения", "коментарий", 24));
    tracker.add(new Task("first task", "first desc", "коментарий", 27));
    //tracker.delete(1);


    for (Item item : tracker.getAll()) {
      System.out.printf("Имя: %s. Описание: %s. Коментарий: %s. Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getComment(), item.getCreate(), item.getId());
    }
    System.out.println("------------------------Сортируем по дате--------------------");
    for (Item item : tracker.filter()) {
      System.out.printf("Имя: %s. Описание: %s. Коментарий: %s. Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getComment(), item.getCreate(), item.getId());
    }

  }
}