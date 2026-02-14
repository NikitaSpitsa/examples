package edu.nik.examples.patterns.template_method.document_generator;

public class DocumentDemo {
    public static void main(String[] args) {
        DocumentGenerator pdfGen = new PdfGenerator();
        pdfGen.generateDocument("Hello, PDF World!", "output.pdf");
        System.out.println("-----------------------");
        DocumentGenerator htmlGen = new HtmlGenerator();
        htmlGen.generateDocument("Hello, HTML World!", "output.html");

    }
}
