package io.jamers.sort;

import java.util.List;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>
{
    @Override public List<T> sort(List<T> in)
    {
        if(in == null || in.isEmpty() || in.size() < 2) {
            return in;
        }

        int size = in.size();
        int indexOfLowest;
        T lowestSoFar;

        for(int indexToReplace = 0; indexToReplace < size; indexToReplace++) {
            indexOfLowest = indexToReplace;
            lowestSoFar = in.get(indexToReplace);
            for(int indexForInspection = indexToReplace + 1; indexForInspection < size; indexForInspection++) {
                T inspected = in.get(indexForInspection);
                if(inspected.compareTo(lowestSoFar) < 0) {
                    lowestSoFar = inspected;
                    indexOfLowest = indexForInspection;
                }
            }
            if(indexToReplace != indexOfLowest){
                T temp = in.get(indexToReplace);
                in.set(indexToReplace, in.get(indexOfLowest));
                in.set(indexOfLowest, temp);
            }
        }

        return in;
    }
}
