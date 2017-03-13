package haim.edu.java;

import java.util.Scanner;

/**
 * Created by hackeru on 13/03/2017.
 */
public class UserIO {
    public static int getInt(String message){
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.nextInt();
    }

    public static String getString(String message){
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.next();
    }

}
