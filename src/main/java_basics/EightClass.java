package java_basics;

import java.util.ArrayList;

public class EightClass {
    public static void main(String[] args) {
        String[] languages = {"English", "French", "Spanish", "Portugues", "Hausa", "Yoruba", "Igbo"};
        System.out.println("The second language on the list is : " + languages[1]);
        System.out.println("The sixth language on the list is : " + languages[5]);
        System.out.println("The total number of languaes is : " + languages.length);


        int[] myNumbers = {1, 2, 3, 4, 5, 6};
        System.out.println("The second number on the list is : " + myNumbers[1]);
        System.out.println("The sixth number on the list is : " + myNumbers[5]);
        System.out.println("The total number of languaes is : " + myNumbers.length);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Lambogini");
        cars.add("Tesla");
        cars.add("Pegout");

        System.out.println(cars.size());

//        int count =0;

//        for(int i = 1; i <cars.size(); i++){
//
//        }

    }

}
