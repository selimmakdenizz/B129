package day21statickeyword;

public class Static {
    /*
            Static variable'lara sadece classin ismi kullanilarak da ulasilabilir.
B Static olmayan variable'lara ulasabilmek icin object olusturmak zorundayiz.
C Static variable'larin diger adi class variable'dir. Instance variable'larin diger adi object variable'dir.
D Static variable'lar object'lerin ortak kullanimina aciktir fakat instance variable'lar degildir.





            String studentName;
            String year = "2020";
            static int counter = 1000;
            String studentId;
            public Test() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your name");
                studentName = scan.next();
                setStudentId();
            }
            public static void main(String[] args) {
                Test student1 = new Test();
                System.out.println(student1.studentName + student1.studentId); //A

                Test student2 = new Test();
                System.out.println(student2.studentName + student2.studentId); //B
            }
            public void setStudentId() {
                counter++;
                this.studentId = year + "" + counter;
            }
        }

       */
}
