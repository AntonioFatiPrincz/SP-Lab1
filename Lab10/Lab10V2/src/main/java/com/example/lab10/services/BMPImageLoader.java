package com.example.lab10.services;

import com.example.lab10.models.ImageContent;

public class BMPImageLoader implements ImageLoader{

    @Override
    public ImageContent load(String s) {
        System.out.println("Creating BMPImage");
        return new ImageContent(s);
    }
}
