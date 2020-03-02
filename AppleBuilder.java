package com.gamecodeschool.c17snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class AppleBuilder {
    private final Context context;
    private Point location = new Point();
    private Point spawnRange;
    private int size;
    private boolean good;

    AppleBuilder(Context context) {
        this.context = context;
    }

    AppleBuilder(Context context, Point sr, int s, boolean good) {
        this.context = context;
        this.spawnRange = sr;
        this.size = s;
        this.location.x = -10;
        this.good = good;
    }

    public AppleBuilder setLocation(Point location) {
        this.location = location;
        return this;
    }
    public AppleBuilder setSpawnRange(Point spawnRange) {
        this.spawnRange = spawnRange;
        return this;
    }

    public AppleBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public AppleBuilder setGood(boolean good) {
        this.good = good;
        return this;
    }

    public Apple build() {
        return new Apple(context, spawnRange, size, good);
    }


}
