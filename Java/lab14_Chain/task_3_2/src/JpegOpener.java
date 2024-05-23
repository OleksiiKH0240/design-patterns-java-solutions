public class JpegOpener extends FileOpener {
    JpegOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".jpeg")) {
            System.out.println("JpegOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
