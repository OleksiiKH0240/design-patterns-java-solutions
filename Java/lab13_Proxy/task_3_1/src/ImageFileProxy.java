import javax.swing.*;

public class ImageFileProxy implements DisplayObject {
    private final String imagePath;
    private ImageFile imageFile;

    ImageFileProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        this.imageFile = new ImageFile(this.imagePath);
        this.imageFile.display();
    }
}
