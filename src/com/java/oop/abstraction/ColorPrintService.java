package com.java.oop.abstraction;

public class ColorPrintService implements PrintService{
    @Override
    public void printCertificate(Certificate certificate) {
        System.out.println("Printing certificate in color");
        System.out.println("Id : " + certificate.id
                + "\n Name : " + certificate.name
                + "\n Name : " + certificate.issuedBy
                + "\n Name : " + certificate.issuedTo
                + "\n Name : " + certificate.issuedDate);
    }
}
