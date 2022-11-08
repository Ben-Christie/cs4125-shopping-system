package Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
Connects to the csv file and pulls all information from in
 */
public class ConnectDatabase {
    private String dbInformation = "";
    public ConnectDatabase(String filepath) {

        //parsing a CSV file into Scanner class constructor
        //src\\co\\company\\database\\users.csv
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            dbInformation += sc.next() + ",";  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
        dbInformation = dbInformation.replaceAll("(\\r|\\n)", "");
    }

    public String dbInformation(){
        System.out.println(dbInformation);
        return dbInformation;
    }
}
