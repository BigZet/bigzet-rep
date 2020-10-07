package Prac_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> content;

    /**
     * Добавление элемента
     *
     * @param element
     */
    public void add(E element) throws Exception {
        content.add(element);
    }

    /**
     * Удаление первого вхождения элемента
     *
     * @param element
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Проверка на принадлежность элемента списку
     *
     * @param element
     * @return Возвращает True если принадлежит
     */
    public boolean contains(E element) {

        return content.contains(element);
    }

    /**
     * Проверка на принадлежность коллекции элементов списку
     *
     * @param c
     * @return Возвращает True если принадлежит
     */
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * Проверка на пустоту списка
     *
     * @return Возвращает True если список пуст
     */
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /** Конструктор создания объекта без конфигурации
     * @see WaitList#WaitList(Collection)   */
    public WaitList(){
        content = new ConcurrentLinkedQueue<E>();
    }
    /** Конструктор создания объекта из готовой коллекции
     * @param collection Некоторая коллекция*/
    public WaitList(Collection<E> collection){
        content = new ConcurrentLinkedQueue<E>(collection);
    }

    public String toString(){
        String text = "";
        for (E i:content){
            text+=" "+i.toString();
        }
        return text;
    }
}
