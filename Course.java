public class Course
{
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;
    
    // Setters
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setUnit(Integer unit)
    {
        this.unit = unit;
    }

    public void setDay(String day)
    {
        this.day = day;
    }
    
    public void setTime(String time)
    {
        this.time = time;
    }

    // Getters
    public String getCourseCode()
    {
        return courseCode;
    }

    public String getDescription()
    {
        return description;
    }

    public Integer getUnit()
    {
        return unit;
    }

    public String getDay()
    {
        return day;
    }

    public String getTime()
    {
        return time;
    }

    public String toString()
    {
        String courseOutput = new String();

        courseOutput += courseCode + "\t" + description + "\t" +
                        unit + "\t" + day + "\t" + time + "\n";
        
        return courseOutput;
    }
}
