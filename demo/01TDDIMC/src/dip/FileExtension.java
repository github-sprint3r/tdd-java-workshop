package dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileExtension {
    public boolean isSupportFile(String fileName) throws Exception {
        String extension = fileName.substring(fileName.length() - 4);
        if (readFileExtension().containsKey(extension))
            return true;
        return false;
    }

    private Map<String, String> readFileExtension() throws IOException {
        Map<String, String> datas = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader("support.txt"));
        String line = null;

        while ((line = reader.readLine()) != null) {
            datas.put(line, line);
        }

        return datas;
    }
}
