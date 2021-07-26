package fr.pampitux.mycv.cv;

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


public class CVFragment extends Fragment {

    RecyclerView rvrecycle;
    CvAdapter cvAdapter;
    List<CVItems> litems;

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvrecycle = view.findViewById(R.id.rv_recycler);

        litems = new ArrayList<>();
        litems.add(new CVItems("2015 à ce jour", getString(R.string.lorem_text_long)));
        litems.add(new CVItems("2014", getString(R.string.lorem_text_court)));
        litems.add(new CVItems("2013", getString(R.string.lorem_text_court)));
        litems.add(new CVItems("2012 à 2013", getString(R.string.lorem_text_long)));
        litems.add(new CVItems("2011", getString(R.string.lorem_text_court)));
        litems.add(new CVItems("2019 à 2010", getString(R.string.lorem_text_long)));

        cvAdapter = new CvAdapter(litems);

        rvrecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        rvrecycle.setAdapter(cvAdapter);

    }

    public CVFragment() {
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

}