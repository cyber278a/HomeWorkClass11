package class11HW;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[][] cars={{"BMW","Opel","Mercedes"},
                { "Ford","GMC","Tesla","Chevrolet"} ,
                { "KIA","Hyundai","Genesis" }  ,
                {  "Ferrari","Fiat","Lamborghini"  }        };
        for (int i = 0; i <cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {

                System.out.println(cars[i][j]);}
            System.out.println("***************");}
        for (String[] allCars:cars) {
            System.out.println(Arrays.toString(allCars));}

    }}

