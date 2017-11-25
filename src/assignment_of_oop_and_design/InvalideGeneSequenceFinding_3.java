package assignment_of_oop_and_design;

import java.util.*;
import edu.duke.*;

import java.util.Scanner;

public class InvalideGeneSequenceFinding_3 {
    Scanner scan = new Scanner(System.in);

    public static boolean twoOccurrences(String stringa , String stringb) {

        int index = stringb.indexOf(stringa);

        if (index == -1) {
            return false;
        }

        stringb = stringb.substring(index + stringa.length(), stringb.length());

        index = stringb.indexOf(stringa);

        if (index == -1) {
            return false;
        }
        return true;

    }
    public static String lastPart(String a , String b){
        int index = b.indexOf(a);

        if(index == -1)
            return b;

        return  b.substring(index + a.length() , b.length());
    }

    public static void testing(){
        String a,b;

        a = "by";
        b = "A story by Abby Long";

        if(twoOccurrences(a,b) == true)
            System.out.println("true");
        else
            System.out.println("false");

        a = "ab";
        b ="abcd";

        if(twoOccurrences(a,b) == true)
            System.out.println("true");
        else
            System.out.println("false");

        a = "ab";
        b = "cccccc";

        if(twoOccurrences(a,b) == true)
            System.out.println("true");
        else
            System.out.println("false");

        a = "an";
        b = "banana";
        System.out.println(lastPart(a,b));

        a = "zoo";
        b = "forest";
        System.out.println(lastPart(a,b));


    }

    public  static void main(String[] args){
        testing();
    }
}