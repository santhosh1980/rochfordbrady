package Tuto;

class animal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Animal making sound");
		
	}
	
}

class cow extends animal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Cow making sound");
		
	}
	
	
}

class pig extends animal{
	
	public void animalsound() {
		// TODO Auto-generated method stub
		System.out.println("Pig making sound");
		
	}
	
	
}

public class myPolymor {
	
public static void main(String[] args) {
		
		animal obj1 =  new animal();
		cow obj2 = new cow();
		pig obj3 = new pig();
		
		obj1.animalsound();
		obj2.animalsound();
		obj3.animalsound();
		
	}
	
}
	
	
	

