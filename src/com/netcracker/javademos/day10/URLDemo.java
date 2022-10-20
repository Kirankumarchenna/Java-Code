package com.netcracker.javademos.day10;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL googleUrl = new URL("www.google.com");
        URLConnection connection = googleUrl.openConnection();
       // try(InputStream inputStream)
    }
}
