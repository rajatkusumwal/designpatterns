package com.data.inn.iteratorandcompositionpattern.iterator.domin;

public class MenuItem {

    String name;
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    boolean isVegetarian;

    public MenuItem(String name, String description, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }
}
