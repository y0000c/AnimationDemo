package demo.yc.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import demo.yc.animationdemo.anim.FrameActivity;
import demo.yc.animationdemo.anim.PropertyActivity;
import demo.yc.animationdemo.anim.TweenActivity;
import demo.yc.animationdemo.interpolator.InterpolatorActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frameClick(View view)
    {
        startActivity(new Intent(this,FrameActivity.class));
    }

    public void tweenClick(View view)
    {
        startActivity(new Intent(this,TweenActivity.class));
    }

    public void propertyClick(View view)
    {
        startActivity(new Intent(this,PropertyActivity.class));
    }

    public void interpolatorClick(View view)
    {
        startActivity(new Intent(this,InterpolatorActivity.class));
    }

    public void rippleClick(View view)
    {
        startActivity(new Intent(this,RippleActivity.class));
    }

}
