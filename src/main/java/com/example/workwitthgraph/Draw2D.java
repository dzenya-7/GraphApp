package com.example.workwitthgraph;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

import androidx.constraintlayout.solver.widgets.Rectangle;


public class Draw2D extends View {
    public Draw2D(Context context) {
        super(context);
    }
    public Paint mPaint = new Paint();
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);
        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 900, 950, 0, mPaint);
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(35.0f);
        canvas.drawText("С новым годом", 100, 190, mPaint);
        // рисуем первую елку
        Rect myRect = new Rect();
        myRect.set(125,850,175,900);
        mPaint.setColor(Color.rgb(96,75,0));
        canvas.drawRect(myRect,mPaint);
        Path path = new Path();
        path.moveTo(150,750);
        path.lineTo(250,850);
        path.lineTo(50, 850);
        path.close();
        mPaint.setColor(Color.GREEN);
        canvas.drawPath(path,mPaint);
        path.moveTo(150, 670);
        path.lineTo(230, 760);
        path.lineTo(70, 760);
        path.close();
        canvas.drawPath(path,mPaint);
        mPaint.setColor(Color.WHITE);
        // рисуем снеговика
        canvas.drawCircle(450, 805, 100, mPaint);
        canvas.drawCircle(450, 630, 75, mPaint);
        canvas.drawCircle(450, 510, 50, mPaint);
        canvas.drawCircle(350, 630, 25, mPaint);
        canvas.drawCircle(550, 630, 25, mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(430, 490, 10, mPaint);
        canvas.drawCircle(470, 490, 10, mPaint);
        mPaint.setColor(Color.rgb(255,165,0));
        Path path1 = new Path();
        path1.moveTo(450, 490);
        path1.lineTo(450, 510);
        path1.lineTo(470, 500);
        path1.close();
        canvas.drawPath(path1,mPaint);
        Path path3 = new Path();
        path3.moveTo(430, 510);
        path3.quadTo(450, 525, 470, 510);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(path3, mPaint);
    }
}
