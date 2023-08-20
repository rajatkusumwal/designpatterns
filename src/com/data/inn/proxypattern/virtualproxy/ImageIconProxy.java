package com.data.inn.proxypattern.virtualproxy;

import java.net.URL;

public class ImageIconProxy implements Icon {

    // To ensure consistency while reading.
    // Value is always read and written to main memory rather than thread level cache.
    // Making it consistent across all the threads that are accessing it.
    // Note: It does not ensure atomicity.
    volatile ImageIcon imageIcon;
    URL imageUrl;
    boolean retrieving;

    // We use synchronize to protect write.
    public synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public ImageIconProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    Thread retrievalThread;


    @Override
    public int getIconWidth() {
        if( imageIcon != null ){

            return imageIcon.getIconWidth();
        }
        return 400;
    }

    @Override
    public int getIconHeight() {
        if( imageIcon != null ){

            return imageIcon.getIconHeight();
        }
        return 600;
    }

    @Override
    public void paintIcon(int x, int y) {

        if( imageIcon != null ){

            imageIcon.paintIcon( x, y );
        } else {

            System.out.println("Loading album cover you are seeing the proxy cover !!");

            if( !retrieving ){

                retrievalThread = new Thread(() -> {

                    System.out.println("Downloading new album image ");

                    try {
                        // Mimic download to delay by 2sec
                        Thread.sleep(2000);
                        ImageIcon icon = new ImageIcon("Album cover!!", imageUrl);
                        setImageIcon( icon );
                        // We repaint in the swing component, this is just a mock call.
                        icon.paintIcon( 640, 400 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });

                retrievalThread.start();
            }

        }
    }
}
