public abstract class FileOpener {
    protected FileOpener nextOpener;

    public void setNextOpener(FileOpener nextOpener) {
        this.nextOpener = nextOpener;
    }

    public abstract void openFile(String file);
}
