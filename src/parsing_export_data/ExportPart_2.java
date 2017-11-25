package parsing_export_data;
import edu.duke.*;
import org.apache.commons.csv.*;
import  java.util.*;

public class ExportPart_2 {

        public void countryName(CSVParser parser , String exportOfInterst){
            for (CSVRecord record : parser){
                String export = record.get("Exports");
                if (export.contains(exportOfInterst)){
                    String country = record.get("Country");
                    System.out.println(country);
                }
            }
        }

        public void testing(){
            Scanner scan = new Scanner(System.in);

            FileResource fr = new FileResource();
            CSVParser parser = fr.getCSVParser();
            String exoortInterst = scan.nextLine();
            countryName(parser , exoortInterst);

        }

        public static void main(String[] args){
            ExportPart_2 ob = new ExportPart_2();
            ob.testing();
        }

}