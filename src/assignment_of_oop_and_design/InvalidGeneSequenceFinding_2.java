package assignment_of_oop_and_design;

import edu.duke.*;

public class InvalidGeneSequenceFinding_2 {
    public String geneFind(String dna , String startCodon , String stopCodon){
        int startIndex = dna.indexOf(startCodon);

        if(startIndex== -1)
            return "";

        int endIndex = dna.indexOf(stopCodon , startIndex+3);

        if(endIndex == -1)
            return  "";

        if((endIndex - startIndex +3 ) % 3 == 0)
            return  dna.substring(startIndex , endIndex + 3 );

        return  "";
    }

    public void testSimpleGene(){

        String DNA = "TAGCTATTCTGCCGAATC";                   // gene sequence without ATG and TAA
        String sub_string , startCodon = "ATG", stopCodon = "TAA" ;
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA ,startCodon , stopCodon );
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TCGTAGGCATAATGCCGA";                          // gene sequence without TAA
        System.out.println("DNA strand is : " + DNA);
        sub_string = geneFind(DNA , startCodon , stopCodon);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTGC";                         // gene sequence with ATG and without TAA
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA , startCodon ,  stopCodon);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTGCTAA";                     /// gene sequence with ATG , TAA and sub_string is multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA , startCodon ,  stopCodon);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTTGCTAA";                 // gene sequence sub_string is not multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA , startCodon , stopCodon);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

    }

    public static void main(String[] args){
        InvalidGeneSequenceFinding_2 ob = new InvalidGeneSequenceFinding_2();
        ob.testSimpleGene();
    }
}
