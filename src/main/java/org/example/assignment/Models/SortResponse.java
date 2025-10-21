package org.example.assignment.Models;

public class SortResponse {
    private int[] originalArray;
    private int[] sortedArray;
    private String algorithm;
    private String message;

    public SortResponse(int[] originalArray, int[] sortedArray, String algorithm) {
        this.originalArray = originalArray;
        this.sortedArray = sortedArray;
        this.algorithm = algorithm;
        this.message = "Sorted successfully using " + algorithm;
    }


    public int[] getOriginalArray() {
        return originalArray;
    }

    public void setOriginalArray(int[] originalArray) {
        this.originalArray = originalArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
