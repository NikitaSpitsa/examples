Есть классы со следующей логикой.

class HtmlGenerator{

void generateDocument(String template, String data, String outputPath){
        // Загружаем HTML-шаблон
       String htmlContent = "<html><head><title>Template</title></head><body>\n";
        System.out.println("HtmlGenerator: Loaded HTML template.");
        // Вставляем данные между тегами
        htmlContent += "<h1>Document Data</h1><p>" + data + "</p>\n";
        System.out.println("HtmlGenerator: Inserted data into HTML template.");
        // Сохраняем htmlContent
        htmlContent += "</body></html>";
        System.out.println("HtmlGenerator: Saving HTML to " + outputPath);
        // Здесь можно было бы записать строку в реальный файл
}
}
class PdfGenerator extends DocumentGenerator {


    void generateDocument() {
         // Допустим, шаблон PDF — это базовый файл или «костяк»
       String pdfContent = "PDF TEMPLATE HEADER\n";
        System.out.println("PdfGenerator: Loaded PDF template.");
         // Дописываем данные в текст PDF
        pdfContent += "PDF body: " + data + "\n";
        System.out.println("PdfGenerator: Filled data into PDF template.");
        // Сохраняем pdfContent в файл (упрощённо)
        System.out.println("PdfGenerator: Saving PDF to " + outputPath);
        // Реально здесь могло бы быть использование библиотеки (iText/Apache PDFBox)
    }
}

class DocumentDemo {
    public static void main(String[] args) {
        DocumentGenerator pdfGen = new PdfGenerator();
        pdfGen.generateDocument("Hello, PDF World!", "output.pdf");
        System.out.println("-----------------------");
        DocumentGenerator htmlGen = new HtmlGenerator();
        htmlGen.generateDocument("Hello, HTML World!", "output.html");


    }
}
Преобразовать, используя паттерн Шаблонный метод

