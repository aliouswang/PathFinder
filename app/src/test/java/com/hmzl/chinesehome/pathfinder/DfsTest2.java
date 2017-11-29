package com.hmzl.chinesehome.pathfinder;

import java.util.Arrays;

/**
 * "http://blog.csdn.net/xiaojimanman/article/details/50889670"
 * Created by aliouswang on 2017/11/29.
 */

public class DfsTest2 {

    private int n;
    private int[] a;
    private int[] book;

    public DfsTest2(int n) {
        this.n = n;
        a = new int[n];
        book = new int[n];
    }

    public void dfs(int step) {
        if(step == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 0;i < n; i++) {
            if (book[i] == 0) {
                book[i] = 1;
                a[step] = i;
                dfs(step + 1);
                book[i] = 0;
            }
        }


    }

    public static void main(String[] args) {
        DfsTest2 dfsTest = new DfsTest2(3);
        dfsTest.dfs(0);
    }

}
