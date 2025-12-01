package edu.nik.examples.patterns.adapter.file_convertor;

public class RunApplication {
    public static void main(String[] args) {
// Создаём «старый» конвертер, который понимает только CSV:
                FileConverter fileConverter = new FileConverter();

                // Создаём адаптер, оборачивающий FileConverter:
                TxtToCsvAdapter adapter = new TxtToCsvAdapter(fileConverter);

                // Пробуем конвертировать TXT-файл в XML через адаптер
                String txtFile = "sample.txt";
                String xmlOutput = "result.xml";
                adapter.convertTxtToXml(txtFile, xmlOutput);
                // Результат:
                //  -> Вывод о том, что txt превращён во временный csv
                //  -> fileConverter.convertCsvToXml(...) вызывается

    }
}
