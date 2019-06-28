package io.jamers.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest extends AbstractSortTestBase
{
    private final Sort testee = new SelectionSort();

    @Test
    public void testSort() {
        assertEquals(expectedOutput, testee.sort(createInput()));
    }
}
