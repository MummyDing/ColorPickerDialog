# ColorPickerDialog    *[JCenter](https://bintray.com/mummyding/maven/ColorPickerDialog/view)*   

A custom Dialog using for color picking.(Android Ice Cream Sandwich:API level 14)   

<img src="/ScreenShots/img3.png"/> 


##Download

- Gradle:

```java
dependencies {
    compile 'com.mummyding.view:colorpickerdialog:1.0.0'
}
```

- Download Directly

[colorpickerdialog-1.0.0.aar](https://dl.bintray.com/mummyding/maven/com/mummyding/view/colorpickerdialog/1.0.0/colorpickerdialog-1.0.0.aar)


##Usage

- Baisc Data

```java
// colors you want to add,colors must not be null!!!
        int [] colors = new int[]{Color.YELLOW,Color.BLACK,Color.BLUE,Color.GRAY,
                Color.GREEN,Color.CYAN,Color.RED,Color.DKGRAY, Color.LTGRAY,Color.MAGENTA,
                Color.rgb(100,22,33),Color.rgb(82,182,2), Color.rgb(122,32,12),Color.rgb(82,12,2),
                Color.rgb(89,23,200),Color.rgb(13,222,23), Color.rgb(222,22,2),Color.rgb(2,22,222)};
```
- Create Demo

```java
 ColorPickerDialog dialog =
                // Constructor,the first argv is Context,second one is the colors you want to add
                new ColorPickerDialog(this,colors)
                // Optional, if you want the dialog dismissed after picking,set it to true,otherwise
                 // false. default true
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
                 // build Dialog,argv means width count of Dialog,default value is 4 if you use build() 
                        // without argv
                .build(6)
                .show();

```

- Simple Usage
```java
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
```

##Screenshots

<img src="/ScreenShots/img1.png"/> 
<img src="/ScreenShots/img2.png"/> 
<img src="/ScreenShots/img3.png"/> 
<img src="/ScreenShots/img4.png"/> 
