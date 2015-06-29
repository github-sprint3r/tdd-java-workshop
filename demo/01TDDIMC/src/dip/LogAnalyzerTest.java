package dip;

import static org.junit.Assert.*;

import org.junit.Test;

import database.Log;
import database.LogDatabase;

public class LogAnalyzerTest {
    
    @Test
    public void yyy() throws Exception {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setFileName("log.txt");
        SpyLogDatabase spyLogDatabase = new SpyLogDatabase();
        logAnalyzer.setLogDatabase(spyLogDatabase);
        logAnalyzer.analyze();
        
        assertTrue(spyLogDatabase.count == 1);
    }
    
    class SpyLogDatabase extends LogDatabase {
        int count = 0;
        public void insert(Log newLog) {
            count++;
        }
    }

    @Test
    public void xxx() throws Exception {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setFileName("log.txt");
        FileExtension stubFileExtension = new StubFileExtension();
        logAnalyzer.setFileExtension( stubFileExtension);
        assertTrue(logAnalyzer.isSupportFile());
    }
    
    class StubFileExtension extends FileExtension {
        public boolean isSupportFile(String fileName) throws Exception {
            return true;
        }
    }
    
    @Test
    public void supportFileExtension() throws Exception {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setFileName("log.txt");
        assertTrue(logAnalyzer.isSupportFile());
    }
    
    @Test
    public void supportLogFileExtension() throws Exception {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setFileName("log.log");
        assertTrue(logAnalyzer.isSupportFile());
    }
    
    @Test
    public void unsupportFileExtension() throws Exception{
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setFileName("log.xyz");
        assertFalse(logAnalyzer.isSupportFile());
    }

}
