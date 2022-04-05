package se.lexicon.rajashree;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize(){
        return names.length;
    }
    public static void setNames(String[] names) {
        // use Arrays.copyOf()
        NameRepository.names = names;
    }
    /**
     * Should completely empty the array.
     */
    public static void clear(){
        names = new String[0];
    }

    /**
     * Returns all names in a new array
     *
     * @return String[] This returns all array elements
     */
    public static String[] findAll(){
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        String strVal = null;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == fullName) {
                strVal =  name[i];
                break;
            } else {
                strVal =  null;
            }
        }
        return strVal;
    }

    public static boolean add(final String fullName) {
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        boolean bolVal = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == fullName) {
                bolVal = false;
                break;
            } else {
                name = Arrays.copyOf(name, name.length + 1);
                name[name.length - 1] = fullName;
                System.out.println(Arrays.toString(name));
                bolVal = true;
            }
        }
        return bolVal;
    }

    public static String[] findByFirstName(final String firstName){
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        int nameArrayLength = name.length;
        String[] myarray = new String[nameArrayLength];
        for (int i = 0; i < name.length; i++) {
            if (name[i] == firstName) {
                myarray[i] = name[i];
            }
        }
        return myarray;
    }

    public static String[] findByLastName(final String lastName){
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        int nameArrayLength = name.length;
        String[] myarray = new String[nameArrayLength];
        for (int i = 0; i < name.length; i++) {
            if (name[i] == lastName) {
                myarray[i] = name[i];
            }
        }
        return myarray;
    }




}
