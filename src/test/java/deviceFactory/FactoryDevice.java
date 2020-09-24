package deviceFactory;

public class FactoryDevice {
    public static IDevice make(String type) {
        IDevice device = null;

        switch (type) {
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new IOS();
                break;
        }

        return device;
    }
}
