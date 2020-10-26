package homework5.task2;

import java.util.Random;

public enum Season {
    WINTER("снежки"),
    SPRING("запуск корабликов по ручьям"),
    SUMMER("собирание и поедание ягод"),
    AUTUMN("измерение глубины луж методом \"сапога\"");

    private final String game;

    Season(String game) {
        this.game = game;
    }

    public String getGame() {
        return game;
    }

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


