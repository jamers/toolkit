package io.jamers.sort;

import java.util.List;

public class InsertionSort<T extends Comparable<T>> implements Sort<T>
{
    @Override public List<T> sort(List<T> in)
    {
        if(in == null || in.isEmpty() || in.size() < 2) {
            return in;
        }

        // i is the id of the element we are sorting next
        for(int i = 1; i < in.size(); i++) {
            // j is the id of the previous element to potentially swap with
            int j = i - 1;

            // While we have not hit the start of the array, and the two elements are in the wrong order
            while(j >= 0 && in.get(j + 1).compareTo(in.get(j)) < 0) {
                // Swap them, then move cursor to inspect next pair
                T temp = in.get(j);
                in.set(j, in.get(j + 1));
                in.set(j + 1, temp);
                j --;
            }
        }
        return in;
    }
}
