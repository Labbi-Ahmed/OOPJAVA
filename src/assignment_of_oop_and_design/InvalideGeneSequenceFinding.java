package assignment_of_oop_and_design;

public class InvalideGeneSequenceFinding {

    public String geneFind(String dna){
        int startIndex = dna.indexOf("ATG");

        if(startIndex== -1)
            return "";

        int endIndex = dna.indexOf("TAA");

        if(endIndex == -1)
            return  "";

        if((endIndex - startIndex +3 ) % 3 == 0)
            return  dna.substring(startIndex , endIndex + 3 );

        return  "";
    }

    public void testSimpleGene(){

        String DNA = "TAGCTATTCTGCCGAATC";                   // gene sequence without ATG and TAA
        String sub_string;
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TCGTAGGCATAATGCCGA";                          // gene sequence without TAA
        System.out.println("DNA strand is : " + DNA);
        sub_string = geneFind(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTGC";                         // gene sequence with ATG and without TAA
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTGCTAA";                     /// gene sequence with ATG , TAA and sub_string is multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

        DNA = "TACATGTCCAGGTGGGTCTTGCTAA";                 // gene sequence sub_string is not multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = geneFind(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }

    }

    public static void main(String[] args){
        InvalideGeneSequenceFinding ob = new InvalideGeneSequenceFinding();
        ob.testSimpleGene();
    }

}
