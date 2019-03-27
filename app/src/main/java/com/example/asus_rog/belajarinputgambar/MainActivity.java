package com.example.asus_rog.belajarinputgambar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import static android.graphics.Bitmap.Config.ARGB_8888;

public class MainActivity extends Activity {

    ImageView ourView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();

         setContentView(ourView);

    }

    public void draw(){


        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(600,600, ARGB_8888);
        Canvas canvas;
        canvas = new Canvas(blankBitmap);

        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();

        // Memberikan warna kanvas
        canvas.drawColor(Color.argb(15, 0, 255, 0));

        // Mengatur warna
        paint.setColor(Color.argb(100,  225, 80, 182));
        // We can change this around as well


        Bitmap bitmapGambar;
        // insialisasi gambar
        bitmapGambar = BitmapFactory.decodeResource(this.getResources(), R.drawable.bullet);
        // Posisi gambar
        canvas.drawBitmap(bitmapGambar, 10, 50, paint);

        // Membuat Garis
        canvas.drawLine(0,0,250,250,paint);

        // membuat Tulisan
        canvas.drawText("HAI EPAN!!!", 400, 400, paint);

        // membuat lingkaran
        canvas.drawCircle(600,10,100,paint);

        // mengubah warna
        paint.setColor(Color.argb(200,  150, 129, 69));

        // membuar kotak
        canvas.drawRect(0,550,500,600,paint);

        }
}
