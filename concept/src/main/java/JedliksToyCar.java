public class JedliksToyCar {
    private int batery = 100;
    private int meters = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
        return batery > 0 ? String.format("Battery at %d%%", batery) : "Battery empty";
    }

    public void drive() {
        if (batery > 0) {
            meters += 20;
            batery -= 1;
        }
    }
}
