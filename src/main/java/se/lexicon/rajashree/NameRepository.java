package se.lexicon.rajashree;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static void main(String args[]) {

        setNames(new String[]{"Dillip", "Nayak", "Sujit", "khamari"});


    }

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        // use Arrays.copyOf()
        NameRepository.names = names;
    }

    /**
     * Should completely empty the array.
     */
    public static void clear() {
        names = new String[0];
    }

    /**
     * Returns all names in a new array
     *
     * @return String[] This returns all array elements
     */
    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        //String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        String strVal = null;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == fullName) {
                strVal = names[i];
                break;
            } else {
                strVal = null;
            }
        }
        return strVal;
    }

    public static boolean add(final String fullName) {
        //String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        boolean bolVal = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == fullName) {
                bolVal = false;
                break;
            }
            if (!bolVal) {
                names = Arrays.copyOf(names, names.length + 1);
                names[names.length - 1] = fullName;
                bolVal = true;
            }
        }
        return bolVal;
    }

    private static String[] addToArray(String[] source, String newName) {
        String[] tmp = Arrays.copyOf(source, source.length + 1);
        tmp[tmp.length - 1] = newName;
        return tmp;
    }


    public static String[] findByFirstName(final String firstName) {

        // step1: traverse on array
        // step2: split the fullName with whitespace and get the firstName
        // step3: write a condition or if statement
        // step4: define an empty array + add the found names to array
        // step5: return the array

        String[] result = {};
        for (String element : names) {
            String[] fullNameArray = element.split(" "); //["Erik", "Svensson"]
            String fName = fullNameArray[0];
            if (fName.equalsIgnoreCase(firstName)) {
                result = addToArray(result, element);
            }
        }
        return result;
    }

    public static String[] findByLastName(final String lastName) {

        String[] result = {};
        for (String element : names) {
            String[] fullNameArray = element.split(" "); //["Erik", "Svensson"]
            int nameArrayLength = fullNameArray.length;
            String fName = fullNameArray[nameArrayLength - 1];
            if (fName.equalsIgnoreCase(lastName)) {
                result = addToArray(result, element);
            }

        }
        return result;

    }


    public static boolean update(final String original, final String updatedName) {
        int originalIndex = -1;
        for (int i = 0; i < names.length; i++) {
            String content = names[i];
            if (content.equalsIgnoreCase(original)) {
                originalIndex = i;
            }
        }
        if (originalIndex == -1) {
            return false;
        }

        int updatedIndex = -1;
        for (int i = 0; i < names.length; i++) {
            String content = names[i];
            if (content.equalsIgnoreCase(updatedName)) {
                updatedIndex = i;
            }
        }

        if (updatedIndex != -1) {
            return false;
        }
        names[originalIndex] = updatedName;

        return true;
    }


    public static boolean remove(String fullName) {

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        int findIndex = Arrays.binarySearch(names, fullName);
        if (findIndex < 0) {
            return false;
        }
        String[] anotherArray = new String[names.length - 1];
        int sequencer = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == findIndex) {
                continue;
            }
            anotherArray[sequencer++] = names[i];
        }
        names = anotherArray;
        return true;
    }

}
