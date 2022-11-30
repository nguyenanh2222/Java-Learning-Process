import java.util.Scanner;
public class Sout {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                int temp = 15 - s1.length() - Integer.toString(x).length();
//                System.out.println(s1+" "*temp+x);
            }
            System.out.println("================================");

        }
    }


