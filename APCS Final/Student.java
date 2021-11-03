import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    private float gpa;
    private boolean prefBluej;
    public Student(String name, int grade, float gpa, boolean prefBluej)
    {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.prefBluej = prefBluej;
    }
    public String getName()
    {
        return name;
    }
    public int getGrade()
    {
        return grade;
    }
    public float getGPA()
    {
        return gpa;
    }
    public boolean getPrefBluej()
    {
        return prefBluej;
    }
}
