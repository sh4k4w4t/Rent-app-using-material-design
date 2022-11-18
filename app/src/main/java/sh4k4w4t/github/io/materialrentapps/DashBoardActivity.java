package sh4k4w4t.github.io.materialrentapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView featuresRecyclerview;
    FeaturedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dash_board);

        featuresRecyclerview= findViewById(R.id.featuresRecyclerview);
        featuresRecyclerviewMethod();
    }

    private void featuresRecyclerviewMethod() {
        featuresRecyclerview.setHasFixedSize(true);
        featuresRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<FeaturedHelperClass> featuredHelperClasses= new ArrayList<>();
        featuredHelperClasses.add(new FeaturedHelperClass(R.drawable.bus,"Ena Enterprise","Bus Services for Dhaka-Chittagong highway."));
        featuredHelperClasses.add(new FeaturedHelperClass(R.drawable.bus,"Starline Ltd.","Bus Services for Dhaka-Chittagong highway."));
        featuredHelperClasses.add(new FeaturedHelperClass(R.drawable.bus,"Hanif Enterprise","Bus Services for Dhaka-Chittagong highway."));
        featuredHelperClasses.add(new FeaturedHelperClass(R.drawable.bus,"siasoA Enterprise","Bus Services for Dhaka-Chittagong highway."));

        adapter= new FeaturedAdapter(featuredHelperClasses);
        featuresRecyclerview.setAdapter(adapter);
    }
}