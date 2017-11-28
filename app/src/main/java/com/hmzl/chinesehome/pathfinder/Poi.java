package com.hmzl.chinesehome.pathfinder;

import android.graphics.Rect;

/**
 * Created by aliouswang on 2017/11/28.
 */

public class Poi {

    private Rect rect;
    private String name;
    private String id;

    public Poi() {}

    public Poi(Rect rect, String name) {
        this.rect = rect;
        this.name = name;
    }

    public Rect getRect() {
        return rect;
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
