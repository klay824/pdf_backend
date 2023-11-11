package com.example.pdf.web;

import com.example.pdf.svc.ConverterSvc;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PdfController {

    private ConverterSvc converterSvc;

    @CrossOrigin
    @GetMapping(path = "/getPdf")
    public ResponseEntity<byte[]> getPdf() throws IOException {

        byte[] pdfResponse = ConverterSvc.convertDocToByteArray();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(pdfResponse, headers, HttpStatus.OK);
    }
}
