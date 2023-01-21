package class11HW;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[][] groceryList={{"potatoes","carrots","cucumbers"},
                { "mango","bananas","apples","pears"} ,
                { "milk","butter","cheese" }  ,
                {  "chocolate","bars","candy"  }        };
        for (int i = 0; i <groceryList.length ; i++) {
            for (int j = 0; j <groceryList[i].length ; j++) {

                System.out.println(groceryList[i][j]);}
            System.out.println("***************");}

             for (String[] all:groceryList){
                 System.out.println(Arrays.toString(all));


    }}
}
