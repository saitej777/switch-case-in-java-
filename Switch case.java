public class SwitchCaseDemo {

	public static void main(String[] args) {		char Grade ='B';

		switch (Grade){

		case 'A':

			System.out.println("You are Grade A Employee: Bonus= "+ 2000);

			break;

		case 'B':

			System.out.println("You are Grade B Employee: Bonus= "+ 1000);

			break;

		case 'C':

			System.out.println("You are Grade C Employee: Bonus= "+ 500);

			break;

		default:

			System.out.println("You are Default Employee: Bonus= "+ 100);

			break;

		}		

	}

}
