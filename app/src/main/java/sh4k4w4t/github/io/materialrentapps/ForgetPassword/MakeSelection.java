package sh4k4w4t.github.io.materialrentapps.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import sh4k4w4t.github.io.materialrentapps.R;

public class MakeSelection extends AppCompatActivity {
    RelativeLayout viaSmsCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_make_selection);

        viaSmsCode= findViewById(R.id.viaSMSCode);
        viaSmsCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MakeSelection.this, VerifyOTP.class));
            }
        });
    }
}