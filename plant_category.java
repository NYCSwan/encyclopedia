//ABSTRACT CLASSES must be inherited
//by other classes to be of value. Only
//CONCRETE classes can be INSTANTIATED.
public abstract class Plant {

	//Abstract classes can define implementations
	//In this case, the code is reused exactly by child
	//classes unless @Override is used
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected double mass;
	protected double height;

	protected String name;
}
