package hotest_temp_houre;

import edu.duke.*;
import org.apache.commons.csv.*;

public class HotestTempInAMonth {

    public CSVRecord hotestTemp(CSVParser parser){

       CSVRecord largeSofar = null;

        for(CSVRecord currentRow : parser){
            if (largeSofar == null){
                largeSofar = currentRow;
            } 
            else{
                double currentTmp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTmp = Double.parseDouble(largeSofar.get("TemperatureF"));

                if (largestTmp <= currentTmp){
                    largeSofar = currentRow;
                }
            }
        }
        return largeSofar;
    }

    public void testing () {
      FileResource fr = new FileResource();
     CSVRecord largest =  hotestTemp(fr.getCSVParser());
     System.out.println("Hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST") + " Time");
    }

    public static void main(String[] args){
         HotestTempInAMonth ob = new HotestTempInAMonth();
         ob.testing();
    }
}
