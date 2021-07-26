package fr.pampitux.mycv.cv;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import fr.pampitux.mycv.R;

public class CompFragment extends Fragment {

    RecyclerView recyclerView;
    CvAdapter cvAdapter;
    List<CVItems> litems;
    TextView textView;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView = view.findViewById(R.id.rv_recycler);
        textView = view.findViewById(R.id.xp_titre);
        textView.setText("Formations");

        litems = new ArrayList<>();
        litems.add(new CVItems("2018 à ce jour", getString(R.string.lorem_text_long)));
        litems.add(new CVItems("2012 - 1013", getString(R.string.lorem_text_court)));
        litems.add(new CVItems("2005", getString(R.string.lorem_text_court)));
        litems.add(new CVItems("2004", getString(R.string.lorem_text_long)));
        litems.add(new CVItems("2003", getString(R.string.lorem_text_court)));

        cvAdapter = new CvAdapter(litems);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(cvAdapter);
    }
}
