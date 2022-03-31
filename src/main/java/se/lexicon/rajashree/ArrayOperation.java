package se.lexicon.rajashree;

public class ArrayOperation {

    public String getName(){
        String strFirstName = "Erik";
        String strSpace = " ";
        String strLastName = "Svensson";

        String[] arrName = {strFirstName,strSpace,strLastName};
        String strName = String.valueOf(arrName);

        return strName;
    }
}
