package demo.yc.animationdemo.interpolator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.yc.animationdemo.R;

public class InterpolatorActivity extends AppCompatActivity
{

    @BindView(R.id.blockView)
    View blockView;

    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.LinearInterpolator)
    public void onLinearInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_line);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.AccelerateInterpolator)
    public void onAccelerateInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_acce);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.DecelerateInterpolator)
    public void onDecelerateInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_dece);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.CycleInterpolator)
    public void onCycleInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_cycle);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.BounceInterpolator)
    public void onBounceInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_bounce);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.AccelerateDecelerateInterpolator)
    public void onAccelerateDecelerateInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_acce_dece);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.AnticipateInterpolator)
    public void onAnticipateInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_anticipate);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.OvershootInterpolator)
    public void onOvershootInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_over);
        blockView.startAnimation(anim);
    }

    @OnClick(R.id.AnticipateOvershootInterpolator)
    public void onAnticipateOvershootInterpolatorClicked()
    {
        anim = AnimationUtils.loadAnimation(this,R.anim.inpolator_anticipate_over);
        blockView.startAnimation(anim);
    }

}
