package com.arwrld.artwitter.ar;

import android.graphics.Bitmap;

import com.arwrld.artwitter.models.Status;

/**
 * Created by davidhodge on 1/26/18.
 */

public class ArPoint {
    private Status status;
    private Bitmap bitmap;

    public ArPoint(Status parseObject, Bitmap bitmap) {
        this.status = parseObject;
        this.bitmap = bitmap;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status parseObject) {
        this.status = parseObject;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
