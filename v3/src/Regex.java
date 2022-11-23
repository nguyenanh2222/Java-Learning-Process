import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Regex {
//        public static void main(String args[]){
////1st way
//            Pattern p = Pattern.compile("\\\\b(\\\\w+)(?:\\\\W+\\\\1\\\\b)+");//. represents single character
//            Matcher m = p.matcher("good bye bye bye");
//            boolean b = m.matches();
//
////2nd way
//            boolean b2=Pattern.compile(".s").matcher("as").matches();
//
////3rd way
//            boolean b3 = Pattern.matches(".s", "as");
//
//            System.out.println(m);
//        }
//}
   /*
    4
    <h1>Nayeem loves counseling</h1>
    <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
    <Amee>safat codes like a ninja</amee>
    <SA premium>Imtiaz has a secret crush</SA premium>
    */
//public class Solution{
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());

        List<String> chunk = new ArrayList<>();
        String s= "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String[] temp = s.split("[<>]");
        for(String element :temp){
            if(!element.contains(" ")) {chunk.add(element);
            };
            }
        }
    }
//        while(testCases>0){
//            String temp = String.valueOf(in);
//            System.out.println(temp);
//            testCases--;
//        }

//        temp = temp.replaceAll("<[^</>]+>", "");
