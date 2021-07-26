package fr.pampitux.mycv.porto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import fr.pampitux.mycv.R;

public class DessinFragment extends Fragment {

    RecyclerView rvrecycle;
    DessinAdapter dessinAdapter;
    List<DessinClass> ldessin;

    public DessinFragment() {
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvrecycle = view.findViewById(R.id.rv_porto);

        ldessin = new ArrayList<>();
        ldessin.add(new DessinClass(R.drawable.dess1, "Bryan Cranston"));
        ldessin.add(new DessinClass(R.drawable.dess5, "Teal'c"));
        ldessin.add(new DessinClass(R.drawable.dess7, "Ramsay Bolton"));
        ldessin.add(new DessinClass(R.drawable.dess8, "Wonder Woman"));
        ldessin.add(new DessinClass(R.drawable.dess9, "Pablo Schreiber"));
        ldessin.add(new DessinClass(R.drawable.dess11, "Kit Harington"));
        ldessin.add(new DessinClass(R.drawable.dess13, "Mickael Jakson"));
        ldessin.add(new DessinClass(R.drawable.dess14, "Iron Man"));
        ldessin.add(new DessinClass(R.drawable.dess15, "Jason Momoa"));

        dessinAdapter = new DessinAdapter(ldessin);

        rvrecycle.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvrecycle.setAdapter(dessinAdapter);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dessin, container, false);
    }
}
