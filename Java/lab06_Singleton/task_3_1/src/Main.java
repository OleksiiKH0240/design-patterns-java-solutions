public class Main {
    public static void main(String[] args) {
        Singleton s = new Singleton();
        TextEditor textEditor = s.getInstance();
        String text = textEditor.readFile("task_3_1\\src\\textFile.txt");
        System.out.println(text);

        TextEditor textEditor2 = s.getInstance();
        textEditor2.appendToFile("task_3_1\\src\\textFile.txt", "\nHello world!");
        textEditor2.writeToFile("task_3_1\\src\\outputTextFile.txt", "Hello world!");
    }
}
