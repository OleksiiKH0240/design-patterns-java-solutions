public class UniversalController {
    private final Device[] devices;

    UniversalController(Device... devices) {
        this.devices = devices;
    }

    void deviceOn() {
        for (Device device : devices) {
            device.on();
        }
    }

    void deviceOff() {
        for (Device device : devices) {
            device.off();
        }
    }

    void deviceVolumeUp() {
        for (Device device : devices) {
            device.volumeUp();
        }
    }

    void deviceVolumeDown() {
        for (Device device : devices) {
            device.volumeDown();
        }
    }

    void deviceNextChanel() {
        for (Device device : devices) {
            device.nextChanel();
        }
    }

    void devicePrevChanel() {
        for (Device device : devices) {
            device.prevChanel();
        }
    }
}
