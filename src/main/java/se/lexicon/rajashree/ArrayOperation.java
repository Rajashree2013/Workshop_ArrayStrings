package se.lexicon.rajashree;

import java.util.Arrays;

public class ArrayOperation {

    public String getName(){
        String strFirstName = "Erik";
        String strSpace = " ";
        String strLastName = "Svensson";

        String[] arrName = {strFirstName,strSpace,strLastName};
        String strName = Arrays.toString(arrName);

        return strName;
    }
}
