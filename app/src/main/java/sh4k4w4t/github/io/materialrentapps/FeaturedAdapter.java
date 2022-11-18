package sh4k4w4t.github.io.materialrentapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {

    ArrayList<FeaturedHelperClass> featuredLocations;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FeaturedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_featured_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedHelperClass featuredHelperClass = featuredLocations.get(position);
        holder.imageView.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());
        holder.description.setText(featuredHelperClass.getDescription());
    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }


    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title, description;
        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.featured_picture);
            title= itemView.findViewById(R.id.feature_title);
            description= itemView.findViewById(R.id.feature_description);
        }
    }

}
