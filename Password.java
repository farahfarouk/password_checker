import java.util.Scanner;
import java.io.FileReader;

public class Password

{
public static void main(String[] args)

{
Scanner userInput = new Scanner(System.in);
System.out.println("Please enter user password:");
String password1 = userInput.nextLine();

System.out.println("Please confirm password:");
String password2 = userInput.nextLine();

if ((password2).equals(password1) ) {
System.out.println("Welcome!") ;
return;
}

try {
throw new PasswordException();
} catch (PasswordException e) {
e.printStackTrace();
}

for (int n = 0; n < 3; n++)
{
System.out.println("Please try again:");
String password3 = userInput.nextLine();

if ((password3).equals(password1) ) {
System.out.println("Welcome!") ;
return;
}
}
System.out.println("Security Warning!");

}
}
