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

        ColorPickerDialog dialog = new ColorPickerDialog(this,new int[]{Color.YELLOW
                ,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.CYAN,Color.RED,Color.DKGRAY,
                Color.LTGRAY,Color.MAGENTA,Color.rgb(100,22,33),Color.rgb(82,182,2),
                Color.rgb(122,32,12),Color.rgb(82,12,2),Color.rgb(89,23,200),Color.rgb(13,222,23),
                Color.rgb(222,22,2),Color.rgb(2,22,222)

        }).setOnColorChangedListener(new OnColorChangedListener() {
            @Override
            public void onColorChanged(int newColor) {
                Toast.makeText(getApplicationContext(),"Color "+newColor,Toast.LENGTH_SHORT).show();
            }
        }).setDismissAfterClick(false).build(6).show()
          .setCheckedColor(Color.BLACK);
    }
}
