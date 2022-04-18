package com.keeper42.leetcode;

import java.util.Arrays;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 * @type leetcode 63
 */
public class UniquePathsWithObstacles {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = 0;
        for (int i = 0; i < m; i++) {
            n = obstacleGrid[i].length;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1) {
                    continue;
                }
                if (i==0 || j==0) {
                    dp[i][j] = 1;
                } else {
                    if (dp[i-1][j] == -1) {
                        dp[i][j] = dp[i][j-1];
                    }
                    if (dp[i][j-1] == -1) {
                        dp[i][j] = dp[i-1][j];
                    }
                    if (dp[i][j-1] != -1 && dp[i-1][j] != -1) {
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }

}
