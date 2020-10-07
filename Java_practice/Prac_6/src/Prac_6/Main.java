package Prac_6;

import java.util.Random;

public class Main {
    public static void selectionSort (Comparable[] list){
        int min;
        Comparable temp;

        for(int index = 0; index < list.length-1; index++){
            min=index;
            for(int i = index+1; i<list.length; i++){
                if (list[i].compareTo(list[min]) < 0){
                    min = i;
                }
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static Comparable min(Comparable e_1, Comparable e_2){
        if (e_1.compareTo(e_2)<=0){
            return e_1;
        }
        else {
            return e_2;
        }
    }

    public static Comparable max(Comparable e_1, Comparable e_2){
        if (e_1.compareTo(e_2)<=0){
            return e_2;
        }
        else {
            return e_1;
        }
    }

    public static Comparable[]  mergeSort(Comparable[] list_1, Comparable[] list_2){
        selectionSort(list_1);
        selectionSort(list_2);
        Comparable[] sortedList = new Comparable[list_1.length+list_2.length];
        int limit = sortedList.length-1;
        int limit_1=list_1.length-1;
        int limit_2=list_2.length-1;
        while (limit_2>=0){
            if (limit_1>=0 && list_1[limit_1].compareTo(list_2[limit_2])>=0){
                sortedList[limit]=list_1[limit_1];
                limit_1--;
            }
            else{
                sortedList[limit]=list_2[limit_2];
                limit_2--;
            }
            limit--;
        }

        return  sortedList;

    }
    public static void printSt(Student[] list){
        for (int i = 0; i<list.length-1; i++) {
            System.out.println(String.format("ID: %d, GPA: %d", list[i].id, list[i].GPA));
        }
    }
    public static void main(String[] args) {
        Student[] idNumbers = new Student[20];
        Random r = new Random();
        for (int i = 0; i<20; i++) {
            Student st = new Student(r.nextInt(100), r.nextInt(100));
            idNumbers[i] = st;
        }
        selectionSort(idNumbers);
        System.out.println("\nSorted by ID:");
        printSt(idNumbers);
        SortingStudentsByGPA ssbGPA = new SortingStudentsByGPA(idNumbers);
        System.out.println("\nSorted by GPA:");
        printSt(ssbGPA.getSortedList());
        Student[] Group_1 = new Student[20];
        Student[] Group_2 = new Student[20];
        for (int i = 0; i<20; i++) {
            Student st = new Student(r.nextInt(100), r.nextInt(100));
            Group_1[i] = st;
        }
        for (int i = 0; i<20; i++) {
            Student st = new Student(r.nextInt(100), r.nextInt(100));
            Group_2[i] = st;
        }
        Comparable<Student>[] sorted = mergeSort(Group_1, Group_2);

        System.out.println(  sorted.length);
        for(int i =4; i<sorted.length-1; i++){
            if ((Student)sorted[i] != null){
                System.out.println(((Student)sorted[i]).id);
            }

        }

    }
}
