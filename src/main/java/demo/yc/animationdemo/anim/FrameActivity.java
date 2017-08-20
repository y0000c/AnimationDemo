package demo.yc.animationdemo.anim;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import demo.yc.animationdemo.R;

public class FrameActivity extends AppCompatActivity
{


    AnimationDrawable drawable1 ;
    AnimationDrawable drawable2 ;

    ImageView imageView1;
    ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        // 利用xml定义文件来创建帧动画
        drawable1 = (AnimationDrawable) getResources().getDrawable(R.drawable.frame1);
        imageView1.setBackground(drawable1);


        // 直接利用java代码来创建帧动画
        drawable2 = new AnimationDrawable();
        drawable2.addFrame(getResources().getDrawable(R.drawable.ring2),1000);
        drawable2.addFrame(getResources().getDrawable(R.drawable.ring3),1000);
        drawable2.addFrame(getResources().getDrawable(R.drawable.ring4),1000);
        drawable2.addFrame(getResources().getDrawable(R.drawable.ring5),1000);
        imageView2.setBackground(drawable2);
    }

    public void start(View view)
    {
        if(drawable1 != null && !drawable1.isRunning())
            drawable1.start();

        if(drawable2 != null && !drawable2.isRunning())
            drawable2.start();
    }

    public void stop(View view)
    {
        if(drawable2 != null && drawable2.isRunning())
            drawable2.stop();

        if(drawable1 != null && drawable1.isRunning())
            drawable1.stop();
    }
}
