package sh4k4w4t.github.io.materialrentapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatagoriesAdapter extends RecyclerView.Adapter<CatagoriesAdapter.CatagoriesViewHolder> {
    private List<Model_title_image> arraylist;

    public CatagoriesAdapter(List<Model_title_image> arraylist) {
        this.arraylist = arraylist;
    }

    @NonNull
    @Override
    public CatagoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatagoriesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_categories_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CatagoriesViewHolder holder, int position) {
        Model_title_image model_title_image = arraylist.get(position);
        holder.title.setText(model_title_image.getTitle());
        holder.imageView.setImageResource(model_title_image.getImage());
    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    public static class CatagoriesViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        public CatagoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageCatagories);
            title= itemView.findViewById(R.id.descriptionCatagories);
        }
    }
}
