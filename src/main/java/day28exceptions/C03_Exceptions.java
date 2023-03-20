package day28exceptions;

public class C03_Exceptions {

    /*

    3)ArrayIndexOutOfBoundExceptions
     */


    //Bir String Arrayden verilen   indexdeki datasını bize döndüren bir method olusturun

    public static void main(String[] args) {

        String arr[]={"Ali","Can","Tarık","Ayşe"};
        getElementFromArray(arr,2);//pozitive Scenario //Tarık
        getElementFromArray(arr,0);// pozitive Scenario // Ali
        getElementFromArray(arr,4);// negative Scenario // Ali






    }

    private static void getElementFromArray(String[] arr, int i) {
        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array in indexinde olmayan data istendi==>"+e.getMessage());
            e.printStackTrace();
            System.err.println("burası renkli açıklama");
        }
    }


}
