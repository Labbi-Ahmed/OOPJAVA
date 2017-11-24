package hello_around_world;

import edu.duke.*;
import java.io.*;

public class ManyFileRead {
    public static  void directory(){

        DirectoryResource dr = new DirectoryResource();

        for(File f : dr.selectedFiles()){
            System.out.println(f);
        }
    }

    public static void main(String[] a){
        directory();
    }
}
