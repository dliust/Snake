package com.gamecodeschool.c17snake;

import android.graphics.Point;

public abstract class GameObject {
    private int size;
    private Point location;

    private void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    private void setLocation(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    abstract void spawn();
}
