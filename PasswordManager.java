import java.util.Scanner;

public class PasswordManager
{

	public static void main(String[] args)
	{
		Menu m = new Menu();
		m.passwordEnter();
	}

}

class Menu
{
	public static String Password = "Password";

	static Scanner sc = new Scanner(System.in);

	public static void passwordEnter(){

		while(true)
		{
			System.out.println("Enter Password");

			String enteredPassword = sc.nextLine();

			if(enteredPassword.equals(Password))
				{
					System.out.println("Correct Password");
					break;
				}
			else{
				System.out.println("Incorrect Please Try Again");
			}
		}
	}
}

