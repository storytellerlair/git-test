import java.util.Objects;

/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年01月14日 22:06:00
 */
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (score != student.score) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + score;
        return result;
    }

    @Override
    public int compareTo(Student another) {
//        if (this.score < another.score)
//            return -1;
//        else if (this.score == another.score)
//            return 0;
//        return 1;
        return - (this.score - another.score);
    }
}
