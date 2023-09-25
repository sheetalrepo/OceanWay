package classes.controlstmt;

/*
 * continue don't break while loop like break statement
 * continue skip below continue code and control transfer to while condition
 */
public class Continue {

	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			i++;
			if (i > 10 && i < 90) {
				continue;    
			}
			System.out.print(i + " "); // 1 2 3 4 5 6 7 8 9 10 90 91 92 93 94 95 96 97 98 99 100 
		}
	}
}
