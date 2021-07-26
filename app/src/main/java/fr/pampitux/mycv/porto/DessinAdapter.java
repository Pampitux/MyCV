package fr.pampitux.mycv.porto;

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

public class DessinAdapter extends RecyclerView.Adapter<DessinAdapter.DessinListerner> {

    List<DessinClass> ldessin;

    public DessinAdapter(List<DessinClass> ldessin) {
        this.ldessin = ldessin;
    }

    @NonNull
    @NotNull
    @Override
    public DessinListerner onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dessin, parent, false);
        return new DessinListerner(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DessinAdapter.DessinListerner holder, int position) {

        holder.img.setImageResource(ldessin.get(position).getImage());
        holder.txt.setText(ldessin.get(position).getTexte());
    }

    @Override
    public int getItemCount() {
        return ldessin.size();
    }

    public class DessinListerner extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;

        public DessinListerner(@NonNull @NotNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.des1);
            txt = itemView.findViewById((R.id.txt1));
        }
    }
}
