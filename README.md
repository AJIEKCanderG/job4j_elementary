[![Java CI with Maven](https://github.com/AJIEKCanderG/job4j_elementary/actions/workflows/maven.yml/badge.svg)](https://github.com/AJIEKCanderG/job4j_elementary/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/AJIEKCanderG/job4j_elementary/branch/master/graph/badge.svg?token=1VWAEL7FVP)](https://codecov.io/gh/AJIEKCanderG/job4j_elementary)

## О проекте
Этот проект является результатом прохождения курса уровня "Trainee" по изучению основ языка Java, а также содержит решения дополнительных упражнений, в том числе часть с сайта codewars.ru 
В этом проекте были изучены следующие темы:
* Синтаксис языка, Типы данных, Операторы условия, Циклы, Массивы
* ООП (Наследование, Инкапсуляция, Полиморфизм, Внутренние класы, Абстрактные классы, Исключения, Шаблоны проектирования, Синглетон, Декоратор, Стратегия, Фабрика)
* Коллекции Lite, Collections Framework.(Коллекции List, Set, Map, ArrayList, Сортировка, Обобщения, Итераторы,) Lambda и Stream API.
* IDEA, JVM, Maven, jUnit, Git, Сheckstyle, JaCoCo, Travic CI, JavaDoc


### 1. Базовый синтаксис
* Настроены и установлены все инструменты для разработки: IDEA, JVM, Maven, jUnit, Git, Сheckstyle, JaCoCo, Travic CI, JavaDoc
* [GitHub Actions CI](https://github.com/AJIEKCanderG/job4j_elementary/actions/workflows/maven.yml) замена Travis CI (в связи с введением платной подписки).
* В проекте применяются [модульные тесты](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/test/java/ru/job4j) с помощью библиотеки JUnit v4
* [Операторы условия](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/condition)
* [Циклы](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/loop)
* [Массивы](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/array)
* **[Тестовое задание "Сокобан"](https://github.com/AJIEKCanderG/games_oop_javafx/tree/master/puzzle) по итогам блока** 
  
### 2. ООП
* [Классы и объекты](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/oop)
* [Наследование](https://github.com/AJIEKCanderG/job4j_tracker), 
* [Инкапсуляция](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/pojo), 
* [Полиморфизм](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/io)
* [Исключения](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/ex)
* **[Тестовое задание "Каркас шахматной доски"](https://github.com/AJIEKCanderG/games_oop_javafx/tree/95ea54256b3a5cab2fd4931c06e1c6d53c144ac7/chess/src/main/java/ru/job4j/chess) по итогам блока**
* **[Проект "Трекер заявок"](https://github.com/AJIEKCanderG/job4j_tracker) по итогам блока**
<!--
### Наследование. Композиция. Агрегация.
* **Наследование** - позволяет создавать новые объекты на основании ранее созданных. Преимущества: Нет дублирования кода. Недостатки: Жесткая связь с родителем. Если изменили код родителя он повлияет на дочерний элемент
* **Композиция** - Позволяет создавать новые объект на основании ранее созданных. Преимущества: Внешнее API не зависимо от родителя. если изменить код родителя он не повлияет на дочерние элементы. Недостатки: Появляется дублирование кода. В большинстве случаев нужно использовать композицию, а не наследование. Дублирование кода по сравнению с жестким связываем не значительный не достаток
* **Агрегация** - Позволяет создавать объект, который содержит один или более объектов. Важным отличием агрегации от композиции и наследования в том, что агрегация может существовать без объектов
-->
### 3. [Collections.](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/collection) Lite.
* [Коллекция List, ArrayList.](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/list)
* [Коллекция Set, HashSet.](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/set)
* [Map. HashMap.](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/map)
* [Сортировка](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/comparator)
* **[Тестовое задание "Отсортировать департаменты"](https://github.com/AJIEKCanderG/job4j_tracker/commit/e7feb1dc66b030e9fba0a3c3a7ace81598167fb3) по итогам блока**

### 4. FP, Lambda, Stream API
* [Lambda](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/lambda)
* [Stream API](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/stream)
* **[Тестовое задание "Аттестация"](https://github.com/AJIEKCanderG/job4j_tracker/commit/05fc78c6907031e8d967001efcf6e94906a58906) по итогам блока**

### 5. Решения дополнительных задач
* Из раздела курса "Упражнения" (237шт) на пройденные темы (в т.ч. Lambda, Collections, Stream).
  * 1.1.2. Тип данных Выполнено 8 из 8
  * 1.1.4. Оператор ветвления Выполнено 17 из 17
  * 1.1.5. Циклы Выполнено 17 из 17
  * 1.1.6. Массивы Выполнено 59 из 59
  * 1.2.1. Классы и объекты Выполнено 1 из 1
  * 1.3.1. Коллекция List, ArrayList Выполнено 16 из 16
  * 1.3.2. Коллекция Set, HashSet Выполнено 6 из 6
  * 1.3.3. Map. HashMap. LinkedHashMap Выполнено 14 из 14
  * 1.3.4. Сортировка Выполнено 13 из 13
  * 1.4.1. Lambda Выполнено 17 из 17
  * 1.4.2. Stream API Выполнено 54 из 54
  * 2.1.3. List Выполнено 1 из 1
  * 2.1.5. Map Выполнено 2 из 2
* Решения некоторых задач с сайта [Codewars](https://github.com/AJIEKCanderG/job4j_elementary/tree/master/src/main/java/ru/job4j/codewars)
