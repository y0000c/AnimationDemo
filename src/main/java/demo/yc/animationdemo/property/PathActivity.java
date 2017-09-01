package demo.yc.animationdemo.property;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import demo.yc.animationdemo.R;

public class PathActivity extends AppCompatActivity
{

    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);
        ButterKnife.bind(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void start(View view)
    {

        float x = imageView.getX();
        float y = imageView.getY();
        Path path = new Path();
        path.lineTo(x+200,y+200);
        ObjectAnimator animator = ObjectAnimator
                .ofFloat(imageView, View.X,View.Y,path);
        animator.setDuration(1500);
        animator.start();

        Animation animator1 = AnimationUtils.loadAnimation(this,R.anim.alpha);
        animator.addPauseListener(new Animator.AnimatorPauseListener()
        {
            @Override
            public void onAnimationPause(Animator animation)
            {
                
            }

            @Override
            public void onAnimationResume(Animator animation)
            {

            }
        });
    }
}
