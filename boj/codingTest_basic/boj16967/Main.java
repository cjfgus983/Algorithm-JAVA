package codingTest_basic.boj16967;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aRow = scanner.nextInt();
        int aCol = scanner.nextInt();
        int moveRow = scanner.nextInt();
        int moveCol = scanner.nextInt();
        int[][] arrB = new int[aRow + moveRow][aCol + moveCol];
        int[][] arrA = new int[aRow][aCol];
        // 행 열 입력 받기
        for (int i = 0; i < aRow + moveRow; i++) {
            for (int j = 0; j < aCol + moveCol; j++) {
                arrB[i][j] = scanner.nextInt();
            }
        }
        // 1. 위쪽 처리
        for(int row = 0; row < moveRow; row++){
            for(int col = 0; col < aCol; col++){
                arrA[row][col] = arrB[row][col];
            }
        }
        // 2. 왼쪽 처리
        for(int row = 0;row<aRow;row++){
            for(int col = 0;col<moveCol;col++){
                arrA[row][col] = arrB[row][col];
            }
        }
        // 3. 나머지 부분 처리
        for(int row = moveRow;row<aRow;row++){
            for(int col = moveCol;col<aCol;col++){
                arrA[row][col] = arrB[row][col] - arrA[row-moveRow][col-moveCol];
            }
        }
        // 4. arrA 출력
        for(int row=0;row<aRow;row++){
            for(int col=0;col<aCol;col++){
                System.out.print(arrA[row][col] + " ");
            }
            System.out.println();
        }
    }
}
