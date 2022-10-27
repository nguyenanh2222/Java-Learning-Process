package student;
//BÀI 2
//        Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
//         Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
//        o Yếu: điểm &lt; 5
//        o Trung bình: 5 &lt;= điểm &lt; 6.5
//        o Khá: 6.5 &lt;= điểm &lt; 7.5
//        o Giỏi: 7.5&lt;= điểm &lt; 9
//        o Xuất sắc: điểm &gt;= 9
//         Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    protected Float score;
    private String level;

    public void insertStudent(String name, Float score) {
        this.name = name;
        this.score = score;
        if (this.score < 5) {
            this.level = "Yếu";
        }
        else if (this.score > 9) {
            this.level = "Xuất sắc";
        }
        else if  (this.score >= 5 && this.score <= 6.5) {
            this.level = "Trung bình";
        }
        else if  (this.score > 6.5 && this.score <= 7.5) {
            this.level = "Khá";
        }
        else if  (this.score > 7.5 && this.score <= 9) {
            this.level = "Giỏi";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
class Sort {
        public List<Float> quickSort(List<Float> a, int low, int high) {
        if (low < high) {
            int index = partition(a, low, high);
            quickSort(a, low, index - 1);
            quickSort(a, index + 1, high);
        }
        return a;
    }
    public int partition(List<Float> a, int low, int high) {
        Float pivot = a.get(high);
        int i = low - 1;
        int j;
        for (j = low; j <= high - 1; j++) {
            if (a.get(j) < pivot) {
                i++;
                Float save_index = a.get(j);
                a.set(j, a.get(i));
                a.set(i, save_index);
            }
        }
        Float save_index = a.get(i + 1);
        a.set(i + 1, a.get(high));
        a.set(high, save_index);
        return (i + 1);
    }
}


class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<Student>();
//        nhập sinh viên
            Student student1 = new Student();
            student1.insertStudent("anh", (float) 6.8);
            Student student2 = new Student();
            student2.insertStudent("minh", (float) 6.9);
            students.add(student1);
            students.add(student2);
//        Tạo list điểm
            List<Float> listScore = new ArrayList<>();
            for (Student student : students) {
                listScore.add(student.score);
            }
//           Sắp xếp điểm
            Sort sort = new Sort();

//            show sinh viên
            for (Student student : students) {
                for (Float score : sort.quickSort(listScore, 0, listScore.size() - 1)) {
                    if (student.score == score) {
                        System.out.print(student.toString()+"\n");
                    }
                }
            }
        }
}


