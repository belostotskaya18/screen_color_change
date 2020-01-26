package com.example.a16jan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    Paint paint;

    public MyView(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
         canvas.drawPaint(paint);

    }
    protected void changeB (){paint.setColor(Color.BLUE);}
    protected void changeY (){paint.setColor(Color.YELLOW);}
}
