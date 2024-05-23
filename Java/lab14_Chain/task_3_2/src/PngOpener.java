public class PngOpener extends FileOpener {
    PngOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".png")) {
            System.out.println("PngOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
