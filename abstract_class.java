package javaProject;
abstract class absmethods {
	abstract public void greet1();
	abstract public void greet2();
}
class getnset extends absmethods {
	
	String name;
	int id,age;
	@Override
	public void greet1() {
		setName("Raghav");
		setId(12);
		setAge(20);
	}
	
	@Override
	public void greet2() {
		System.out.println("Employee  Details : \n\nName:"+getName()+", Id:"+getId()+", Age:"+getAge());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class abstract_class {

	public static void main(String[] args) {
		getnset gs = new getnset();
		gs.greet1();
		gs.greet2();
	}

}
