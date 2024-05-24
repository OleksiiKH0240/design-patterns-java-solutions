public class RemoteController {
    private final Device device;

    RemoteController(Device device) {
        this.device = device;
    }

    void deviceOn() {
        device.on();
    }

    void deviceOff() {
        device.off();
    }

    void deviceVolumeUp() {
        device.volumeUp();
    }

    void deviceVolumeDown() {
        device.volumeDown();
    }

    void deviceNextChanel() {
        device.nextChanel();
    }

    void devicePrevChanel() {
        device.prevChanel();
    }
}
