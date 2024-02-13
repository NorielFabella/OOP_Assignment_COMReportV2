import java.io.FileReader;
import java.util.*;
public class BlockSection
{
    private String blockCode;
    private String description;
    private String adviser;
    private int totalStudents;
    private ArrayList<Student> studentList;

    // Setters

    public void setBlockCode(String blockCode)
    {
        this.blockCode = blockCode;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setAdviser(String adviser)
    {
        this.adviser = adviser;
    }

    public void setTotalStudents(int totalStudents)
    {
        this.totalStudents = totalStudents;
    }

    public void setStudentList(ArrayList<Student> studentList)
    {
        this.studentList = studentList;
    }

    // Getters

    public String getBlockCode()
    {
        return blockCode;
    }

    public String getDescription()
    {
        return description;
    }

    public String getAdviser()
    {
        return adviser;
    }

    public int getTotalStudents()
    {
        return totalStudents;
    }

    public ArrayList<Student> getStudentList()
    {
        return studentList;
    }

    public String toString()
    {
        String result = new String();
        
        result += "Block Section: " + blockCode + "\t" +
                      "Block Section Description: " + description + "\n" +
                      "Class Adviser: " + adviser + "\n\n";
                      
        for(Student student: studentList)
        {
            result += student;   
        }
        
        return result;
    }
}