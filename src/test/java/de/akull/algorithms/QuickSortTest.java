package de.akull.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    @Test
    public void Should_Sort_Ascending() {
        int[] xs = new int[] {15, 3, 2, 1, 9, 5, 7, 8, 6};

        QuickSort.quicksort(xs);

        assertThat(xs).containsSequence(1, 2, 3, 5, 6, 7, 8, 9, 15);
    }
}
