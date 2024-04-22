package com.KA.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);

        //SortService service = new SortService();
        //service.bubbleSort();
        //service.chosenSort();
        //service.quickSort();


        Scanner scanner = new Scanner(System.in);
        long countOfMarks = scanner.nextInt();
        long fiveCounter = 0L;
        long currentRow = 0L;
        long maxRow = -1L;

        if (countOfMarks < 7){
            System.out.println(-1);
        } else {
            while(scanner.hasNext()){
                long mark = scanner.nextInt();
                if(mark == 2 || mark == 3){
                    fiveCounter = 0L;
                    currentRow = 0L;
                }
                if(mark == 5) {
                    fiveCounter += 1;
                    currentRow += 1;
                }
                if(currentRow > 6){
                    maxRow = currentRow;
                }
            }
        }
        System.out.println(maxRow);
    }
}
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long countOfMarks = scanner.nextInt();
        long fiveCounter = 0L;
        long currentRow = 0L;
        long maxRow = -1L;

        if (countOfMarks < 7){
            System.out.println(-1);
        } else {
            while(scanner.hasNext()){
                long mark = scanner.nextInt();
                if(mark == 2 || mark == 3){
                    fiveCounter = 0L;
                    currentRow = 0L;
                }
                if(mark == 5) {
                    fiveCounter += 1;
                    currentRow += 1;
                }
                if(currentRow > 6){
                maxRow = currentRow;
                }
            }
        }
        System.out.println(maxRow);
    }
}
 */