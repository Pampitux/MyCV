package fr.pampitux.mycv.contact;

import android.content.Intent;
import android.net.Uri;
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

public class ContactFragment extends Fragment {

    List<ContactClass> contactClassList, contactClassList2;
    ContactAdapter contactAdapter;
    Contact2Adapter contactAdapter2;
    RecyclerView recyclerView, recyclerView2;

    static final int YOUTUBE_CODE = 1;
    static final int LINKEDIN_CODE = 2;
    static final int GITHUB_CODE = 3;
    static final int FACEBOOK_CODE = 4;
    static final int EMAIL_CODE = 5;

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setContactClassList(view);
        setContactClassList2(view);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_social, container, false);
    }

    /**
     * Méthode initialisant les éléments  de la recyclerView
     *
     * @param view .
     */
    void setContactClassList(View view) {
        recyclerView = view.findViewById(R.id.recycler_one);

        contactClassList = new ArrayList<>();
        contactClassList.add(new ContactClass("Adresse", getString(R.string.adresse)));
        contactClassList.add(new ContactClass("Code Postal", getString(R.string.postal)));
        contactClassList.add(new ContactClass("Ville", getString(R.string.ville)));
        contactClassList.add(new ContactClass("Pays", getString(R.string.pays)));
        contactClassList.add(new ContactClass("Téléphone", getString(R.string.phone)));

        contactAdapter = new ContactAdapter(contactClassList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(contactAdapter);
    }

    /**
     * Méthode initialisant les éléments  de la recyclerView N°2
     *
     * @param view .
     */
    void setContactClassList2(View view) {
        recyclerView2 = view.findViewById(R.id.recycler_two);

        contactClassList2 = new ArrayList<>();
        contactClassList2.add(new ContactClass("Github", R.drawable.sc_github, GITHUB_CODE));
        contactClassList2.add(new ContactClass("LinkedIn", R.drawable.sc_linkedin, LINKEDIN_CODE));
        contactClassList2.add(new ContactClass("Youtube", R.drawable.ytube, YOUTUBE_CODE));
        contactClassList2.add(new ContactClass("Facebook", R.drawable.sc_facebook, FACEBOOK_CODE));
        contactClassList2.add(new ContactClass("Email", R.drawable.ic_baseline_email_24, EMAIL_CODE));

        contactAdapter2 = new Contact2Adapter(contactClassList2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(contactAdapter2);

        contactAdapter2.setClickOnContactListener(pos -> {
            switch (contactClassList2.get(pos).getCode()) {
                case YOUTUBE_CODE:
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/Doelwitmeian/videos"));
                    startActivity(i);
                    break;
                case LINKEDIN_CODE:
                    Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/nicolas-alvarez-905288166/"));
                    startActivity(j);
                    break;
                case FACEBOOK_CODE:
                    Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100008120926056"));
                    startActivity(i2);
                    break;
                case GITHUB_CODE:
                    Intent j2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Pampitux"));
                    startActivity(j2);
                    break;
                case EMAIL_CODE:
                    Intent k = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:ni.alvarez.co@gmail.com"));
                    startActivity(k);
                default:
                    break;
            }
        });
    }
}
