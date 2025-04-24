package Lab8.task5;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        SmartPhone smartPhone = new SmartPhone();
        phone.makeCall();
        tablet.watchVideo();
        smartPhone.browseInternet();
    }
}
