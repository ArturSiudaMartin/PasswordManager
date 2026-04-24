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
                    enterAction();
					break;
				}
			else{
				System.out.println("Incorrect Please Try Again");
			}
		}
	}
    public static void enterAction()
    {
        System.out.println("----------------------------------------Enter action to carry out----------------------------------------");
        System.out.println("1 - View All Passwords");
        System.out.println("2 - Enter New Password");
        System.out.println("3 - Search For Password");
        System.out.println("4 - Edit Password");
        System.out.println("5 - Delete Password");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        int input = sc.nextInt();

        switch(input)
        {
            case 1:
                System.out.println("Viewing Passwords");
                break;
            case 2:
                System.out.println("Enter Password Domain");
                break;
        }
    }
}

