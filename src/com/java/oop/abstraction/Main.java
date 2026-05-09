package com.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "customer1", "customer1@gmail.com","2342323","2342342342323");
        ApplicationForm applicationForm = new ApplicationForm(1,"Birth Certificate",customer);
        Mro mro = new Mro(1,"MRO1",1000);
        Attender attender = new Attender(1,"attender1",1000,mro);
        PrintService printService = new ColorPrintService();

        //  CertificateService certificateService = new CertificateServiceImpl(attender);
        CertificateService certificateService = new CertificateServiceImpl2(mro,printService);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        //printService.printCertificate(certificate);
        //CertificateService.username = "13234";

    }
}
