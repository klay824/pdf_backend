package com.example.pdf.svc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConverterSvc {

    public static byte[] convertDocToByteArray() throws FileNotFoundException {
        byte[] byteArray = null;

        try {
            FileInputStream inputStream = new FileInputStream("e:\\Coding\\pdf_experiment\\file-sample_150kB.pdf");

            String inputStreamToString = inputStream.toString();
            byteArray = inputStreamToString.getBytes();

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println("IO exception" + e);
        }

        System.out.println(byteArray);
        return byteArray;
    }
}
