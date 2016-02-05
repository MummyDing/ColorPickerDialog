package com.github.mummyding.colorpickerdialog;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // colors you want to add,colors must not be null!!!
        int [] colors = new int[]{Color.YELLOW,Color.BLACK,Color.BLUE,Color.GRAY,
                Color.GREEN,Color.CYAN,Color.RED,Color.DKGRAY, Color.LTGRAY,Color.MAGENTA,
                Color.rgb(100,22,33),Color.rgb(82,182,2), Color.rgb(122,32,12),Color.rgb(82,12,2),
                Color.rgb(89,23,200),Color.rgb(13,222,23), Color.rgb(222,22,2),Color.rgb(2,22,222)};


        /*ColorPickerDialog dialog =
                // Constructor,the first argv is Context,second one is the colors you want to add
                new ColorPickerDialog(this,colors)
                // Optional, if you want the dialog dismissed after picking,set it to true,otherwise false. default true
                .setDismissAfterClick(false)
                 // Optional, Dialog's title,default "Theme"
                .setTitle("Custom Theme")
                 //Optional, current checked color
                .setCheckedColor(Color.BLACK)
                .setOnColorChangedListener(new OnColorChangedListener() {
                    @Override
                    public void onColorChanged(int newColor) {
                        // do something here
                        Toast.makeText(getApplicationContext(),"Color "+newColor,Toast.LENGTH_SHORT).show();
                    }})
                 // build Dialog,argv means width count of Dialog,default value is 4 if you use build() without argv
                .build(6)
                .show();*/
        ColorPickerDialog dialog =
                // Constructor,the first argv is Context,second one is the colors you want to add
                new ColorPickerDialog(this,colors)
                        .setOnColorChangedListener(new OnColorChangedListener() {
                            @Override
                            public void onColorChanged(int newColor) {
                                // do something here
                                Toast.makeText(getApplicationContext(),"Color "+newColor,Toast.LENGTH_SHORT).show();
                            }})
                        .build()
                        .show();


    }
}
