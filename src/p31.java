
public class p31
{
	public static void main(String[] args)
	{
		Car.showSum();
		
		Car16 car1;
		car1 = new Car16();
		car1.setCar(1234,20.5);
		
		Car.showSum();
		
		Car16 car2;
		car2 = new Car16();
		car2.setCar(4567,30.5);
	}
}

class Car16
{
public static int sum = 0;	
	
	private int num;
	private double gas;
	
	public Car16()
	{	
		num = 0;
		gas =0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{	
		gas = g;
		num = n;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public static void showSum()
	{	
		System.out.println("車子總共有"+sum+"台");
	}
	
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}