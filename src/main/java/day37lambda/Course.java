package day37lambda;

/*
       POJO: Plain Old Java Object
           1)Constructor without parameter
           2)Constructor with all parameters
           3)getter() and setter()
           4)toString()
*/

public class Course {

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1)Constructor without parameter
    public Course() {
    }

    //2)Constructor with all parameters
    public Course(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //3)getters() and setter()

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //4)toString()
    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }
}
