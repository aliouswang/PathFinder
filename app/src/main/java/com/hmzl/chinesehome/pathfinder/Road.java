package com.hmzl.chinesehome.pathfinder;

import android.graphics.Point;

/**
 * Created by aliouswang on 2017/11/28.
 */

public class Road {

    private Point start;
    private Point end;

    public Road() {}

    public Road(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}
