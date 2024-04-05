import java.io.*;


public class TextEditor {
    public TextEditor() {
    }

    public String readFile(String fileName) {
        String content = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            content = String.join("\n", br.lines().toList());

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return content;
    }

    public void writeToFile(String fileName, String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void appendToFile(String fileName, String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
