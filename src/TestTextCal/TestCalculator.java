package TestTextCal;

import Project.TextCalculator;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class TestCalculator {
  @Test
  public void getRowNumDefault() {
    TextCalculator calc = new TextCalculator();
    int expected = 0;
    int actual = calc.getNumRows();

    assertEquals(expected, actual);
  }
  @Test
  public void addNumRow(){
    TextCalculator calc = new TextCalculator();
    calc.addNumRow();
    calc.addNumRow();
    int expected = 2;

    int actual = calc.getNumRows();
    assertEquals(expected, actual);
  }

  @Test
  public void saveRowText(){
    TextCalculator calc = new TextCalculator();
    calc.setRow("hej jag heter Jasmijn");
    String expected = "hej jag heter Jasmijn";
    String actual = calc.getRow();
    assertEquals(expected,actual);
  }
  @Test void checkStopTrue(){
    TextCalculator calc = new TextCalculator();
    calc.setRow("hej jag heter jasmijn stop");
    String expected ="" ;
    String actual = calc.getRow();
    assertEquals(expected,actual);

  }
  @Test
  public void Charcounter(){
    TextCalculator calc = new TextCalculator();
    calc.setRow("hej jag heter jasmijn");
    calc.getChar();
    int expected = 18;
    int actual= calc.getChar();
    assertEquals(expected,actual);


  }





}
