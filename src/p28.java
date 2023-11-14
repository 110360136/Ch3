
public class p28
{
	public static void main(String[] args)
	{
		Car15 car1;
		car1 = new Car15();
		car1.show();
		
		Car15 car2;
		car2 = new Car15(1234,25.0);
		car2.show();
	}
}

class Car15
{
	private int num;
	private double gas;
	
	public Car15()
	{	
		num = 0;
		gas =0.0;
		System.out.println("生產了車子");
	}
	
	public Car15(int n,double g)
	{	
		this();
		gas = g;
		num = n;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}