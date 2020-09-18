package Prac_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public Student[] getSortedList() {
        return list;
    }

    protected void quickSort(int bottom, int top) {
        if (bottom >= top)
            return;
        int middle_index=bottom+(top-bottom)/2;
        Student middle = list[middle_index];
        int i=bottom;
        int j=top;
        while (i<=j){
            while (compare(list[i], middle)<0){
                i++;
            }
            while (compare(list[j], middle)>0){
                j--;
            }
            if (i<=j){
                Student temp = list[i];
                list[i]=list[j];
                list[j]=temp;
                i++;
                j--;
            }
        }
        if (bottom < j)
            quickSort(bottom, j);

        if (top > i)
            quickSort(i, top);
    }

    protected Student[] list;

    SortingStudentsByGPA(Student[] list){
        this.list=list;
        quickSort(0, list.length-1);
    }



    @Override
    public int compare(Student st1, Student st2) {
        if (st1.GPA > st2.GPA){
            return 1;
        }
        else if (st1.GPA < st2.GPA){
            return -1;
        }
        else {
            return 0;
        }
    }
}
