package se.lexicon.rajashree;

import java.util.Arrays;

public class NameRepository {

    public static void main(String args[]){
        System.out.println( getSize());
        clear();
        setNames(new String[]{"Dillip", "Nayak", "Sujit", "khamari"});
        find("Simon");
        add("Dillip");
    }


    private static String[] names = {};

    public static int getSize(){
        String[] names = {"Rajashree","Bhuyan"};
        return names.length;
    }

    public static void setNames(String[] names){
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        System.out.println(Arrays.toString(name));
        for (int i = 0; i < names.length ; i ++){
            name[i] = names[i];
        }
        System.out.println(Arrays.toString(name));
    }

    public static void clear(){
        String[] names = {"Rajashree","Bhuyan"};
        names = new String[]{};
        System.out.println(names.length);
    }

    public static String[] findAll(){
        String[] name = {"Erik", "Ulf", "Simon", "Kent"};
        return name;
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
