import java.util.*;
import java.io.*;

public class StudentDA
{
    private ArrayList<Student> studentList; 

    public ArrayList<Student> getStudentList()
    {
        return studentList;
    }

    BlockSection blockSection = new BlockSection();

    public StudentDA(String theBlockCode) throws FileNotFoundException
    {
        // Reads Student info file
        Scanner studentInfo = new Scanner(new FileReader("studentInfo.csv"));

        studentList = new ArrayList<Student>();

        while(studentInfo.hasNext())
        {
            String rowStudent = new String();
            rowStudent = studentInfo.nextLine();

            String[] rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");


            if(rowStudentSpecific[0].equals(theBlockCode))
            {
                 // Creates Student object
            Student student = new Student();

            // Stores data in Student object
            student.setStudentNumber(rowStudentSpecific[1].trim());
            student.setName(rowStudentSpecific[2].trim());
            student.setProgram(rowStudentSpecific[3].trim());
            
            // Creates CourseDA
            CourseDA courseDA = new CourseDA(student.getStudentNumber());

            // Attaches the courseList to student object
            student.setCourseList(courseDA.getCourseList());

            studentList.add(student);

            }
           
        }
        studentInfo.close();
    }
    public ArrayList<Student> studentList()
    {
        return studentList;
    }
}