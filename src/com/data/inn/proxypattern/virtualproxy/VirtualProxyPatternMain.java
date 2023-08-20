package com.data.inn.proxypattern.virtualproxy;

import com.data.inn.proxypattern.virtualproxy.domain.ImageIconProxy;

import java.net.MalformedURLException;
import java.net.URL;

public class VirtualProxyPatternMain {

    public void run() {

        try {
            ImageIconProxy proxy = new ImageIconProxy(new URL("http://album.cover.com"));
            proxy.paintIcon( 600, 400 );

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
