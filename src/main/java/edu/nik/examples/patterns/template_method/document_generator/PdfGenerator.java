package edu.nik.examples.patterns.template_method.document_generator;

public class PdfGenerator extends DocumentGenerator {
    String pdfContent;

    @Override
     protected void loadTemplate() {
        // Допустим, шаблон PDF — это базовый файл или «костяк»
        pdfContent = "PDF TEMPLATE HEADER\n";
        System.out.println("PdfGenerator: Loaded PDF template.");
    }

    @Override
    protected void fillData(String data) {
        // Дописываем данные в текст PDF
        pdfContent += "PDF body: " + data + "\n";
        System.out.println("PdfGenerator: Filled data into PDF template.");
    }

    @Override
    protected void saveDocument(String outputPath) {
        // Сохраняем pdfContent в файл (упрощённо)
        System.out.println("PdfGenerator: Saving PDF to " + outputPath);
        // Реально здесь могло бы быть использование библиотеки (iText/Apache PDFBox)
    }





}
