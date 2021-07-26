package fr.pampitux.mycv.contact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import fr.pampitux.mycv.R;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewholder> {

    List<ContactClass> contactClassList;

    public ContactAdapter(List<ContactClass> contactClassList) {
        this.contactClassList = contactClassList;
    }

    @NonNull
    @NotNull
    @Override
    public ContactViewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ContactAdapter.ContactViewholder holder, int position) {
        holder.clef.setText(contactClassList.get(position).getClef());
        holder.valeur.setText(contactClassList.get(position).getValeur());

    }

    @Override
    public int getItemCount() {
        return contactClassList.size();
    }

    public class ContactViewholder extends RecyclerView.ViewHolder {
        TextView clef, valeur;

        public ContactViewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            clef = itemView.findViewById(R.id.tv_clef);
            valeur = itemView.findViewById(R.id.tv_valeur);


        }
    }
}
