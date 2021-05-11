package Tuto;

//abstract class
abstract class car{
	
	public int weight=6790;
	public int height=163;
	//abstract method
	public abstract void speed(); 
}

//subclass
class maruthi extends car{
	
	public int width=12;
	
	
	


	@Override
	public void speed() {
		System.out.println("car riding all day");
		
	}
	
}
public class myAbstract {
	
	
	
	public static void main(String[] args) {
		
		maruthi obj1 = new maruthi();
		System.out.println(obj1.weight);
		System.out.println(obj1.height);
		System.out.println(obj1.width);
		obj1.speed();
	}
}
