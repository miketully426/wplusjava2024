package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu
{

    private List<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public Menu(List<MenuItem> menuItems, LocalDate lastUpdated){
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public LocalDate getLastUpdated(){
        return this.lastUpdated;
    }

    public List<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    @Override
    public String toString(){
        String output = "Today's Menu \n";
        // Loop through each menu item
        for(MenuItem item: this.menuItems){
            // Use the toString method on the MenuItem to add the item to the output
            output += item + "\n";
        }
        // Add the last updated
        output += "Last updated: " + this.lastUpdated;
        return output;
    }
}
