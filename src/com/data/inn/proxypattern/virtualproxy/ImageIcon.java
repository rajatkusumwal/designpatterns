package com.data.inn.proxypattern.virtualproxy;

import java.net.URL;

public class ImageIcon implements Icon {

    String coverName;
    URL imageUrl;

    public ImageIcon(String coverName, URL imageUrl) {
        this.coverName = coverName;
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        return 480;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(int x, int y) {

        System.out.println("Painting " + coverName + " " +getIconWidth() + " " + getIconHeight());
    }
}
