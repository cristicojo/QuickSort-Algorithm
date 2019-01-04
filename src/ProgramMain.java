import static java.lang.Math.random;

import java.util.Scanner;

public class ProgramMain {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        //array dat de user
        int input[]={24,2,45,20,56,75,2,56,99,0};
        //int input[]={};

        //int input[] = new int[10];
        //Scanner s = new Scanner(System.in);
        //for (int i = 0; i < input.length; i++) {
            //array dat de la tastatura
            //System.out.print("input[" + i + "]=");
            //input[i] = s.nextInt();

            //random array
            //input[i] = (int) (random() * 100);
        //}


        System.out.print("inainte de sortare:");
        for (int z : input)
            System.out.print(z + " ");

        qs.callquicksort(input);

        System.out.println();
        System.out.print("dupa sortare array crescator:");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }

        System.out.println();
        System.out.print("dupa sortare array descrescator:");
        for (int i = input.length - 1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }

    }
}
