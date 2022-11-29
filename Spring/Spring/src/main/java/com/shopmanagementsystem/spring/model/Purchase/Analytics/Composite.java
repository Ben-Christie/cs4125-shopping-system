package com.shopmanagementsystem.spring.model.Purchase.Analytics;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String category;
    List<Component> components;

    public Composite(String category){
        components = new ArrayList<>();
        this.category = category;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public String showInfo() {
        String info = "";
        info += "\n------------\n"+ "Category: " + category + "\n------------\n";

        for(Component c : components){
            info += c.showInfo();
        }
        return info;
    }
}
