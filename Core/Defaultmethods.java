interface Camera {
    public void takeSnap();

    public void recordVideo();

    private void screenShot(){
        System.out.println("Screenshot taken...");
    }

    default void recording4KVideo() {
        screenShot();
        System.out.println("Recording 4k Video");
    }
}

interface Wifi {
    public String[] getNetwork();

    public void connectNetwork();
}

class Cellphone {
    public void pickCall() {
        System.out.println("Connecting...");
    }

    public void dialCall(int phoneNumber) {
        System.out.println("Dialing Number" + phoneNumber);
    }
}

class Smartphone extends Cellphone implements Camera, Wifi {
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public String[] getNetwork() {
        String networks[] = { "Aman", "Shradha", "Ram" };
        return networks;
    }

    public void connectNetwork() {
        System.out.println("Connecting Network...");
    }
    // public void recording4KVideo(){
    //     System.out.println("Snap and recording 4K video");
    // }
}

public class Defaultmethods {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.takeSnap();
        obj.recordVideo();
        String net[] = obj.getNetwork();
        for (String s : net) {
            System.out.print(s + " ");
        }
        System.out.println("");
        obj.connectNetwork();
        obj.recording4KVideo();
    }
}