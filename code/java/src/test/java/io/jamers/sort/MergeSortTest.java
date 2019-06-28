package io.jamers.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortTest extends AbstractSortTestBase
{
    private final Sort testee = new MergeSort();

    @Test
    public void testSort() {
        assertEquals(expectedOutput, testee.sort(createInput()));
    }
}
