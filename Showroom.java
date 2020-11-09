package Assignment3;

class Car {

		Car(String brand,String color,int price)//parameterized
		{
			this.brand=brand;
			this.color=color;
			this.price=price;
		}
		Car()//no-args
		{
		}

		String brand;
		String color;
		private int price;//properties

		public int getPrice()
		{
			return price;
		}

		public void setPrice(int price)
		{
			this.price=price;
		}

		public void move()//behaviours
		{
			System.out.println(brand+" car moves forward");
		}

		

}
class Showroom 
{
	public static void main(String[] args) 
	{
		Car c1=new Car("Maruti","white",200000);
		c1.move();
		//System.out.println(c1.price);//CTE
		System.out.println("previous price: "+c1.getPrice());
		//c1.price=300000;//CTE
		c1.setPrice(500000);

		System.out.println("increased price: "+c1.getPrice());

		
	}
}

