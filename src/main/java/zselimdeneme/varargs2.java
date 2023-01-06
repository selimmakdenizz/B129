package zselimdeneme;

public class varargs2 {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Veli";
        String str3="Okan";
        String str4="Adnan";
        String str5="Sahsanem";

        uzunKelime(str1, str2, str3,str4,str5);















    }

    private static void uzunKelime(String...str) {





        String enUzunStr="";
        for (String w:str) {

            if (w.length()>enUzunStr.length()){
                enUzunStr=w;
            
            }


            System.out.println("enUzunStr = " + enUzunStr);  
        }
    }

}
