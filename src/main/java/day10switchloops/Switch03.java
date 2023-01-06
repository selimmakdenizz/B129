package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*
        Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Ülke ismi giriniz");
        String countryName = input.nextLine();

        System.out.println("ilk kodu giriniz");

        switch (countryName.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println(" UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "ındia":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("bu ülke tanımlı değil");

        }


    }
}
