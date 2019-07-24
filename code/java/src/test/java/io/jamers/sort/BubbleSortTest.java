package io.jamers.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest extends AbstractSortTestBase
{
    private final Sort testee = new BubbleSort();

    @Test
    public void testSort() {
        assertEquals(expectedOutput, testee.sort(createInput()));
    }
}
