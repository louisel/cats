package BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class LouiseSearcherTest {

    @Test
    public void testSearchIntArray() throws Exception {
        LouiseSearcher<Integer> ls = new LouiseSearcher<>();
        int[] testArray = {0,1,2,3,4,5};
        assertEquals("Search int array should return correct index",0,ls.searchIntArray(testArray,0));
    }

    @Test
    public void testSearchGenericArray() throws Exception {
        LouiseSearcher<String> ls = new LouiseSearcher<>();
        String[] testArray = {"a","aa","aaa", "aaaa"};
        assertEquals("Search int array should return correct index",3,ls.searchGenericArray(testArray,"aaaa"));
        assertEquals("Search int array should return -1 if not found",-1,ls.searchGenericArray(testArray,"b"));
    }
}