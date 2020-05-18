//VJEŽBA SWITCH

package conditionals;

public class Switchevi {

	public static void main(String[] args) {

		System.out.println(determineNameOfDay(6));
		System.out.println(determineNameOfMonth(2));
		System.out.println(isWeekDay(5));

	}
	
	private static String determineNameOfDay(int dayNumber){
		String result = "";
		switch(dayNumber) {
		
		case 0: 
			result = "Sunday";
			break;
		case 1: 
			result = "Monday";
			break;
		case 2: 
			result = "Tuesday";
			break;
		case 3: 
			result = "Wenesday";
			break;
		case 4: 
			result = "Thursday";
			break;
		case 5: 
			result = "Friday";
			break;
		case 6: 
			result = "Saturday";
			break;
		}
		
		return result;
		
	}
	
	public static String determineNameOfMonth(int monthNumber) {
		switch(monthNumber) {
		
		case 1: return "Sijeèanj";
		case 2: return "Veljaèa";
		case 3: return "Ožujak";
		case 4: return "Travanj";
		case 5: return "Svibanj";
		case 6: return "Lipanj";
		case 7: return "Srpanj";
		case 8: return "Kolovoz";
		case 9: return "Rujan";
		case 10: return "Listopad";
		case 11: return "Studeni";
		case 12: return "Prosinac";
		}
		return "pogrešan unos";
	}
	
	public static boolean isWeekDay (int dayNumber)  {
		switch (dayNumber)  {
		
		case 0 : 
			System.out.println("Sunday");
			return false;
		case 1 : 
			System.out.println("Monday");
			return true;
		case 2 : 
			System.out.println("Tuesday");
			return true;
		case 3 : 
			System.out.println("Wenesday");
			return true;
		case 4 : 
			System.out.println("Thusrday");
			return true;
		case 5 : 
			System.out.println("Friday");
			return true;
		case 6 : 
			System.out.println("Saturday");
			return false;
		}
		return false;
		
	}
}
