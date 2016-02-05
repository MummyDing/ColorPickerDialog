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
                Color.WHITE,Color.LTGRAY,Color.MAGENTA,Color.TRANSPARENT
        }).setOnColorChangedListener(new OnColorChangedListener() {
            @Override
            public void onColorChanged(int newColor) {
                Toast.makeText(getApplicationContext(),"Color "+newColor,Toast.LENGTH_SHORT).show();
            }
        }).setDismissAfterClick(false).build(5).show()
          .setCheckedColor(Color.WHITE);
    }
}
