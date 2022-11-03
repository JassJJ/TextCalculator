package Project;


import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) { //main klassen
        Scanner scan = new Scanner(System.in);
        TextCalculator A = new TextCalculator();
        System.out.println("skriv in din text rad för rad om du vill sluta skriva skriv bara in \"stop\". " +
                "\nnär du är klar skickar vi dig info om din text. ^_^");


        while (true){
            if(A.getstopGo().equals("stoprunning")){//checkar om stopGo innehåller false vilket bara händer i fall setRow hittar ordet stop.
                break;
            } else {
                A.setRow(scan.nextLine());
            }

        }
        System.out.println("Din text har följande:" +
                "\nantal rader: "+A.getNumRows()+
                "\nantal tecken: "+A.getChar()+
                "\nantal ord: "+A.getWords()+
                "\nlängsta ordet: "+A.GetLongestWord());






    }
}
