package fr.pampitux.mycv;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.pampitux.mycv.contact.ContactFragment;
import fr.pampitux.mycv.cv.CVFragment;
import fr.pampitux.mycv.cv.CompFragment;
import fr.pampitux.mycv.home.HomeFragment;
import fr.pampitux.mycv.menu.Callback;
import fr.pampitux.mycv.menu.MenuAdapter;
import fr.pampitux.mycv.menu.MenuClass;
import fr.pampitux.mycv.menu.MenuTools;
import fr.pampitux.mycv.porto.DessinFragment;

public class MainActivity extends AppCompatActivity implements Callback {

    RecyclerView recyclerView;
    List<MenuClass> lmenu;
    MenuAdapter menuAdapter;
    int defaultI = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMenu();
        setFragmentHome();
    }

    /**
     * Affichage de la barre de menu
     */
    private void setMenu() {
        recyclerView = findViewById(R.id.rv_icon_menu);
        lmenu = MenuTools.getMenuList();
        menuAdapter = new MenuAdapter(lmenu, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(menuAdapter);
    }

    /**
     * Affichage du fragment Home
     */
    void setFragmentHome() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new HomeFragment()).commit();
    }

    /**
     * Affichage du fragment CV
     */
    void setCVFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new CVFragment()).commit();
    }

    /**
     * Affichage du fragment Formation
     */
    void setCompFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new CompFragment()).commit();
    }

    /**
     * Affichage du fragment Contact
     */
    void setContactFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new ContactFragment()).commit();
    }

    /**
     * Affichage du fragment Portfolio
     */
    void setPorto() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new DessinFragment()).commit();
    }

    /**
     * Méthode perméttant de lancer un fragment
     *
     * @param i indice identifiant les fragments
     */
    @Override
    public void onMenuIconClick(int i) {

        switch (lmenu.get(i).getNum()) {
            case MenuTools.HOME_FRAGMENT_CODE:
                setFragmentHome();
                break;
            case MenuTools.CV_FRAGMENT_CODE:
                setCVFragment();
                break;
            case MenuTools.COMP_FRAGMENT_CODE:
                setCompFragment();
                break;
            case MenuTools.PORTO_FRAGMENT_CODE:
                setPorto();
                break;
            case MenuTools.CONTACT_FRAGMENT_CODE:
                setContactFragment();
                break;
            default:
                setFragmentHome();
        }

        lmenu.get(defaultI).setActivated(false);
        lmenu.get(i).setActivated(true);
        defaultI = i;
        menuAdapter.notifyDataSetChanged();

    }
}