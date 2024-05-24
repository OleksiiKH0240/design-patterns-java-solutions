public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();

        Device radio = new Radio();

        RemoteController tvController = new RemoteController(tv);
        RemoteController radioController = new RemoteController(radio);

        tvController.deviceOn();
        radioController.deviceOn();

        for (int i = 0; i < 30; i++) {
            tvController.deviceNextChanel();
            radioController.deviceNextChanel();
        }
        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        tvController.devicePrevChanel();
        radioController.devicePrevChanel();

        tvController.deviceVolumeDown();
        radioController.deviceVolumeDown();

        tvController.deviceOff();
        radioController.deviceOff();

        System.out.println("\nUniversal controller\n");
        UniversalController universalController = new UniversalController(tv, radio);
        universalController.deviceOn();
        universalController.deviceOff();
    }
}
