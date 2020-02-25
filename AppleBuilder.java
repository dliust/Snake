package com.gamecodeschool.c17snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class AppleBuilder implements IAppleBuilder {
    private Context context;
    private Point location = new Point();
    private Point spawnRange;
    private int size;
    private boolean good;

    AppleBuilder(Context context, Point sr, int s, boolean good) {
        this.context = context;
        this.spawnRange = sr;
        this.size = s;
        this.location.x = -10;
        this.good = good;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
    public void setSpawnRange(Point spawnRange) {
        this.spawnRange = spawnRange;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public Apple build() {
        return new Apple(context, spawnRange, size, good);
    }


}
