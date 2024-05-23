public class XlsxOpener extends FileOpener {
    XlsxOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".xlsx")) {
            System.out.println("XlsxOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}

