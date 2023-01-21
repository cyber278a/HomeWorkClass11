package class11HW;

public class task5 {
    public static void main(String[] args) {
        int[][] arr={   { 11,54,8},
                         {44,32,37},
                         {33,43,21},
                           {7, 5,4} };
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                }
            }
}}
