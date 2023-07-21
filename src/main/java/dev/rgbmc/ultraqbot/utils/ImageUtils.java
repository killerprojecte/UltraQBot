package dev.rgbmc.ultraqbot.utils;

import com.google.gson.JsonObject;
import com.xbaimiao.mirai.message.component.collections.ComponentList;
import com.xbaimiao.mirai.message.component.impl.FlashImage;
import com.xbaimiao.mirai.message.component.impl.Image;

import java.io.File;
import java.net.URL;

public class ImageUtils {
    public static Image fromFile(File file) {
        return new Image(file);
    }

    public static Image fromURL(URL url) {
        return new Image(url);
    }

    public static Image fromBase64(String encodedImage) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("base64", encodedImage);
        return new Image(jsonObject, new ComponentList());
    }

    public static FlashImage flashImageFromFile(File file) {
        return new FlashImage("", "", encodeImageToBase64(file));
    }

    public static FlashImage flashImageFromURL(URL url) {
        return new FlashImage("", url.toString(), "");
    }

    public static FlashImage flashImageFromBase64(String encodedImage) {
        return new FlashImage("", "", encodedImage);
    }

    private static String encodeImageToBase64(File file) {
        return FileUtils.INSTANCE.fileToBase64(file);
    }
}
