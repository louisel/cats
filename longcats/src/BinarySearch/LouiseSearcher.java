package BinarySearch;

public class LouiseSearcher<E extends Comparable<E>> {
    public int searchIntArray(Integer[] array, Integer k) {
        return searchArray(array,k,0,array.length);
    }

    public int searchGenericArray(E[] array, E k) {
        return searchArray(array,k,0,array.length);
    }

    public int searchArray(E[] array, E k, int start, int end) {
        int middle = (start+end)/2;
        if (start>end)
            return -1;
        if (array[middle].compareTo(k) > 0)
            return searchArray(array,k,start,middle-1);
        else if (array[middle].compareTo(k) < 0)
            return searchArray(array,k,middle+1,end);
        else
            return middle;
    }
}