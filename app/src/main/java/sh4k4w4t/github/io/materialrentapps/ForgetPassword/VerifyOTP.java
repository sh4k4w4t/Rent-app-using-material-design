package sh4k4w4t.github.io.materialrentapps.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import sh4k4w4t.github.io.materialrentapps.DashBoard.DashBoardActivity;
import sh4k4w4t.github.io.materialrentapps.R;

public class VerifyOTP extends AppCompatActivity {
    Button verifyCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_verify_otp);

        verifyCode= findViewById(R.id.verify_code);
        verifyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerifyOTP.this, DashBoardActivity.class));
            }
        });
    }
}