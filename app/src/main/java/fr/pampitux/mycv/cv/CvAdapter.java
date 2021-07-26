package fr.pampitux.mycv.cv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import fr.pampitux.mycv.R;

public class CvAdapter extends RecyclerView.Adapter<CvAdapter.CvViewHolder> {

    List<CVItems> litems;

    public CvAdapter(List<CVItems> litems) {
        this.litems=litems;
    }

    @NonNull
    @NotNull
    @Override
    public CvViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cv, parent, false);
        return new CvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CvAdapter.CvViewHolder holder, int position) {

        holder.titre.setText(litems.get(position).getTitre());
        holder.description.setText(litems.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return litems.size();
    }

    public class CvViewHolder extends RecyclerView.ViewHolder {

        TextView titre, description;

        public CvViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            titre = itemView.findViewById(R.id.tv_titre);
            description = itemView.findViewById(R.id.tv_description);

        }
    }
}
