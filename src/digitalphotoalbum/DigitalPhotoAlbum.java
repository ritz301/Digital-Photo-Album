package digitalphotoalbum;

import java.util.ArrayList;

public class DigitalPhotoAlbum {

    private static MainGUI mg;
    private static ArrayList<info> o = new ArrayList<>();
    
    public static void main(String[] args) {
        mg = new MainGUI();
        mg.setMg(mg);
        mg.setO(o);
        mg.setVisible(true);
    }
    
}

