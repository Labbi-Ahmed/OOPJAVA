package grayScale_and_invalidegeneFinding;

import edu.duke.*;
import java.io.*;

public class GrayScaleMultipleImageAndSave {


    public ImageResource grayConverter(ImageResource image) {

        ImageResource newImage = new ImageResource(image.getWidth(), image.getHeight());

        for (Pixel pixel : newImage.pixels()) {
            Pixel pix = image.getPixel(pixel.getX(), pixel.getY());
            int average = (pix.getRed() + pix.getBlue() + pix.getGreen()) / 3;

            pixel.setRed(average);
            pixel.setGreen(average);
            pixel.setBlue(average);
        }

        return newImage;
    }

    public void test() {
        File f = null;

        DirectoryResource dr = new DirectoryResource();
        for (File file : dr.selectedFiles()) {
            ImageResource grayImage = new ImageResource(file);
            ImageResource newgray = grayConverter(grayImage);
            String name;
            name = grayImage.getFileName();
            newgray.setFileName("Gray_" + name);
            newgray.save();
            newgray.draw();

        }
    }

    public static void main(String[] a) {
        GrayScaleMultipleImageAndSave ob = new  GrayScaleMultipleImageAndSave();
        ob.test();
    }

}