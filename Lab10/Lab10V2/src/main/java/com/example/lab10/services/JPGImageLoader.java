package com.example.lab10.services;

import com.example.lab10.models.ImageContent;

public class JPGImageLoader implements ImageLoader{
    public ImageContent load(String s) {
        System.out.println("Creating JPGImage");
        return new ImageContent(s);
    }
}
