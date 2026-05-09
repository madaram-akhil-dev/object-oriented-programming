package com.java.oop.abstraction;

public class CertificateServiceImpl implements CertificateService {
    Attender attender;
    PrintService printService;

    CertificateServiceImpl(Attender attender,PrintService printService){
        this.attender = attender;
        this.printService = printService;
    }

    @Override
    public Certificate getCertificate(ApplicationForm applicationForm) {
        if(authenticate("admin", "admin@123")) {
            Certificate generatedCertificate = attender.processCertificate(applicationForm);
            printService.printCertificate(generatedCertificate);

            return generatedCertificate;
        } else
            return null;
    }
}
