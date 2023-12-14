package com.example.imsp.module1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class BallsView extends View {
    final int N = 30;
    //    float[][] arrBalls = new float[N][3];
//    float[] arrX = new float[N];
//    float[] arrY = new float[N];
    float[] arrcolor = new float[N];
    float[] vX = new float[N];
    float[] vY = new float[N];
    float[] r = new float[N];
    float[][] coords = new float[N][2];

    public BallsView(Context context) {
        super(context);
//        fillArr(arrX, 0, 1000);
//        fillArr(arrY, 0, 1800);

        fillArr2(coords, 0, 1000, 0, 1800);
        fillArr(arrcolor, -1000000, 0);
        fillArr(vX, -10, 10);
        fillArr(vY, -10, 10);
        fillArr(r, 10, 50);

//        for (int i = 0; i < N; i++) {
//            arrX[i] = (float) Math.random() * 1200;
//            arrY[i] = (float) Math.random() * 2000;
//            arrcolor[i] = (float) Math.random() * 2000000 - 1000000;
//            vX[i] = (float) Math.random() * 20 - 10;
//            vY[i] = (float) Math.random() * 20 - 10;
//            r[i] = (float) Math.random() * 50 + 10;
//
//        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        for (int i = 0; i < N; i++) {
            paint.setColor((int) arrcolor[i]);
            canvas.drawCircle(coords[i][0], coords[i][1], r[i], paint);
        }
        move(canvas.getWidth(), canvas.getHeight());
        invalidate();

    }

    void move(float x, float y) {
        for (int i = 0; i < N; i++) {
            if (coords[i][0] >= x) {
                vX[i] = -vX[i];
            } else if (coords[i][0] <= 0) {
                vX[i] = -vX[i];
            }
            if (coords[i][1] >= y) {
                vY[i] = -vY[i];
            } else if (coords[i][1] <= 0) {
                vY[i] = -vY[i];
            }
            coords[i][0] += vX[i];
            coords[i][1] += vY[i];

        }

    }

    public static void fillArr(float[] arr, float min, float max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) rand(min, max);
        }

    }

    public static void fillArr2(float[][] arr, float min1, float max1, float min2, float max2) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = (float) (float) rand(min1, max1);
            arr[i][1] = (float) (float) rand(min2, max2);


        }
    }

    public static double rand(float min, float max) {
        return (Math.random() * (max - min + 1)) + min;

    }

}
