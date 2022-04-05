package se.lexicon.rajashree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NameRepositoryTest {
    private String[] data;

    @Before
    public void setUp() {
        NameRepository.clear();
        String[] starterData = {"Mehrdad Javan", "Simon Elbrink", "Marcus Gudmundsen"};
        data = starterData;
        NameRepository.setNames(starterData);
    }

    @Test
    public void getSize() {
        int expectedSize = 3;
        int actual = NameRepository.getSize();
        assertEquals(actual, expectedSize);
    }
    @Test
    public void setNames() {
        NameRepository.clear();
        String[] data = {"Erik Svensson", "Ulf Bengtsson"};
        int expectedSize = 2;
        NameRepository.setNames(data);
        assertEquals(NameRepository.getSize(), expectedSize);
    }

    @Test
    public void findAll() {
        NameRepository.clear();
        String[] data = {"Erik Svensson", "Ulf Bengtsson"};
        NameRepository.setNames(data);
        String[] data1 = NameRepository.findAll();
        assertEquals(data, data1);
    }


    @Test
    public void find() {
        NameRepository.clear();
        String[] data = {"Erik Svensson", "Ulf Bengtsson","Dillip Nayak","Rajashree Bhuyan"};
        String name = "Rajashree Bhuyan";
        NameRepository.setNames(data);
        String data1 = NameRepository.find(name);
        System.out.println(data1);
        assertEquals(name, data1);
    }

    @Test
    public void add() {
        NameRepository.clear();
        String[] data = {"Erik Svensson", "Ulf Bengtsson","Dillip Nayak","Rajashree Bhuyan"};
        String name = "Shubham";
        NameRepository.setNames(data);
        boolean data1 = NameRepository.add(name);
        assertEquals(false, data1);
    }

    @Test
    public void firstName() {
        NameRepository.clear();
        String[] data = {"Erik Svensson"};
        String name = "Erik";
        NameRepository.setNames(data);
        String[] data1 = NameRepository.findByFirstName(name);
        System.out.println(data1.toString());
        assertEquals(data, data1);
    }

    @Test
    public void lastName() {
        NameRepository.clear();
        String[] data = {"Erik Svensson"};
        String name = "Svensson";
        NameRepository.setNames(data);
        String[] data1 = NameRepository.findByLastName(name);
        System.out.println(data1.toString());
        assertEquals(data, data1);
    }








}
