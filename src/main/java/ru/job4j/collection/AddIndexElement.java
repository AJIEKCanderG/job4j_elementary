package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
/**А что если мы хотим добавить элемент не в конец списка, а в какое то конкретное место в списке. Не проблема,
 * в интерфейсе List<E> определен метод, который позволяет добавить элемент по индексу:
 * void add(int index, E e) - где index - место куда мы добавляем элемент E.
 * Метод ничего не возвращает, однако может генерировать исключение IndexOutOfBoundsException,
 * при условии что index < 0 или превышает размер списка. Поэтому использовать его нужно с осторожностью.
 * Также рассмотрим метод contains(E e), который определен в интерфейсе Collection<E>:
 * boolean contains(E e) - метод проверяет содержит ли список элемент E, возвращает true если содержит, иначе - false.
 * Задание: необходимо реализовать метод, который добавляет элемент в список по индексу,
 * при этом он должен добавлять элемент только в том случае, если этого элемента еще нет в коллекции.
 * При этом метод должен вернуть булево значение. Для этого необходимо сравнить размер дубликата списка
 * и списка в который мы добавляем элемент. Используйте методы contains(E e), add(int index, E e), size().*/

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        boolean el = check.contains(str);
        if (!el) {
            check.add(index, str);
        }
        return list.size() != check.size();
    }
}