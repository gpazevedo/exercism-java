class ProductionRemoteControlCar <T> implements RemoteControlCar, Comparable<T> {
    private int distance = 0;
    private int victories = 0;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(T o) {
        return -Integer.compare(victories, ((ProductionRemoteControlCar<?>)o).getNumberOfVictories());
    }
}
