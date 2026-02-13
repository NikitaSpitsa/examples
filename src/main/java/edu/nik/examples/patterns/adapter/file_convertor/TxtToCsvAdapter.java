package edu.nik.examples.patterns.adapter.file_convertor;

public class TxtToCsvAdapter {
    FileConverter fileConverter;

    public TxtToCsvAdapter(FileConverter fileConverter) {
        this.fileConverter = fileConverter;
    }

    public void convertTxtToXml(String txtFilePath, String outputFile) {
        String tempCsvFilePath = "temp.csv";
        System.out.println("Converting txt [" + txtFilePath + "] to a csv [" + tempCsvFilePath + "] ...");

        fileConverter.convertCsvToXml(tempCsvFilePath, outputFile);
    }

}
