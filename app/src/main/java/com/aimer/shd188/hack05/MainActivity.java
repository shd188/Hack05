package com.aimer.shd188.hack05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        TextSwitcher textSwitcher= (TextSwitcher) findViewById(R.id.textSwitcher);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView=new TextView(MainActivity.this);
                textView.setGravity(Gravity.CENTER);
                textView.setText(R.string.hello_world);
                return textView;
            }
        });

        textSwitcher.setInAnimation(in);
        textSwitcher.setOutAnimation(out);
    }


}
