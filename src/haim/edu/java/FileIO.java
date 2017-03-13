package haim.edu.java;

import java.io.*;
import java.util.Scanner;

/**
 * Created by hackeru on 13/03/2017.
 */
public class FileIO {


    public static void Write(String fileName, String data) {
        Write(fileName, data, false);
    }

    public static void Write(String fileName, String text, boolean append) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, append);
            fileWriter.write(text + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(fileWriter);
        }
    }






    public static void Read(String fileName) {
        FileReader reader = null;
        try {
            StringBuffer totalBuffer = new StringBuffer();
            //BufferedReader br = new BufferedReader(reader);
            reader = new FileReader(fileName);
            int read = -1;

            while ((read = reader.read()) != -1) {
                char c = (char) read;
                totalBuffer.append(c);
            }
            System.out.println(totalBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(reader);
        }

    }


    public static String BufferedRead(String fileName) {
        BufferedReader reader = null;
        try {
            StringBuilder builder = new StringBuilder();

            reader = new BufferedReader(new FileReader(fileName));
            String line = null;

            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }
            return builder.toString();
            // System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(reader);
        }
        return null;
    }


    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
