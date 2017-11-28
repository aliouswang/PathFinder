package com.hmzl.chinesehome.pathfinder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

/**
 * Created by aliouswang on 2017/11/28.
 */

public class MapView extends View{

    private List<Poi> mPoiList;

    private Paint mFontPaint;
    private Paint mRedPaint;
    private Paint mRoadPaint;

    private List<Road> mRoadList;

    public MapView(Context context) {
        this(context, null);
    }

    public MapView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MapView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mRedPaint = PaintFactory.getDefaultRedPaint();
        mFontPaint = PaintFactory.getDefaultFontPaint();
        mRoadPaint = PaintFactory.getDefaultRoadPaint();

        mRoadList = PoiFactory.getRoadList();
    }

    public void setPoiList(List<Poi> poiList) {
        this.mPoiList = poiList;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPoiList(canvas);
    }

    private void drawPoiList(Canvas canvas) {
        if (mPoiList == null || mPoiList.isEmpty()) return;
        for (Poi poi : mPoiList) {
            canvas.drawRect(poi.getRect(), mRedPaint);
            canvas.drawText(poi.getName(), poi.getRect().left + 20, poi.getRect().top + 50, mFontPaint);
        }

        for (Road road : mRoadList) {
            canvas.drawLine(road.getStart().x, road.getStart().y,
                    road.getEnd().x, road.getEnd().y, mRoadPaint);
        }
    }
}
