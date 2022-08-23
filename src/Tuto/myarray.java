package Tuto;

import java.util.ArrayList;

public class myarray {
	
	public static void main (String[] args) {
		
		ArrayList<String> mycars = new ArrayList<String>();
		
		mycars.add("Volvo");
		
		mycars.add("Honda");
		
		mycars.add("Renault");
		
		mycars.add("Nissan");
		
		int carsize = mycars.size();
		
		for (int i=0;i<carsize;i++) {
			
			System.out.println(mycars.get(i));
		}
		
	}

}
