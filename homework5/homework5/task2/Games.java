package homework5.task2;

public enum Games {
    SNOWBALLS_THROWING,
    BOATS_ON_THE_STREAMS,
    FIND_AND_EAT_BERRIES,
    MEASURING_PUDDLES_BY_BOOTS;

    static Games getGameForASeason(Season s) {
        Games game = null;
        switch (s) {
            case WINTER:
                game = SNOWBALLS_THROWING;
                break;
            case SPRING:
                game = BOATS_ON_THE_STREAMS;
                break;
            case SUMMER:
                game = FIND_AND_EAT_BERRIES;
                break;
            case AUTUMN:
                game = MEASURING_PUDDLES_BY_BOOTS;
                break;
            default:
                System.out.println("There is no such game");
        }
        return game;
    }
}
