package io.jamers.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest extends AbstractSortTestBase
{
    private final Sort testee = new InsertionSort();

    @Test
    public void testSort() {
        assertEquals(expectedOutput, testee.sort(createInput()));
    }
}
