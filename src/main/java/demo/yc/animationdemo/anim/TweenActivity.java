package demo.yc.animationdemo.anim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.yc.animationdemo.R;

public class TweenActivity extends AppCompatActivity
{

    @BindView(R.id.tweenView)
    ImageView tweenView;
    @BindView(R.id.scale)
    Button scaleBtn;
    @BindView(R.id.rotate)
    Button rotateBtn;
    @BindView(R.id.translate)
    Button translateBtn;
    @BindView(R.id.alpha)
    Button alphaBtn;
    @BindView(R.id.set)
    Button set;
    @BindView(R.id.scale2)
    Button scale2;
    @BindView(R.id.rotate2)
    Button rotate2;
    @BindView(R.id.translate2)
    Button translate2;
    @BindView(R.id.alpha2)
    Button alpha2;
    @BindView(R.id.set2)
    Button set2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.scale, R.id.rotate, R.id.translate, R.id.alpha, R.id.set})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.scale:
                Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.scale);
                tweenView.startAnimation(anim1);
                Log.d("tween", "scale----");
                break;
            case R.id.rotate:
                Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.rotate);
                tweenView.startAnimation(anim2);
                break;
            case R.id.translate:
                Animation anim3 = AnimationUtils.loadAnimation(this, R.anim.translate);
                tweenView.startAnimation(anim3);
                break;
            case R.id.alpha:
                Animation anim4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
                tweenView.startAnimation(anim4);
                break;
            case R.id.set:
                Animation anim5 = AnimationUtils.loadAnimation(this, R.anim.set);
                anim5.setAnimationListener(new Animation.AnimationListener()
                {
                    @Override
                    public void onAnimationStart(Animation animation)
                    {
                        Log.w("tween","start-----");
                    }
                    @Override
                    public void onAnimationEnd(Animation animation)
                    {
                        Log.w("tween","end-----");
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation)
                    {
                        Log.w("tween","repeat-----");
                    }
                });
                tweenView.startAnimation(anim5);
                break;
        }
    }


    @OnClick(R.id.scale2)
    public void onScale2Clicked()
    {
        ScaleAnimation animation = new ScaleAnimation(0, 1, 0, 1);
        animation.setDuration(1000);
        tweenView.startAnimation(animation);
    }

    @OnClick(R.id.rotate2)
    public void onRotate2Clicked()
    {
        RotateAnimation animation = new RotateAnimation(0,360);
        animation.setDuration(1000);
        tweenView.startAnimation(animation);
    }

    @OnClick(R.id.translate2)
    public void onTranslate2Clicked()
    {
        TranslateAnimation animation = new TranslateAnimation(0,100,0,100);
        animation.setDuration(1000);
        tweenView.startAnimation(animation);

    }

    @OnClick(R.id.alpha2)
    public void onAlpha2Clicked()
    {
        AlphaAnimation animation = new AlphaAnimation(0,1);
        animation.setDuration(1000);
        tweenView.startAnimation(animation);


    }

    @OnClick(R.id.set2)
    public void onSet2Clicked()
    {
        AnimationSet set = new AnimationSet(false);
        set.addAnimation(new AlphaAnimation(0,1));
        set.addAnimation(new RotateAnimation(0,360));
        set.setDuration(1000);
        tweenView.startAnimation(set);
    }
}
