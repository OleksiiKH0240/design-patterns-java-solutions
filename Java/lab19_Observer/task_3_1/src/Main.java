public class Main {

    public static void main(String[] args) {
        Observer fileObserver = new FileObserver("resources/input01.txt");
        FileAnalyzer fileAnalyzer = new FileAnalyzer(fileObserver);
        fileAnalyzer.analyzeFile("resources/input01.txt");
        ((FileObserver) fileObserver).printResults();
    }
}

