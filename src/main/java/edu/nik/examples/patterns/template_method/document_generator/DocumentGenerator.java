package edu.nik.examples.patterns.template_method.document_generator;

public abstract class DocumentGenerator {

    void generateDocument(String data, String outputPath){
        loadTemplate();
        fillData(data);
        saveDocument(outputPath);
    }

    protected abstract void loadTemplate();
    protected abstract void fillData(String data);
    protected abstract void saveDocument(String outputPath);

}
