package Homework;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int size = 500;
        double[][] A = generateRandomMatrix(size, size);
        double[][] B = generateRandomMatrix(size, size);
        double[][] C = new double[size][size];

        int numThreads = 4;
        Thread[] threads = new Thread[numThreads];
        int rowsPerThread = size / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startRow = i * rowsPerThread;
            int endRow = (i == numThreads - 1) ? size : startRow + rowsPerThread;
            threads[i] = new Thread(new Worker(A, B, C, startRow, endRow));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Matrix multiplication completed.");
    }

    private static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }
}

class Worker implements Runnable {
    private final double[][] A;
    private final double[][] B;
    private final double[][] C;
    private final int startRow;
    private final int endRow;

    public Worker(double[][] A, double[][] B, double[][] C, int startRow, int endRow) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public void run() {
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
}
