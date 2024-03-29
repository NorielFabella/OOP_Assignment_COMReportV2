import java.util.*;

public class Student
{
    private String blockCode;
    private String studentNumber;
    private String name;
    private String program;
    private Integer totalUnitsEnrolled;
    private ArrayList<Course> courseList;

    // Setters
    public void setBlockCode(String blockCode)
    {
        this.blockCode = blockCode;
    }

    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setProgram(String program)
    {
        this.program = program;
    }

    public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled)
    {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
        
    }

    public void setCourseList(ArrayList<Course> courseList)
    {
        this.courseList = courseList;
    }

    // Getters
    public String getBlockCode()
    {
        return blockCode;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }
    
    public String getName()
    {
        return name;
    }

    public String getProgram()
    {
        return program;
    }

    public Integer getTotalUnitsEnrolled()
    {
        return totalUnitsEnrolled;
    }

    public List<Course> getCourseList()
    {
        return courseList;
    }

    public String toString()
    {
        String studentOutput = new String();
        studentOutput += "Student number: " + studentNumber + "\t" +
                         "Student name: " + name + "\t" + 
                         "Program: " + program + "\n";

        // Header for courseList
        studentOutput += String.format("%-12s%-25s%-8s%-8s%s\n", "Course Code", "Description", "Unit", "Day", "Time");

        for(Course course: courseList)
        {
            studentOutput += course;
        }
        
        
        studentOutput += "\n";
        return studentOutput;
    }
}