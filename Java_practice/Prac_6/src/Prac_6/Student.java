package Prac_6;

public class Student implements Comparable<Student> {
    int id;
    int GPA=0;

    Student(int id){
        this.id = id;
    }

    Student(int id, int GPA){
        this.id = id;
        this.GPA=GPA;
    }


    public int compareTo(Student st) {
        if (this.id > st.id){
            return 1;
        }
        else if (this.id < st.id){
            return -1;
        }
        else {
            return 0;
        }
    }
}
