package assignment_of_oop_and_design;

import edu.duke.*;

public class GrayScaleAndSave
{
    public  ImageResource grayConvert(ImageResource inImage){
        ImageResource outImage = new ImageResource(inImage.getWidth() , inImage.getHeight());

        for(Pixel pixel : outImage.pixels()){
            Pixel inPixel = inImage.getPixel(pixel.getX() , pixel.getY());

            int average = (inPixel.getRed() + inPixel.getGreen() + inPixel.getGreen() )/3;

            pixel.setRed(average);
            pixel.setBlue(average);
            pixel.setGreen(average);
        }
        return outImage ;
    }

    public void testImage(){
        ImageResource img = new ImageResource();
        ImageResource newImage =grayConvert(img);
        String gray;   
        gray = img.getFileName();
        newImage.setFileName("gray_" + gray);
        newImage.draw();
        newImage.save();

    }

    public static void main(String[] a){
        GrayScaleAndSave ob2 =  new GrayScaleAndSave();
        ob2.testImage();
    }
}
