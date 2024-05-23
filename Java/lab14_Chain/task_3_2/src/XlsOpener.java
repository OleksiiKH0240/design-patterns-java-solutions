public class XlsOpener extends FileOpener {
    XlsOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".xls")) {
            System.out.println("XlsOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
