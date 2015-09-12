package com.example.jrwong.androiddemos.demo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jrwong.androiddemos.R;

public class Demo3Activity extends AppCompatActivity {


    private Button moveButton;
    private Button rotateButton;
    private Button bigButton;
    private ImageView target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);
        init();
    }

    private void init() {
        moveButton   = (Button) findViewById(R.id.move_button);
        rotateButton = (Button) findViewById(R.id.rotate_button);
        bigButton    = (Button) findViewById(R.id.big_button);

        target = (ImageView) findViewById(R.id.target_view);

        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 初始化一个动画组
                AnimationSet animationSet = new AnimationSet(true);

                // 设置动画变化属性
                AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0.5f);
                alphaAnimation.setDuration(250);
                // 把动画添加到动画组
                animationSet.addAnimation(alphaAnimation);

                TranslateAnimation translateAnimation = new TranslateAnimation(Animation.ABSOLUTE, target.getX(), Animation.ABSOLUTE, 100.0f, Animation.ABSOLUTE, target.getY(), Animation.ABSOLUTE, 100.0f);
                animationSet.addAnimation(translateAnimation);
                translateAnimation.setDuration(250);

                // 开始执行动画
                target.startAnimation(animationSet);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demo3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
