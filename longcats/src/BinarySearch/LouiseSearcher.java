package BinarySearch;

public class LouiseSearcher<E extends Comparable<E>> {
    public int searchIntArray(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (array[middle] >= k) end = middle;
            else start = middle+1;
        }
        return start;
    }

    public int searchGenericArray(E[] array, E k) {
        return searchArray(array, k, 0, array.length-1);
    }

    public int searchArray(E[] array, E k, int start, int end) {
        int middle = (start + end) / 2;

        if (start == end)
            return (array[middle].equals(k) ? middle : -1);
        if (array[middle].compareTo(k) > 0)
            return searchArray(array, k, start, middle - 1);
        else if (array[middle].compareTo(k) < 0)
            return searchArray(array, k, middle + 1, end);
        else
            return middle;
    }
}