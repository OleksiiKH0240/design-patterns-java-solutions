public class DocxOpener extends FileOpener {
    DocxOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".docx")) {
            System.out.println("DocxOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
