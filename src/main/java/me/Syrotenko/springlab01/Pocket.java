package me.Syrotenko.springlab01;

import me.Syrotenko.springlab01.items.Item;

public class Pocket {
    private Item item;
    private int height, width;

    public Pocket(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        if (height >= item.getHeight() && width >= item.getWidth()) {
            this.item = item;
        } else {
            throw new IllegalArgumentException("Item bigger than pocket");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
