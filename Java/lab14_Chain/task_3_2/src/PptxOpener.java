public class PptxOpener extends FileOpener {
    PptxOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".pptx")) {
            System.out.println("PptxOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
