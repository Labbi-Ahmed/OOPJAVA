package assignment_of_oop_and_design;

import edu.duke.*;

public class InvalideGeneSequenceFinding_3 {

    public boolean twoOccurrence(String stringa , String stringb) {

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
}
