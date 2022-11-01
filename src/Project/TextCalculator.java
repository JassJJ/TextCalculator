package Project;

public class TextCalculator {
    private int numRows=0; //sparar antal rader
    private String row=""; // sparar radens innehåll

    private String stopGo="go";


    public int getNumRows() { // visar hur många rader det är
        return numRows;
    }

    public void addNumRow() { // lägger till på antalet rader varje gång man skriver en nye rad
        numRows = numRows + 1;

    }

    public String setRow(String row) {
        if(row.contains("stop")|| row.contains("Stop")){
        return stopGo="stoprunning"; //i fall stop so sätter man stopGo till stoprunning vilket stannar whileloopen

        }
        else {
            this.row = this.row +row+" ";// om inte stop så läggs radens innehåll in
            addNumRow();
        }
    return row;

    }

    public String getRow() {//ger tillbaka vad raden är används i testfallet och för att checka
        return row;
    }

    public String getstopGo(){// returnerar stop go till whileloopen så att den ska se om den ska fortsätta eller inte
     return   stopGo;
    }

    public int getChar() {   //ger tillbaka hur många tecken det är

        return row.replace(" ", "").length(); // tar bort mellan rummen i orden så att det inte räknar med det som tecken
    }
}
