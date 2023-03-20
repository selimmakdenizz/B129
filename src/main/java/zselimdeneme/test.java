package zselimdeneme;

import java.util.Scanner;

public class test {
     /*
            Static variable'lara sadece classin ismi kullanilarak da ulasilabilir.
B Static olmayan variable'lara ulasabilmek icin object olusturmak zorundayiz.
C Static variable'larin diger adi class variable'dir. Instance variable'larin diger adi object variable'dir.
D Static variable'lar object'lerin ortak kullanimina aciktir fakat instance variable'lar degildir.*/

    private static test student1;
    private static test stuent2;
    String  year ="2020";
    String stdntId;
    static int counter=1000;
    String stdntName;

    public test(){

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girin");
        stdntName=scan.next();
        setStudent();
    }

    private void setStudent() {

        counter++;
        this.stdntId=year+" "+counter;


    }


    public static void main(String[] args) {


        String student1="ALİ CAN";

        test.student1=new test();
        ;

        test.stuent2=new test();
        Object student2 = new Object();








        }





    }

