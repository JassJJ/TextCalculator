package Project;



public class TextCalculator {// logik klassen
    private int numRows=0; //sparar antal rader
    private String row=""; // sparar radens innehåll
    private String stopGo="go";// är till för att stoppa while-loopen
    private String[] words;// array av alla ord
    private String longestWord=""; // längsta ordet

    public int getNumRows() { // visar hur många rader det är
        return numRows;
    }
    public void addNumRow() { // lägger till på antalet rader varje gång man skriver en ny rad
        numRows = numRows + 1;

    }
    public String setRow(String row) {
        if(row.contains("stop")|| row.contains("Stop")){
        return stopGo="stoprunning"; //i fall stop so sätter man stopGo till stoprunning vilket stannar while-loopen

        } else {
            this.row = this.row +row+" ";// om inte stop så läggs radens innehåll in i en enda string med ett till lagt mellanrum
            addNumRow();// lägger till i antalet rader
        }
    return row;

    }
    public String getRow() {//ger tillbaka vad row stringens innehåll är används bara i testfallet och för att checka

        return row;
    }
    public String getstopGo(){// returnerar stop go till while-loopen så att den ska se om den ska fortsätta eller inte

        return   stopGo;
    }
    public int getChar() {   //ger tillbaka hur många tecken det är

        return row.replace(" ", "").length(); // tar bort mellan rummen i orden så att det inte räknar med det som ett tecken
    }

    public int getWords() { // ger tillbaka antalet ord
        if (row.equals("") || row.isEmpty()) { // ifall man inte skrivit något och raden är tom ska inga ord räknas och det blir 0
            return 0;
        }else {
            words = row.split("\\s+"); // delar up orden i row stringen utifrån vart mellanrum är och lägger sedan orden i en array
            return words.length;
        }
    }
    public String GetLongestWord() {
        if (words==null) {
            longestWord = ""; // i fall man inte skriver något alls och bara stop
        } else {
            for (String word : words) { // för varje ord i array av ord
                if (word.length() > longestWord.length()) {//för varje bokstav i ordet i arrayn
                    // jämförs den med de longetWord som hela tiden fulls in i ordning av de längsta ordet tills det inte finns ett ord i arrayn som är längre än det och returer då den
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}
