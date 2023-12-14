package com.example.imsp.module1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.imsp.R;

import java.util.Scanner;

public class CellsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cells);
    }

    public static void main(String[] args) {
//        int[][] a = {{11, 10}, {22, 20}, {33, 30, 333}, {44, 40}, {55, 50}, {66, 60}, {77, 70}};
//        System.out.println(Arrays.toString(a));
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[][] a = new int[n1][n2];
        for (int i = 0; i < a.length; i++) {
//            Arrays.fill(a[i], (int) (Math.random() * 10));
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 == 0) {
//                    a[i][j] = (i) * a.length + j + 1; если строки=столбцы
                    a[i][j] = (j + 1) + i * a[i].length;
                } else {
                    a[i][j] = a[i].length - j + i * a[i].length;
//                    a[i][j] = (i + 1) * a.length - j; если строки=столбцы
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
//            System.out.println(Arrays.toString(a[i]));
        }
    }
}