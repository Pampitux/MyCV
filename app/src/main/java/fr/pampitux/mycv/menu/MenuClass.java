package fr.pampitux.mycv.menu;

public class MenuClass {

    private int icon, num;
    private boolean isActivated;

    public MenuClass() {
    }

    public MenuClass(int icon, int num, boolean isActivated) {
        this.icon = icon;
        this.num = num;
        this.isActivated = isActivated;
    }

    public MenuClass(int icon, int num) {
        this.icon = icon;
        this.num = num;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
