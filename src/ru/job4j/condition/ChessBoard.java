package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0
                || x1 > 7 || x2 > 7 || y1 > 7 || y2 > 7) {
            return rsl;
        }
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            rsl = Math.abs(x1 - x2);
        }
        return rsl;
    }
}