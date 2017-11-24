package hello_around_world;

import edu.duke.*;
import java.util.*;


public class URLreader {
    public static void urlread(){
        URLResource url = new URLResource("https://www.google.com/");
        for(String ur : url.words()){
            System.out.println(ur);
        }
    }

    public static void main(String[] a){
        urlread();
    }
}
