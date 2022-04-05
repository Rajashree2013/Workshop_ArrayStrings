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









}
