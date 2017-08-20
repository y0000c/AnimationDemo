package demo.yc.animationdemo.property;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.yc.animationdemo.R;

public class ObjectAnimatorActivity extends AppCompatActivity
{

    @BindView(R.id.objectView)
    ImageView objectView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.scale)
    public void onScaleClicked()
    {
        ObjectAnimator scale = ObjectAnimator.ofFloat(objectView, View.SCALE_X,1,2,3,2,1);
        scale.setDuration(1500);
        scale.start();
    }

    @OnClick(R.id.rotate)
    public void onRotateClicked()
    {
        ObjectAnimator rotate = ObjectAnimator.ofFloat(objectView,View.ROTATION,0,360,-180);
        rotate.setDuration(1500);
        rotate.start();
    }

    @OnClick(R.id.translate)
    public void onTranslateClicked()
    {
        ObjectAnimator animator = ObjectAnimator.ofFloat(objectView,
                View.Y,0,100,200);
        animator.setDuration(1500);
        animator.start();
    }

    @OnClick(R.id.alpha)
    public void onAlphaClicked()
    {
        ObjectAnimator animator = ObjectAnimator.ofFloat(objectView,View.ALPHA,
                0,1,0,1);
        animator.setDuration(1500);
        animator.start();
    }

    @OnClick(R.id.color)
    public void onColorClicked()
    {
        ObjectAnimator animator = ObjectAnimator.ofInt(objectView,"backgroundColor",
                Color.BLUE,Color.RED);
        animator.setDuration(1500);
        animator.start();
    }
}
