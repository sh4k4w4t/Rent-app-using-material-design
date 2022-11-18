package sh4k4w4t.github.io.materialrentapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView featuresRecyclerview,mostViewRecycleView, cetagoriesRecycleView;
    FeaturedAdapter featuredAdapter;
    MostViewAdapter mostViewAdapter;
    CatagoriesAdapter catagoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dash_board);

        featuresRecyclerview= findViewById(R.id.featuresRecyclerview);
        featuresRecyclerviewMethod();

        mostViewRecycleView= findViewById(R.id.mostViewRecycleview);
        mostViewRecycleViewMethod();

        cetagoriesRecycleView= findViewById(R.id.cetagoriesRecycleView);
        cetagoriesRecycleViewMethod();


    }

    private void cetagoriesRecycleViewMethod() {
        cetagoriesRecycleView.setHasFixedSize(true);
        cetagoriesRecycleView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<Model_title_image> categories= new ArrayList<>();
        categories.add(new Model_title_image(R.drawable.bus,"High Perform\nConnect\nHigh\nClass\nServices"));
        categories.add(new Model_title_image(R.drawable.plane,"High Perform\nConnect\nHigh\nClass\nServices"));
        categories.add(new Model_title_image(R.drawable.train,"High Perform\nConnect\nHigh\nClass\nServices"));
        categories.add(new Model_title_image(R.drawable.boat,"High Perform\nConnect\nHigh\nClass\nServices"));
        categories.add(new Model_title_image(R.drawable.car,"High Perform\nConnect\nHigh\nClass\nServices"));
        catagoriesAdapter= new CatagoriesAdapter(categories);
        cetagoriesRecycleView.setAdapter(catagoriesAdapter);
    }

    private void mostViewRecycleViewMethod() {
        mostViewRecycleView.setHasFixedSize(true);
        mostViewRecycleView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<Model_image_title_desc> mostViewHelperClasses= new ArrayList<>();
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.car,"siasoA Car Enterprise","Bus Services for Dhaka-Chittagong highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.plane,"siasoA Plane Enterprise","Bus Services for Dhaka-B.Baria highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.train,"siasoA Train Enterprise","Bus Services for Dhaka-Nepal highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.bus,"siasoA Bus Enterprise","Bus Services for Dhaka-Barisal highway."));
        mostViewHelperClasses.add(new Model_image_title_desc(R.drawable.boat,"siasoA Boat Enterprise","Bus Services for Dhaka-Barisal highway."));

        mostViewAdapter= new MostViewAdapter(mostViewHelperClasses);
        mostViewRecycleView.setAdapter(mostViewAdapter);
    }

    private void featuresRecyclerviewMethod() {
        featuresRecyclerview.setHasFixedSize(true);
        featuresRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<Model_image_title_desc> modelimagetitledescs = new ArrayList<>();
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.plane,"siasoA Plane Enterprise","Bus Services for Dhaka-Chittagong highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.boat,"siasoA Boat Enterprise","Bus Services for Dhaka-Chittagong highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.train,"siasoA Train Enterprise.","Bus Services for Dhaka-B.Baria highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.bus,"siasoA Bus Enterprise","Bus Services for Dhaka-Nepal highway."));
        modelimagetitledescs.add(new Model_image_title_desc(R.drawable.car,"siasoA car Enterprise","Bus Services for Dhaka-Barisal highway."));

        featuredAdapter = new FeaturedAdapter(modelimagetitledescs);
        featuresRecyclerview.setAdapter(featuredAdapter);

//        GradientDrawable gradientDrawable1= new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0x00ffeff400,0xffaff600});
    }
}