
public class p6 
{
	public static void main(String[] args)
	{
		Car2 car2;
		car2 = new Car2();
		
		car2.num = 1234;
		car2.gas = 20.5;
		
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}
}

class Car2
{
	int num;
	double gas;
}