package _00_Intro_To_ArrayLists;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	String[] strings = new String[5];
        // 2. Add five Strings to your list
    	strings[0] = "bob";
    	strings[1] = "joe";
    	strings[2] = "jeff";
    	strings[3] = "john";
    	strings[4] = "jack";
        // 3. Print all the Strings using a standard for-loop
    	for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]); 
		}
        // 4. Print all the Strings using a for-each loop
    	for (type var: String) {
    		System.out.println(strings[i]);
    	}
        // 5. Print only the even numbered elements in the list.
    	for (int i = 0; i < strings.length; i++2) {
    		System.out.println();
    	}
        // 6. Print all the Strings in reverse order.
    	for (int i = strings.length; i i > 0; i--)	{
    		System.out.println();
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
        // check if each string contains the substring e	
    }
}
