package babys_name;

import edu.duke.*;
import org.apache.commons.csv.*;


public class ListOfBabysName {

    private void listOfName(CSVParser parser) {

        for (CSVRecord r : parser){

            System.out.println("name "+r.get(0) + " Gender " + r.get(1) + " numbers of birth "+ r.get(2));

       }

    }

    public void testing(){

        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        listOfName(parser);
    }



    public static void main(String[] args){
        ListOfBabysName ob = new ListOfBabysName();
        ob.testing();
    }
}
