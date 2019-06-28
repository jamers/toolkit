package io.jamers.sort;

import java.util.Arrays;
import java.util.List;

public class AbstractSortTestBase
{
    protected final List<String> expectedOutput = Arrays.asList("A", "B", "C", "D", "E", "F");

    protected List<String> createInput() {
        return Arrays.asList("D", "C", "E", "A", "F", "B");
    }
}
