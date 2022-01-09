package com.example.lab10.services;

public class ImageLoaderFactory {
    public ImageLoader create(String type){
        if(type.equals("BMP")){
            return new BMPImageLoader();
        }else {
            return new JPGImageLoader();
        }
    }
}
