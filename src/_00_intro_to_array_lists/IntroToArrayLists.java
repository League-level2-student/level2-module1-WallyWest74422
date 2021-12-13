package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> MyFirstArrayList = new ArrayList<String>();
		//2. Add five Strings to your list
		MyFirstArrayList.add("StringUno");
		MyFirstArrayList.add("StringDos");
		MyFirstArrayList.add("StringTres");
		MyFirstArrayList.add("StringCuatro");
		MyFirstArrayList.add("StringCinco");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<MyFirstArrayList.size();i++) {
			System.out.println(MyFirstArrayList.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for( String x : MyFirstArrayList) {
			System.out.println(x);
		}
		//5. Print only the even numbered elements in the list.
		for(int j = 1; j<MyFirstArrayList.size();j+=2) {
			System.out.println(MyFirstArrayList.get(j));
		}
		//6. Print all the Strings in reverse order.
		for(int k = MyFirstArrayList.size()-1;k>=0;k-- ) {
			System.out.println(MyFirstArrayList.get(k));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int l = 0; l<MyFirstArrayList.size(); l++) {
		if(MyFirstArrayList.get(l).contains("e")) {
			System.out.println(MyFirstArrayList.get(l));
		}
		System.out.println(MyFirstArrayList.indexOf(MyFirstArrayList.size()-1));

		}
	}
}
