import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileObserver implements Observer {

    private String filePath;
    private String longestLine = "";
    private String longestWord = "";
    private int wordCount = 0;
    private String lineWithLongestWord = "";

    public FileObserver(String filePath) {
        this.filePath = filePath;
    }

    public void processFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                findLongestLine(line);
                String[] words = line.split("\\s+");
                for (String word : words) {
                    findLongestWord(word);
                }
                countWords(words.length);
                findLineWithLongestWord(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findLongestLine(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    @Override
    public void findLongestWord(String word) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    @Override
    public void countWords(int count) {
        wordCount += count;
    }

    @Override
    public void findLineWithLongestWord(String line) {
        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.length() == longestWord.length()) {
                lineWithLongestWord = line;
                break;
            }
        }
    }

    public void printResults() {
        System.out.println("Longest line: " + longestLine);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line with longest word: " + lineWithLongestWord);
    }
}
