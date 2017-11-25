package babys_name;

import edu.duke.*;
import  org.apache.commons.csv.*;

public class HowManyMBabiesAndFBabies {

    private void listOfName(CSVParser parser) {

        int totalBabies = 0 , femaleBabies = 0 , maleBabies = 0;

        for (CSVRecord r : parser){
            if (r.get(1).equals("M")){
                maleBabies += Integer.parseInt(r.get(2));
            }
            else if (r.get(1).equals("F")){
                femaleBabies += Integer.parseInt(r.get(2));
            }

            totalBabies += Integer.parseInt(r.get(2));
        }

        System.out.println("Total numbers of baby are :" + totalBabies);
        System.out.println("Male numbers of baby are :" + maleBabies);
        System.out.println("Female numbers of baby are :" + femaleBabies);

    }

    public void testing(){

        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        listOfName(parser);
    }


    public static void main(String[] args){
        HowManyMBabiesAndFBabies ob = new HowManyMBabiesAndFBabies();
        ob.testing();
    }

}
