package com.keeper42;

import java.util.Scanner;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/2/23
 * Towers of Hannoi Problem
 */
public class HannoiTowers {

    public static void main(String[] args) {
        System.out.println("请输入盘子数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hannoi(n, 'A', 'B', 'C');
        scanner.close();
    }

    public static void hannoi(int n, char A, char B, char C) {
        if (n == 1) {
            move(n, A, C);
        } else {
            hannoi(n - 1, A, C, B);
            move(n, A, C);
            hannoi(n - 1, B, A, C);

        }
    }

    public static void move(int disk, char M, char N) {
        System.out.println("盘子" + disk + " " + M + "-->" + N);
    }

}
