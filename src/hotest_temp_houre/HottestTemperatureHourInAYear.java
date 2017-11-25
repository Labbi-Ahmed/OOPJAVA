package hotest_temp_houre;

import edu.duke.*;
import org.apache.commons.csv.*;

import java.io.*;

public class HottestTemperatureHourInAYear {

    public CSVRecord hottestTempInAYear(CSVParser parser){
        CSVRecord largeSoFar = null;
        for (CSVRecord currentRow : parser){
            if(largeSoFar == null){
                largeSoFar = currentRow;
            }
            else
            {
                double currentTmp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTmp = Double.parseDouble(largeSoFar.get("TemperatureF"));

                if (largestTmp < currentTmp){
                    largeSoFar = currentRow;
                }
            }

        }

        return largeSoFar;
    }

    public void testing(){

        DirectoryResource dr = new DirectoryResource();
        CSVRecord largest = null;
        for (File  f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            largest  = hottestTempInAYear(file.getCSVParser());
           // System.out.println("Hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST") + " Time");
        }
        System.out.println("****Hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST") + " Time");

    }

    public static void main(String[] args){
        HottestTemperatureHourInAYear ob = new HottestTemperatureHourInAYear();
        ob.testing();
    }
}
