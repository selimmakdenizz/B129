package zselimdeneme;

import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {


        String s="Ali Can?";//==>A** C**
        String t="";
        s=s.replaceAll("[^a-z]","");

        Integer i=0;
        while (i<s.length()){
               String r=s.substring(i,i+1);
               t=t+r+"*";
               i++;
        }
        System.out.println("t = " + t);







    }












    }

