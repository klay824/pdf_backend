package com.example.pdf.svc;

import java.io.*;

public class ConverterSvc {

    public static byte[] convertDocToByteArray() throws IOException {

        byte[] byteArray = null;

        byte[] bytes = null;
        int pdfBytes;

        try {
            String sourcePath = "e:\\Coding\\pdf_experiment\\pdf_backend\\src\\main\\resources\\file-sample_150kB.pdf";
            File file = new File(sourcePath);
            InputStream inputStream = new FileInputStream(file);

            bytes = new byte[(int) file.length()];

            inputStream.read(bytes);

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println("IO exception" + e);
        }

        return bytes;
    }
}
