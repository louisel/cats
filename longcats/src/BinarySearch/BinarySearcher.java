package BinarySearch;

public interface BinarySearcher<E> {
    /**
     * WARMUP!
     * Returns the index of k in sorted array
     * k is guaranteed to be in array
     */
    public int searchIntArray(Integer[] array, Integer k);

    /**
     * Returns the index of k in sorted array
     * Returns -1 if k is not found in array
     */
    public int searchGenericArray(E[] array, E k);
}