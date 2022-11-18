package sh4k4w4t.github.io.materialrentapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN= 5000;
    Animation topAnim, bottomAnim;
    ImageView imageView;
    TextView logo, slogan;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        constraintLayout= findViewById(R.id.layoutIdSplashScreen);
//        constraintLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(MainActivity.this,LoginActivity.class);
//                Pair[] pairs= new Pair[2];
//                pairs[0] = new Pair<View,String >(imageView,"logo_image");
//                pairs[1] = new Pair<View,String >(logo,"logo_text");
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
//                    startActivity(intent,options.toBundle());
//                    finish();
//                }
//            }
//        });

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        imageView= findViewById(R.id.imageViewCar);
        logo= findViewById(R.id.textViewLogo);
        slogan= findViewById(R.id.textViewSlogan);

        imageView.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,LoginActivity.class);
                Pair[] pairs= new Pair[2];
                pairs[0] = new Pair<View,String >(imageView,"logo_image");
                pairs[1] = new Pair<View,String >(logo,"logo_text");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                    finish();
                }
            }
        },SPLASH_SCREEN);
    }
}