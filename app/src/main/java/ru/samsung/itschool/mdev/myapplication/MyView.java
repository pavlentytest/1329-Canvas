package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint pensil = new Paint();
        //pensil.setColor(Color.RED); // цвет маркера
        pensil.setStyle(Paint.Style.STROKE); // тип заливки
        pensil.setStrokeWidth(20);
        //pensil.setColor(Color.parseColor("#ff00ff"));
        pensil.setColor(Color.rgb(40,50,10));
        canvas.drawColor(Color.YELLOW); // цвет фона холста
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,300,pensil);
        pensil.setColor(Color.BLUE);
        canvas.drawRect(100,100,500,500,pensil);
        // CMYK

      //  Bitmap.createScaledBitmap()

        Path path = new Path();
        path.moveTo(600,600);
        path.lineTo(700,700);
        path.lineTo(500,600);
       // path.lineTo(600,600);
        pensil.setStyle(Paint.Style.FILL);
        canvas.drawPath(path,pensil);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.images);

        //canvas.drawBitmap(bitmap,0,0,pensil);

        canvas.rotate(45,200,200);
        pensil.setTextSize(150);
        canvas.drawText("Hello",50,100,pensil);
        canvas.rotate(-45,200,200);






    }
}
