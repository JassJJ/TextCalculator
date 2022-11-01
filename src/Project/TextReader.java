package Project;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("skriv in din text rad för rad om du vill sluta skriva skriv bara in \"stop\".");
        TextCalculator A = new TextCalculator();

        while (true){
            if(A.getstopGo().equals("stoprunning")){//checkar om stopGo innehåller false vilket bara händer i fall setRow hittar ordet stop

                break;
            }
            else {
                A.setRow(scan.nextLine());
            }


        }
        System.out.println("outside loop");
        System.out.println("antal rader är: "+A.getNumRows());
        System.out.println("antal tecken är: "+A.getChar());
        System.out.println(A.getRow());


    }
}
