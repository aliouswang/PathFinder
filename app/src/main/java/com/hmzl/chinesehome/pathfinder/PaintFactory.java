package com.hmzl.chinesehome.pathfinder;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by aliouswang on 2017/11/28.
 */

public class PaintFactory {

    public static Paint getDefaultRedPaint() {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public static Paint getDefaultFontPaint() {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setTextSize(16);
        return paint;
    }

    public static Paint getDefaultRoadPaint() {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        return paint;
    }

}
