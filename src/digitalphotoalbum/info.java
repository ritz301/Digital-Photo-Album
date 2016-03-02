package digitalphotoalbum;

import javax.swing.ImageIcon;

public class info {
    private String title;
    private String anno;
    private ImageIcon img;

    public String getTitle() {
        return title;
    }

    public String getAnno() {
        return anno;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
}
