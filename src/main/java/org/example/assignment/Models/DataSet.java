package org.example.assignment.Models;

public class DataSet {
    private Long id;
    private int[] numbers;
    private String name;

    public DataSet(Long id, int[] numbers, String name) {
        this.id = id;
        this.numbers = numbers;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}