package sh4k4w4t.github.io.materialrentapps.DashBoard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import sh4k4w4t.github.io.materialrentapps.R;

public class MostViewAdapter extends RecyclerView.Adapter<MostViewAdapter.MostViewHolder>{
    ArrayList<Model_image_title_desc> mostViewLocatons;

    public MostViewAdapter(ArrayList<Model_image_title_desc> featuredLocations) {
        this.mostViewLocatons = featuredLocations;
    }

    @NonNull
    @Override
    public MostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_most_viewed_card_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewHolder holder, int position) {
        Model_image_title_desc modelimagetitledesc = mostViewLocatons.get(position);
        holder.imageView.setImageResource(modelimagetitledesc.getImage());
        holder.title.setText(modelimagetitledesc.getTitle());
        holder.description.setText(modelimagetitledesc.getDescription());
    }

    @Override
    public int getItemCount() {
        return mostViewLocatons.size();
    }

    public static class MostViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title, description;
        public MostViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.msImage);
            title= itemView.findViewById(R.id.msTitle);
            description= itemView.findViewById(R.id.msDesc);
        }
    }

}
