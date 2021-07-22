package ru.job4j.array;

import java.util.Objects;

/**
 * 1.1.6. Массивы 4.3. Кинотеатр
 * Метод принимает двумерный массив объектов Place, в котором есть 2 поля:
 * 1. int row - ряд в кинотеатре;
 * 2. int cell - место в этом ряду.
 * Т.е. массив имитирует рассадку посетителей в кинотеатре. При этом если значение равно null - значит место свободно, иначе - место зарезервировано.
 * При этом рассадить посетителей нужно так, чтобы рядом значения null могли быть только по диагонали. Поясним на примере(X - занятое место, O - пустое место):
 * 1 вариант:
 * {X, O, X}
 * {O, X, O}   -   по такой схеме еще одного посетителя добавить нельзя.
 * {X, O, X}
 * 2 вариант:
 * {O, O, X}
 * {O, X, O}   -   по такой схеме еще один посетитель может занять клетку с координатами 0, 0
 * {X, O, X}
 * 3 вариант:
 * {X, O, X}
 * {O, O, O}   -   по такой схеме еще один посетитель может занять клетку с координатами 1, 1
 * {X, O, X}
 * Метод должен вернуть клетку в которую можно разместить нового посетителя, при этом если таких клеток будет
 * несколько - нужно вернуть первую из них. Метод должен работать с любым набором исходных данных.
 */

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place result = null;
        int n = places.length;
        m:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    if (places[i][j] == null) {
                        result = new Place(i, j);
                        break m;
                    }
                }
            }
        }
        return result;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}