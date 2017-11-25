package parsing_export_data;

import edu.duke.*;
import org.apache.commons.csv.*;

public class ExportFoods {

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
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        String exoortInterst = "coffee";
        countryName(parser , exoortInterst);

    }

    public static void main(String[] args){
        ExportFoods ob = new ExportFoods();
        ob.testing();
    }

}
