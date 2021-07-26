package fr.pampitux.mycv.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import fr.pampitux.mycv.R;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    List<MenuClass> lmenu;
    Callback listener;

    public MenuAdapter(List<MenuClass> lmenu, Callback listener) {
        this.lmenu = lmenu;
        this.listener = listener;
    }

    @NonNull
    @NotNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MenuAdapter.MenuViewHolder holder, int position) {
        holder.icon.setImageResource(lmenu.get(position).getIcon());
        if (lmenu.get(position).isActivated()) {
            holder.isActivated.setVisibility(View.VISIBLE);
        } else {
            holder.isActivated.setVisibility(View.INVISIBLE);
        }


    }

    @Override
    public int getItemCount() {
        return lmenu.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        ImageView icon, isActivated;

        public MenuViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon_menu_icon);
            isActivated = itemView.findViewById(R.id.icon_menu_activated);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onMenuIconClick(getAdapterPosition());
                }
            });
        }
    }
}
