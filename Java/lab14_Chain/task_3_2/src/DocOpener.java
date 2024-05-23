public class DocOpener extends FileOpener {
    DocOpener() {
    }

    @Override
    public void openFile(String file) {
        if (file.contains(".doc")) {
            System.out.println("DocOpener: Opening file " + file);
        } else {
            if (this.nextOpener != null) {
                this.nextOpener.openFile(file);
            }
        }
    }
}
