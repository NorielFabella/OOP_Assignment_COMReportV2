import java.util.*;
import java.io.*;

public class CourseDA
{
    private ArrayList<Course> courseList;

    public CourseDA(String studentNumber) throws FileNotFoundException
    {
        // Reads courseInfo file
        Scanner courseInfo = new Scanner(new FileReader("scheduleInfo.csv"));

        courseList = new ArrayList<Course>();
        
        Student student = new Student();

        while(courseInfo.hasNext())
        {
            String rowCourse = new String();
            rowCourse = courseInfo.nextLine();

            String [] rowCourseSpecific = new String[6];
            rowCourseSpecific = rowCourse.split(",");

            if(studentNumber.equals(rowCourseSpecific[0]))
            {
                // Creates Course object
                Course course = new Course();
                

                // Puts data in course object
                course.setCourseCode(rowCourseSpecific[1].trim());
                course.setDescription(rowCourseSpecific[2].trim());

                course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
                
                
                
                course.setDay(rowCourseSpecific[4].trim());
                course.setTime(rowCourseSpecific[5].trim());

                courseList.add(course);
                
            }

        }

        
        courseInfo.close();

    }
    public ArrayList<Course> getCourseList()
    {
        //System.out.println(courseList + "yow this is courselist");
        return courseList;
    }
}