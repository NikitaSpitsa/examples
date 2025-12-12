Ситуация:
• Есть класс FileConverter, который умеет конвертировать CSV-файл в XML (через метод convertCsvToXml).
• Появилась необходимость конвертировать TXT → XML, но менять FileConverter нельзя.
• Нужно «превратить» входной txt-файл во временный CSV (или виртуально подать его как CSV),
а затем вызвать существующий метод convertCsvToXml(...) из FileConverter.
Данные классы/интерфейсы, которые считаем «заданными на входе»:

Класс FileConverter, который менять нельзя:
public class FileConverter {
public void convertCsvToXml(String csvFilePath, String outputXmlPath) {
System.out.println("Converting CSV [" + csvFilePath + "] to XML [" + outputXmlPath + "] ...");
// Здесь логика парсинга CSV и генерации XML
}
}
Исходные TXT-файлы, которые нужно конвертировать в XML, а FileConverter понимает только CSV.
Задача:
• Создать класс-адаптер TxtToCsvAdapter, у которого будет метод convertTxtToXml(String txtFilePath, String outputXmlPath).
• Внутри этого метода преобразовать TXT в некий CSV-формат (либо создать временный файл в нужном формате, либо строить CSV-данные в памяти).
Затем вызвать fileConverter.convertCsvToXml(...) с этим «подставным» csvFilePath.

Демонстрация (main):
public class FileConvertTest {
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