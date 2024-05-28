public class FileAnalyzer {
    private final Observer observer;

    public FileAnalyzer(Observer observer) {
        this.observer = observer;
    }

    public void analyzeFile(String filePath) {
        observer.processFile();
    }
}
