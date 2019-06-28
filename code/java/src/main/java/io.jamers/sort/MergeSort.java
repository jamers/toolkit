package io.jamers.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Recursively split the List in half until you have single elements.
 * Trivially sort two single elements into a sorted List.
 * Bubble back up through recursion merging always two sorted lists, by selecting the lowest value from the start of either List
 */
public class MergeSort<T extends Comparable<T>> implements Sort<T>
{
    public List<T> sort(List<T> in)
    {
        if(in == null || in.isEmpty() || in.size() < 2) {
            return in;
        }
        int size = in.size();
        int half = size / 2;
        List<T> left = in.subList(0, half);
        List<T> right = in.subList(half, size);

        left = sort(left);
        right = sort(right);

        List<T> out = new ArrayList<T>();

        int leftSize = left.size();
        int rightSize = right.size();
        int leftPointer = 0;
        int rightPointer = 0;
        for(int i = 0; i < size; i ++) {
            if(rightPointer == rightSize) {
                out.add(left.get(leftPointer));
                leftPointer ++;
            } else if (leftPointer == leftSize) {
                out.add(right.get(rightPointer));
                rightPointer ++;
            } else
            {
                T leftElement = left.get(leftPointer);
                T rightElement = right.get(rightPointer);
                if (leftElement.compareTo(rightElement) > 0)
                {
                    out.add(rightElement);
                    rightPointer++;
                }
                else
                {
                    out.add(leftElement);
                    leftPointer++;
                }
            }
        }

        return out;
    }
}
