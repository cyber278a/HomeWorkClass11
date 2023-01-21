package class11HW;

public class task4 {
    public static void main(String[] args) {
        int[][] arr={   { 11,54,8},
                           {44,32,33},
                           {33,43,21},};
        int sum1=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              sum1=sum1+arr[i][j];}}


            System.out.println(sum1);




    }
}
