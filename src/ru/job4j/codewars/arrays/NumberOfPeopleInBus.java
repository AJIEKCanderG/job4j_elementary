package ru.job4j.codewars.arrays;

import java.util.ArrayList;

/** Дан список целочисленных пар. Элементы каждой пары прдеставляют собой
 * кол-во людей, садящихся в атобус и кол-во людей, выходящих из автобуса.
 * Вернуть кол-во людей соатвшихся в автобусе после последней сотановки автобуса(последнего массива)
 * Кол-во людей всегда >= 0
 * Второе значение в первом целочисленном массиве равно 0,
 * поскольку автобус пуст на первой автобусной остановке.
 * @author Ajiekcander
 */
public class NumberOfPeopleInBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}

/* Решение без стримов
   int sum1 = 0;
   int sum2 =0;
       for (int[] ints : stops) {
           sum1 += ints[0];
            sum2 += ints[1];
          }
         int rsl = sum1 - sum2;
      return rsl;
     }
}*/
