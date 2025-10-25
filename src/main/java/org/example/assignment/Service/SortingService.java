package org.example.assignment.Service;
import org.example.assignment.Models.DataSet;
import org.example.assignment.Models.SortResponse;

public interface SortingService {
    SortResponse sortWithBubbleSort(int[] data);
    SortResponse sortWithSelectionSort(int[] data);
    SortResponse sortWithQuickSort(int[] data);
    SortResponse sortWithAlgorithm(String algorithm, int[] data);

}
