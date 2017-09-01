package demo.yc.animationdemo.anim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import demo.yc.animationdemo.R;
import demo.yc.animationdemo.property.AnimatorSetActivity;
import demo.yc.animationdemo.property.ObjectAnimatorActivity;
import demo.yc.animationdemo.property.PathActivity;
import demo.yc.animationdemo.property.ValueAnimatorActivity;

public class PropertyActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
    }

    public void setClick(View view)
    {
        startActivity(new Intent(this, AnimatorSetActivity.class));
    }

    public void objectClick(View view)
    {
        startActivity(new Intent(this, ObjectAnimatorActivity.class));
    }

    public void valueClick(View view)
    {
        startActivity(new Intent(this, ValueAnimatorActivity.class));
    }

    public void pathClick(View view)
    {
        startActivity(new Intent(this, PathActivity.class));
    }


}
