package dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import database.Log;
import database.LogDatabase;

public class LogAnalyzer {

    private String fileName;
    private FileExtension fileExtension;
    private LogDatabase logDatabase;
    
    public LogAnalyzer() {
        fileExtension = new FileExtension();
    }
    
    public void setLogDatabase(LogDatabase logDatabase) {
        this.logDatabase = logDatabase;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void setFileExtension(FileExtension fileExtension) {
       this.fileExtension = fileExtension;
    }

    public boolean isSupportFile() throws Exception {
        return this.fileExtension.isSupportFile(fileName);
    }

    public void analyze() {
        logDatabase.insert(new Log(200, "XXX"));
    }


}
