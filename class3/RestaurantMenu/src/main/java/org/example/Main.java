package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem item = new MenuItem("Pasta", 4.33, "asadfas", "dessert");
        MenuItem item2 = new MenuItem("Pizza", 4.33, "asadfas", "dessert");
        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(item);
        menuItemList.add(item2);
        Menu menu = new Menu(menuItemList, LocalDate.now());
        System.out.println(menu);
    }
}