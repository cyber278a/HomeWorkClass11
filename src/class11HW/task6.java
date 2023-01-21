package class11HW;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        String[][] countries = {{"USA", "Mexico", "Canada"},
                {"Brazil", "Argentina", "Peru", "Paraguay"},
                {"France", "Italy", "Greece"},
                {"China", "India", "Pakistan", "Nepal"},
                {"Angola", "Senegal", "Somali"}};
int numberOfCountries=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                numberOfCountries++;

            }
            System.out.println("***************");

        }
        for (String[] all : countries) {
            System.out.println(Arrays.toString(all));
        }
        System.out.println("All the countries: "+numberOfCountries);
    }
}