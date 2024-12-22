import org.w3c.dom.Text;

import java.util.HashMap;

public class Task30 {
    HashMap<String, TextFile> fileSet = new HashMap<>();
    public boolean addFile(String fileName, TextFile textFile) {
        if (textFile == null || fileName == null || textFile.getAbsolutePath() == null || textFile.getAbsolutePath().isEmpty())
            return false;
        return fileSet.putIfAbsent(fileName, textFile) == null;
    }
    public boolean deleteFile(String fileName) {
        return fileName != null && fileSet.remove(fileName) != null;
    }
    public TextFile getTextFile(String fileName) {
        return fileSet.get(fileName);
    }
}

class TextFile{
    private String absolutePath;
    private String description;
    public TextFile(String absolutePath, String description){
        this.absolutePath = absolutePath;
        this.description = description;
    }
    public String getAbsolutePath() { return absolutePath; }
    public String getDescription() {return description; }
}
