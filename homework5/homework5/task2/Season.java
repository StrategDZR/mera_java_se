package homework5.task2;

import java.util.Random;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    static Season getRandomSeason() {
        Season s = null;
        int rnd = new Random().nextInt(Season.values().length);
        switch (rnd) {
            case 0:
                s = WINTER;
                break;
            case 1:
                s = SPRING;
                break;
            case 2:
                s = SUMMER;
                break;
            case 3:
                s = AUTUMN;
                break;
            default:
                System.out.println("There is no such season");
        }
        return s;
    }
}


