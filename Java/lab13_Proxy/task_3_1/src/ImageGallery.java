public class ImageGallery {

    public static void main(String[] args) {
        // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
        String path = "task_3_1\\resources\\";

        System.out.println("collecting images ...");
        DisplayObject[] images = {
                new ImageFileProxy(path + "image1.jpeg"),
                new ImageFileProxy(path + "image2.jpeg"),
                new ImageFileProxy(path + "image3.jpeg"),
                new ImageFileProxy(path + "image4.jpeg"),
                new ImageFileProxy(path + "image5.jpeg"),
                new ImageFileProxy(path + "image6.jpeg"),
                new ImageFileProxy(path + "image7.jpeg"),
                new ImageFileProxy(path + "image8.jpeg"),
                new ImageFileProxy(path + "image9.jpeg"),
                new ImageFileProxy(path + "image10.jpeg")
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}
