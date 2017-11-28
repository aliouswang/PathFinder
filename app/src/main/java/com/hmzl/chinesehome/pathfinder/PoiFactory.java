package com.hmzl.chinesehome.pathfinder;

import android.graphics.Point;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliouswang on 2017/11/28.
 */

public class PoiFactory {

    public static List<Poi> getPoiList() {
        return mockPoiList();
    }

    private static List<Poi> mockPoiList() {
        List<Poi> pois = new ArrayList<>();

        pois.add(new Poi(new Rect(10, 90, 90, 250), "德国门窗"));
        pois.add(new Poi(new Rect(10, 250, 90, 410), "诺维斯门窗"));

        pois.add(new Poi(new Rect(120, 30, 240, 110), "世豹门窗"));
        pois.add(new Poi(new Rect(240, 30, 360, 110), "普斯普利门窗"));
        pois.add(new Poi(new Rect(410, 30, 560,110), "门窗"));
        pois.add(new Poi(new Rect(560, 30, 690, 110), "奥朗斯门窗"));

        pois.add(new Poi(new Rect(140, 140, 220, 220), "门窗"));
        pois.add(new Poi(new Rect(220, 140, 340, 220), "读了博门窗"));
        pois.add(new Poi(new Rect(140, 220, 240, 300), "门窗"));
        pois.add(new Poi(new Rect(240, 220, 340, 300), "好易点晾衣架"));

        pois.add(new Poi(new Rect(410, 140, 620, 210), "木门"));
        pois.add(new Poi(new Rect(410, 210, 480, 300), "松下"));
        pois.add(new Poi(new Rect(480, 210, 550, 300), "开关"));
        pois.add(new Poi(new Rect(550, 210, 620, 300), "电动窗帘"));

        pois.add(new Poi(new Rect(140, 330, 240, 400), "好太太"));
        pois.add(new Poi(new Rect(240, 330, 340, 400), "明日"));
        pois.add(new Poi(new Rect(140, 400, 200, 490), "飞利浦"));
        pois.add(new Poi(new Rect(200, 400, 250, 490), "净水"));
        pois.add(new Poi(new Rect(250, 400, 340, 490), "开能净水"));

        pois.add(new Poi(new Rect(410, 330, 620, 490), "欧普照明"));

        return pois;
    }

    public static List<Road> getRoadList() {
        List<Road> roadList = new ArrayList<>();
        roadList.add(new Road(new Point(120, 125), new Point(120, 490)));
        roadList.add(new Road(new Point(120, 125), new Point(680, 125)));
        roadList.add(new Road(new Point(370, 125), new Point(370, 490)));
        roadList.add(new Road(new Point(120, 315), new Point(680, 315)));
        return roadList;
    }


}
