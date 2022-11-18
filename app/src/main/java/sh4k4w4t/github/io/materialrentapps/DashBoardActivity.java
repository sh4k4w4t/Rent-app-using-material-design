package sh4k4w4t.github.io.materialrentapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView featuresRecyclerview,mostViewRecycleView;
    FeaturedAdapter featuredAdapter;
    MostViewAdapter mostViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dash_board);

        featuresRecyclerview= findViewById(R.id.featuresRecyclerview);
        featuresRecyclerviewMethod();

        mostViewRecycleView= findViewById(R.id.mostViewRecycleview);
        mostViewRecycleViewMethod();
    }

    private void mostViewRecycleViewMethod() {
        mostViewRecycleView.setHasFixedSize(true);
        mostViewRecycleView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<Model_image_title_desc> mostViewHelperClasses= new ArrayList<>();
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.bus,"Ena Enterprise","Bus Services for Dhaka-Chittagong highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.bus,"Starline Ltd.","Bus Services for Dhaka-Chittagong highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.bus,"Hanif Enterprise","Bus Services for Dhaka-Chittagong highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.bus,"siasoA Enterprise","Bus Services for Dhaka-Chittagong highway."));

        mostViewAdapter= new MostViewAdapter(mostViewHelperClasses);
        mostViewRecycleView.setAdapter(mostViewAdapter);

    }

    private void featuresRecyclerviewMethod() {
        featuresRecyclerview.setHasFixedSize(true);
        featuresRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<Model_image_title_desc> modelimagetitledescs = new ArrayList<>();
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.bus,"Ena Enterprise","Bus Services for Dhaka-Chittagong highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.bus,"Starline Ltd.","Bus Services for Dhaka-Chittagong highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.bus,"Hanif Enterprise","Bus Services for Dhaka-Chittagong highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.bus,"siasoA Enterprise","Bus Services for Dhaka-Chittagong highway."));

        featuredAdapter = new FeaturedAdapter(modelimagetitledescs);
        featuresRecyclerview.setAdapter(featuredAdapter);

        GradientDrawable gradientDrawable1= new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0x00ffeff400,0xffaff600});
    }
}