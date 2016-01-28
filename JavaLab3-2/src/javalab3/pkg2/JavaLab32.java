package javalab3.pkg2;

/**
 *
 * @author BedirTapkan
 */
import java.util.Scanner;
public class JavaLab32
{
public static void main (String[] args)
{
String phrase = "This is a String test.";
int phraseLength; // number of characters in the phrase String
int middleIndex; // index of the middle character in the String
String firstHalf; // first half of the phrase String
String secondHalf; // second half of the phrase String
String switchedPhrase; //a new phrase with original halves switched
String middle3;
// compute the length and middle index of the phrase
phraseLength = phrase.length();
middleIndex = phraseLength / 2;
// get the substring for each half of the phrase
firstHalf = phrase.substring(0,middleIndex);
secondHalf = phrase.substring(middleIndex, phraseLength);
// concatenate the firstHalf at the end of the secondHalf
switchedPhrase = secondHalf.concat(firstHalf);
// print information about the phrase
middle3 = phrase.substring(middleIndex-1,middleIndex+2);

switchedPhrase = switchedPhrase.replace(" ", "*");
Scanner scan = new Scanner(System.in);
System.out.println("Please enter your hometown's city");
String city = scan.nextLine();
System.out.println("Please enter your hometown's state");
String state = scan.nextLine();


System.out.println();
System.out.println ("Original phrase: " + phrase);
System.out.println ("Length of the phrase: " + phraseLength +
" characters");
System.out.println ("Index of the middle: " + middleIndex);
System.out.println ("Character at the middle index: " +
phrase.charAt(middleIndex));
System.out.println ("Switched phrase: " + switchedPhrase);
System.out.println ("New ones " + middle3 );
System.out.println ( state.toUpperCase()  + city.toLowerCase() +  state.toUpperCase() );
System.out.println();

}
}
