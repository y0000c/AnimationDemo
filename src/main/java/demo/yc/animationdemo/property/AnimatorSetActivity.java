package demo.yc.animationdemo.property;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import demo.yc.animationdemo.R;

public class AnimatorSetActivity extends AppCompatActivity
{

    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator_set);
        ButterKnife.bind(this);
    }

    public void start(View view)
    {
        ObjectAnimator a1 = ObjectAnimator.ofFloat(imageView,View.SCALE_X,1,2);
        ObjectAnimator a2 = ObjectAnimator.ofFloat(imageView,View.SCALE_Y,1,2);

        AnimatorSet set = new AnimatorSet();
        set.setDuration(1500);
        set.playTogether(a1,a2);
        //set.start();


        set.playTogether(a1,a2);
        set.play(a1).with(a2);

        set.playSequentially(a1,a2);

        set.play(a1).after(a2);
        set.play(a1).before(a1);
        
        set.play(a1).after(1000);







    }
}
