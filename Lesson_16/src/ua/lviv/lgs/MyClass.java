package ua.lviv.lgs;



public class MyClass extends MyClassExtend {
	  
	public String neme = "Lili";
	public int age  = 25;
	
    private String lastName = "Mishalin";
	
	private int weight=56;
	private double height=1.75;
	
	
	public MyClass() {}

	private MyClass(String neme, int age) {
		super();
		this.neme = neme;
		this.age = age;
	}



	public MyClass(String neme, int age, String lastName, int weight, double height) {
		super();
		this.neme = neme;
		this.age = age;
		this.lastName = lastName;
		this.weight = weight;
		this.height = height;
	}



	public String getNeme() {
		return neme;
	}



	public void setNeme(String neme) {
		this.neme = neme;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (neme == null) {
			if (other.neme != null)
				return false;
		} else if (!neme.equals(other.neme))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "MyClass [neme=" + neme + ", age=" + age + ", lastName=" + lastName + ", weight=" + weight + ", height="
				+ height + "]";
	}
	
    
	
}
