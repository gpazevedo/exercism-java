public class Lasagna {
    static int LASAGNA_OVEN = 40;

    public int expectedMinutesInOven() {
        return LASAGNA_OVEN;
    }

    public int remainingMinutesInOven(int inTheOven) {
        return LASAGNA_OVEN - inTheOven;
    }

    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int inTheOven) {
        return inTheOven + preparationTimeInMinutes(layers);
    }
}