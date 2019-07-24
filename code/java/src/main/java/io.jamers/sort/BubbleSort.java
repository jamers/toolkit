package io.jamers.sort;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>
{
    @Override public List<T> sort(List<T> in)
    {
        if(in == null || in.isEmpty() || in.size() < 2) {
            return in;
        }

        // For each iteration through the list a value will bubble up to the end of the list in sorted position
        int r = in.size() - 1;
        // Once right (r) position has reached position1 we know everything in position greater or equal to 1 is more than left e.g. list is sorted
        while (r > 1 )
        {
            // Walk up the list comparing pairs of elements and swap them if in wrong order
            for (int l = 0; l < r; l++)
            {
                if (in.get(l).compareTo(in.get(l + 1)) > 0)
                {
                    // Swap them
                    T temp = in.get(l);
                    in.set(l, in.get(l + 1));
                    in.set(l + 1, temp);
                }
            }
            // Position r is now sorted, no need to compare again next time
            r -= 1;
        }

        return in;
    }
}
