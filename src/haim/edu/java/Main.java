package haim.edu.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

/*
       FileIO.Write("2.txt","Hello Text 1st Line, \n" +
               "Hello Text 2nd Line");
        //FileIO.Read("2.txt");
        System.out.println(FileIO.BufferedRead("2.txt"));
        FileIO.Read("1.txt");
*/
        int userChoise = 0;
        while (userChoise != 3){

            userChoise = UserIO.getInt(
                "1) Add Name \n" +
                "2) Show the Names \n" +
                "3) Exit");

            if (userChoise == 1) {
                FileIO.Write("names.txt", UserIO.getString("Enter the name"), true);
            }else if(userChoise == 2){
                System.out.println(FileIO.BufferedRead("names.txt"));
            }

      }


    }
}
