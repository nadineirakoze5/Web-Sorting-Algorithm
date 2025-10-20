package org.example.assignment.Controllers;

import org.example.assignment.Models.DataSet;
import org.example.assignment.Models.SortResponse;
import org.example.assignment.Service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;

@RestController
@RequestMapping("/api/sort")
@CrossOrigin(origins = "*")
public class SortingController {

    private final SortingService sortingService;

    @Autowired
    public SortingController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    // GET endpoint for bubble sort
    @GetMapping("/bubble")
    public ResponseEntity<SortResponse> bubbleSort(@RequestParam int[] data) {
        SortResponse response = sortingService.sortWithBubbleSort(data);
        return ResponseEntity.ok(response);
    }

    // GET endpoint for selection sort
    @GetMapping("/selection")
    public ResponseEntity<SortResponse> selectionSort(@RequestParam int[] data) {
        SortResponse response = sortingService.sortWithSelectionSort(data);
        return ResponseEntity.ok(response);
    }

    // GET endpoint for quick sort
    @GetMapping("/quick")
    public ResponseEntity<SortResponse> quickSort(@RequestParam int[] data) {
        SortResponse response = sortingService.sortWithQuickSort(data);
        return ResponseEntity.ok(response);
    }

    // POST endpoint for dynamic algorithm selection
    @PostMapping("/{algorithm}")
    public ResponseEntity<SortResponse> sortWithAlgorithm(
            @PathVariable String algorithm,
            @RequestBody DataSet dataSet) {
        try {
            SortResponse response = sortingService.sortWithAlgorithm(algorithm, dataSet.getNumbers());
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(
                    new SortResponse(dataSet.getNumbers(), dataSet.getNumbers(),
                            "Unknown Algorithm", 0)
            );
        }
    }

    // CRUD-like endpoint to get available algorithms
    @GetMapping("/algorithms")
    public ResponseEntity<String[]> getAvailableAlgorithms() {
        String[] algorithms = {"bubble", "selection", "quick"};
        return ResponseEntity.ok(algorithms);
    }

    // Health check endpoint
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Sorting API is running!");
    }
}