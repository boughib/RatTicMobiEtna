package com.example.belka.ratticmobietna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import java.io.InputStream;

/**
 * Created by belka on 16/09/2016.
 */

public class Img extends AsyncTask<String, Void, Bitmap> {
    ImageView Pic;

    public Img(ImageView Pic) {
        this.Pic = Pic;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        Pic.setImageBitmap(result);
    }
}
