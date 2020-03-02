package com.gamecodeschool.c17snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public interface IAppleBuilder {
    public void setSpawnRange(Point spawnRange);
    public void setLocation(Point location);
    public void setSize(int size);
    public void setGood(boolean good);
}
