package sh4k4w4t.github.io.materialrentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {
    Button goLoginPage,goButton;
    ImageView logoImage;
    TextView logoTitle, logoDescription;
    TextInputLayout usernameTL, passwordTL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        logoImage = findViewById(R.id.logoImage);
        logoTitle = findViewById(R.id.logoTitle);
        logoDescription = findViewById(R.id.logoDescription);
        usernameTL = findViewById(R.id.usernameTL);
        passwordTL = findViewById(R.id.passwordTL);
        goButton= findViewById(R.id.goButton);
        goLoginPage = findViewById(R.id.goLoginPage);




        goLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SignUpActivity.this,LoginActivity.class);
                Pair[] pairs= new Pair[7];
                pairs[0] = new Pair<View,String >(logoImage,"logo_image");
                pairs[1] = new Pair<View,String >(logoTitle,"logo_text");
                pairs[2] = new Pair<View,String >(logoDescription,"logo_desc");
                pairs[3] = new Pair<View,String >(usernameTL,"username_tl");
                pairs[4] = new Pair<View,String >(passwordTL,"password_tl");
                pairs[5] = new Pair<View,String >(goButton,"go_button");
                pairs[6] = new Pair<View,String >(goLoginPage,"back_button");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                    finish();
                }
            }
        });
    }
}