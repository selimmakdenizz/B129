package day11looops;

public class C03_ForLoop {
    public static void main(String[] args) {

//INTERVİEW QUESTİONS

        //String karakterleri teker teker Yazdiran;
//Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle="öğrenmek yaşamın tek kanıtıdır";
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a'){
                break;
            }//if body
            System.out.print(cumle.charAt(i));
            
        }//for loop



    }//main
}
