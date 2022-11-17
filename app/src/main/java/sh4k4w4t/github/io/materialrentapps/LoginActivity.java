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

public class LoginActivity extends AppCompatActivity {

    Button newUserRegistration, goButton;
    ImageView loginLogo;
    TextView logintext,sloganText;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        newUserRegistration = findViewById(R.id.newUserRegistration);
        loginLogo = findViewById(R.id.loginLogo);
        logintext= findViewById(R.id.loginText);
        sloganText= findViewById(R.id.sloganText);
        username= findViewById(R.id.usernameTL);
        password= findViewById(R.id.passwordTL);
        goButton = findViewById(R.id.goButton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, DashBoardActivity.class));
            }
        });

        newUserRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LoginActivity.this,SignUpActivity.class);
                Pair[] pairs= new Pair[7];
                pairs[0] = new Pair<View,String >(loginLogo,"logo_image");
                pairs[1] = new Pair<View,String >(logintext,"logo_text");
                pairs[2] = new Pair<View,String >(sloganText,"logo_desc");
                pairs[3] = new Pair<View,String >(username,"username_tl");
                pairs[4] = new Pair<View,String >(password,"password_tl");
                pairs[5] = new Pair<View,String >(goButton,"go_button");
                pairs[6] = new Pair<View,String >(newUserRegistration,"back_button");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                    finish();
                }
            }
        });
    }
}