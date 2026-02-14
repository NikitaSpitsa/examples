package edu.nik.examples.patterns.template_method.document_generator;

public class HtmlGenerator extends DocumentGenerator {

    String htmlContent;

    @Override
    protected void loadTemplate() {
        // Загружаем HTML-шаблон
        htmlContent = "<html><head><title>Template</title></head><body>\n";
        System.out.println("HtmlGenerator: Loaded HTML template.");
    }

    @Override
    protected void fillData(String data) {
        // Вставляем данные между тегами
        htmlContent += "<h1>Document Data</h1><p>" + data + "</p>\n";
        System.out.println("HtmlGenerator: Inserted data into HTML template.");
    }

    @Override
    protected void saveDocument(String outputPath) {
        // Сохраняем htmlContent
        htmlContent += "</body></html>";
        System.out.println("HtmlGenerator: Saving HTML to " + outputPath);
    }
}
