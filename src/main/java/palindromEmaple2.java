//import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class palindromEmaple2 {

    public static void main(String args[]) {

        String orignel, reverse ="";
        Scanner in=new Scanner(System.in);
        System.out .println("enter the string");
        orignel=in.nextLine();
        int length=orignel.length();
        for(int i=length-1; i>=0; i--)
        reverse=reverse+orignel.charAt(i) ;
        if(orignel.equals(reverse))
        System.out.println("it is palindrom");
        else
        System.out.println("it is not palindrom");


    }

}
