package Prac_8;

import java.util.Collection;

public interface IWaitList<E> {
    /** Добавление элемента */
    public void add(E element) throws Exception;
    /** Удаление первого вхождения элемента */
    public void remove(E element);
    /** Проверка на принадлежность элемента списку
     * @return Возвращает True если принадлежит */
    public boolean contains(E element);
    /** Проверка на принадлежность коллекции элементов списку
     * @return Возвращает True если принадлежит */
    public boolean containsAll(Collection<E> c);
    /** Проверка на пустоту списка
     * @return Возвращает True если список пуст */
    public boolean isEmpty();
}
