package Applet;

import java.awt.*;
import java.net.*;

public class DisplayImage extends Panel {
    Image picture;

    public void init() {
        try {
            picture = Toolkit.getDefaultToolkit().getImage(new URL(getDocumentBase(), "sonoo.jpg"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private URL getDocumentBase() {
        return null;
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }
}
