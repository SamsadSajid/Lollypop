package com.example.shamsad.lollypop;

/**
 * Created by shamsad on 17-2-7.
 */

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


public class PrintMessages {
        public static void m(String message) {
            Log.d("Shamsad", "" + message);
        }

        public static void t(Context context, String message) {
            Toast.makeText(context, message + "", Toast.LENGTH_SHORT).show();
        }
        public static void T(Context context, String message) {
            Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
        }
}
