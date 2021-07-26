package fr.pampitux.mycv.contact;

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

public class Contact2Adapter extends RecyclerView.Adapter<Contact2Adapter.Contact2Viewholder> {
    private final List<ContactClass> contactClassList;
    private Contact2Listerner mlistener;

    public Contact2Adapter(List<ContactClass> contactClassList) {
        this.contactClassList = contactClassList;
    }

    public void setClickOnContactListener(Contact2Listerner listener) {
        mlistener = listener;
    }

    @NonNull
    @NotNull
    @Override
    public Contact2Viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact2, parent, false);
        return new Contact2Viewholder(view, mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Contact2Adapter.Contact2Viewholder holder, int position) {
        holder.clef.setText(contactClassList.get(position).getClef());
        holder.img.setImageResource(contactClassList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return contactClassList.size();
    }

    public static class Contact2Viewholder extends RecyclerView.ViewHolder {

        TextView clef;
        ImageView img;

        public Contact2Viewholder(@NonNull @NotNull View itemView, final Contact2Listerner listener) {
            super(itemView);

            clef = itemView.findViewById(R.id.tv_clef2);
            img = itemView.findViewById(R.id.iv_button);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            listener.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
