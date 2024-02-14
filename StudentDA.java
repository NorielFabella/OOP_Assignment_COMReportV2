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
        Scanner scheduleInfo = new Scanner(new FileReader("scheduleInfo.csv"));

        studentList = new ArrayList<Student>();
        ArrayList<Integer> unitList = new ArrayList<>();

        while(studentInfo.hasNext())
        {
            String rowStudent = new String();
            rowStudent = studentInfo.nextLine();

            String rowSchedule = new String();
            rowSchedule = scheduleInfo.nextLine();

            String[] rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");

            String[] rowScheduleSpecific = new String[6];
            rowScheduleSpecific = rowSchedule.split(",");

            if(rowStudentSpecific[0].equals(theBlockCode))
            {
                 // Creates Student object
            Student student = new Student();

            // Stores data in Student object
            student.setStudentNumber(rowStudentSpecific[1].trim());
            student.setName(rowStudentSpecific[2].trim());
            student.setProgram(rowStudentSpecific[3].trim());
            //student.setTotalUnitsEnrolled(String.parseInt(rowScheduleSpecific[3]));
            
            
            
            // Creates CourseDA
            CourseDA courseDA = new CourseDA(student.getStudentNumber());

            // Attaches the courseList to student object
            student.setCourseList(courseDA.getCourseList());
            
            unitList.add(Integer.parseInt(rowScheduleSpecific[3].trim()));
            
            studentList.add(student);

            }
            
           
        }
       
        Student student = new Student();
        Integer sum = 0;
        for(Integer integer: unitList)
        {
            sum += integer;
        }
        
        
        student.setTotalUnitsEnrolled(sum);
        
        unitList.clear();
       
        studentInfo.close();
    }
    public ArrayList<Student> studentList()
    {
        return studentList;
    }
}