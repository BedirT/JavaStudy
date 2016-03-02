// **************************************************************** // BaseballStats.java
//
// Reads baseball data in from a comma delimited file. Each line // of the file contains a name followed by a list of symbols
// indicating the result of each at bat: h for hit, o for out,
// w for walk, s for sacrifice. Statistics are computed and
// printed for each player.
// ****************************************************************

import java.util.Scanner;
import java.io.*;

public class BaseballStats {
    //-------------------------------------------------
    //  Reads baseball stats from a file and counts
    //  total hits, outs, walks, and sacrifice flies
    //  for each player.
    //-------------------------------------------------

    public static void main(String[] args) throws IOException {
        Scanner fileScan, lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        // Read and process each line of the file
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
       
        while(fileScan.hasNextLine()){
            Scanner lineScan = new Scanner(fileScan);
            while(lineScan.hasNextLine()) {
                scan = lineScan.nextLine();

            }
        }
        
    }
    
}

//First add a while loop that reads each line in the file and prints out each part
//(name, then each at bat, without the commas) in a way similar to the URLDissector
//program in Listing 5.10 of the text. In particular inside the loop you need to
//a. read the next line from the file
//b. create a comma delimited scanner (lineScan) to parse the line c. read and
//print the name of the player, and finally,
//d. have a loop that prints each at bat code.
