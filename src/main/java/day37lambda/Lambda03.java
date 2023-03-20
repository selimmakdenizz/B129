package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {


        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result1=coursesList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println("result1 = " + result1);//true

        
        //Kurs isimlerinden en az birirnin " Turkish" içerip içermediği kontrol eden kodu yaznız
        boolean result2=coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println("result2 = " + result2);//

        //3)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
         String name1= coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAverageScore).
                        reversed()).
                        findFirst().
                        get().
                        getCourseName();
        System.out.println("name1 = " + name1);//Turkish Night


       //4)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.

      List<Course>myList=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
        System.out.println("myList = " + myList);//[Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128,
        // Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]

        //5)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk üçünü liste halinde console'a yazdiriniz
        List<Course>yourList=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                limit(3).
                collect(Collectors.toList());
        System.out.println("yourList = " + yourList);


        //6)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve üçüncüyü console'a yazdiriniz

        Course result5=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                limit(1).
                findFirst().
                get();
        System.out.println("result5 = " + result5);//Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128
    }
}
