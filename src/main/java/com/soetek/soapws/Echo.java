package com.soetek.soapws;


import java.io.BufferedReader;
import java.io.FileReader;

public class Echo {
    public String echo(String str) {
        return str;
    }

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine();
            while(line!= null) {
                if (line.contains("Order")){
                    System.out.println(line);
                }
                line = in.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
