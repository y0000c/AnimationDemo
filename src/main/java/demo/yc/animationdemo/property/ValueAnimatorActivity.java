package demo.yc.animationdemo.property;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import demo.yc.animationdemo.R;

public class ValueAnimatorActivity extends AppCompatActivity
{
    @BindView(R.id.value_text)
    TextView valueText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);
        ButterKnife.bind(this);
    }

    public void startClick1(View view)
    {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0,10000);
        valueAnimator.setDuration(1000);
        valueAnimator.setInterpolator(new BounceInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
            @Override
            public void onAnimationUpdate(ValueAnimator animation)
            {
                Log.d("value","当前值："+animation.getAnimatedValue());
                Log.d("value","当前动画进度："+animation.getAnimatedFraction());
                valueText.setText("当前value值："+animation.getAnimatedValue());
            }
        });
        valueAnimator.start();
    }

}
