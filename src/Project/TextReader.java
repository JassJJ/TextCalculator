package Project;


import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("skriv in din text rad för rad om du vill sluta skriva skriv bara in \"stop\". " +
                "\nnär du är klar skickar vi dig info om din text. ^_^");
        TextCalculator A = new TextCalculator();

        while (true){
            if(A.getstopGo().equals("stoprunning")){//checkar om stopGo innehåller false vilket bara händer i fall setRow hittar ordet stop

                break;
            }
            else {
                A.setRow(scan.nextLine());

            }


        }
        System.out.println("Din text har följande:");
        System.out.println("antal rader: "+A.getNumRows());
        System.out.println("antal tecken: "+A.getChar());
        System.out.println("antalet ord: "+ A.getWords());
        System.out.println("längsta ordet: "+A.GetLongestWord());





    }
}
