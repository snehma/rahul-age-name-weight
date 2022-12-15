}class Person{
	private int height;
	private int weight;
	private int age;
	private String name;
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Rahul extends Person{
	private String var = "Major";
	public Rahul(int h, int w, int a, String n) {
		setHeight(h);
		setWeight(w);
		setAge(a);
		setName(n);
	}
	
	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Height: "+getHeight());
		System.out.println("Weight: "+getWeight());
		System.out.println("Major: "+var);
	}
}
public class Question1 {

	public static void main(String[] args) {
		Rahul obj = new Rahul(26,89,172, "Rahul");
		obj.display();
	}

}