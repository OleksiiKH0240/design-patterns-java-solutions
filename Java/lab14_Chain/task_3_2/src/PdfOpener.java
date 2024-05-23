public class PdfOpener extends FileOpener {
    PdfOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".pdf")) {
            System.out.println("PdfOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
