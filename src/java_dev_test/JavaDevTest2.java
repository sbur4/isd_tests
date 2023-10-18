package java_dev_test;

/**
 * 2. Is it possible to declare method in Java interface as:
 * <p>
 * A. abstract
 * B. final
 * C. static
 * D. public
 * E. protected
 * Please explain your answer. +
 */

public class JavaDevTest2 {
    /*
     * abstract Да
     * final Нет
     * static Нет
     * public Да
     * protected Нет
     * <p>
     *  Все методы интерфейса неявно являются abstract и public. Последние явно
     * задать тоже можно. Final нельзя использовать, так как метод будут
     * реализовывать. Static нельзя потому, что интерфейсы определяют методы
     * екземпляра. Protected нельзя потому что все методы в интерфейсе неявно
     * являются public. Соответственно, два модификатора и как результат ошибка.
     */
}