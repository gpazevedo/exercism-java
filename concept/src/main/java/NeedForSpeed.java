class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery - batteryDrain < 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((distance * 1.0 / car.speed) * car.batteryDrain <= car.battery);
    }
}