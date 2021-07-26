package fr.pampitux.mycv.menu;

import java.util.ArrayList;
import java.util.List;

import fr.pampitux.mycv.R;

public class MenuTools {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int COMP_FRAGMENT_CODE = 2;
    public static final int PORTO_FRAGMENT_CODE = 3;
    public static final int CONTACT_FRAGMENT_CODE = 4;

    /**
     * Méthode permettant d'afficher les icones du menu, si c'est true, cela indique que l'icone est actuellement sélectionnée
     *
     * @return la list du menu
     */
    public static List<MenuClass> getMenuList() {

        List<MenuClass> list = new ArrayList<>();
        list.add(new MenuClass(R.drawable.ic_baseline_home_24, HOME_FRAGMENT_CODE, true));
        list.add(new MenuClass(R.drawable.ic_baseline_work_24, CV_FRAGMENT_CODE, false));
        list.add(new MenuClass(R.drawable.ic_baseline_book_24, COMP_FRAGMENT_CODE, false));
        list.add(new MenuClass(R.drawable.ic_baseline_image_24, PORTO_FRAGMENT_CODE, false));
        list.add(new MenuClass(R.drawable.ic_baseline_chrome_reader_mode_24, CONTACT_FRAGMENT_CODE, false));

        return list;
    }
}
