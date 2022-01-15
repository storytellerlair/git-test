import java.util.Objects;

/**
 * @author 杨磊
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年01月13日 09:57:00
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
