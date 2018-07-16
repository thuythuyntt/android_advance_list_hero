package ntt.thuy.practice.framgia.recyclerview_listhero;

/**
 * Created by thuy on 16/07/2018.
 */
public class Hero {
    private String mName;
    private int mImage;

    public Hero(String name, int image) {
        this.mName = name;
        this.mImage = image;
    }

    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }
}
