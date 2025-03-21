import java.util.*;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        int inputAge  = sc.nextInt();

        int lengthOfName = inputName.length();
        System.out.println("Hi "+inputName+"! , Your name has " +lengthOfName+ " characters.");
        if(inputAge>18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are an teenager" );
        }

    }
}