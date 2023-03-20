package day30exceptionsinterface;

public class CustomExceptions01 {
    public static void main(String[] args) {



        getStudentGrade(45);
        getTheNumberOfStudent(-24);

    }



    public static void getStudentGrade(int grade) {

    if (grade<0 || grade>100){
        try {
            throw  new InvalidStudentGradeException("Student's Grade can not be less than zero or greater than 100");
        } catch (InvalidStudentGradeException e) {
            System.out.println(e.getMessage());
        }
    }else{
        System.out.println(grade);
    }
    }

    public static void getTheNumberOfStudent(int numOfStudents) {
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number can not be negative");
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());//System.err.println(e.getMessage());//err. hata mesajlarini kirmizi gostermek icin kullanilir.
            }

        }else {
            System.out.println(numOfStudents);
        }
    }


}
