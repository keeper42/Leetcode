package com.keeper42.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 */
public class Shudu {

    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet;
        Set<Character> colSet;
        for (int i = 0; i < 9; i++) {
            rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ('.' == board[i][j]) {
                    continue;
                }
                if (rowSet.contains(board[i][j])) {
                    return false;
                } else {
                    rowSet.add(board[i][j]);
                }
            }
            colSet = new HashSet<>();
            for (int h = 0; h < 9; h++) {
                if ('.' == board[h][i]) {
                    continue;
                }
                if (colSet.contains(board[h][i])) {
                    return false;
                } else {
                    colSet.add(board[h][i]);
                }
            }
        }
        Set<Character> squareSet;
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                squareSet = new HashSet<>();
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if ('.' != board[i + m][j + n]) {
                            if (squareSet.contains(board[i + m][j + n])) {
                                return false;
                            } else {
                                squareSet.add(board[i + m][j + n]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
