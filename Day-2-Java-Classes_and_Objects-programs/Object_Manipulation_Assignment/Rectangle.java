
public class Rectangle {
	private float length;
	private float width;
	void set(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float perimeter() {
		return (2 * getLength() + 2 * getWidth());
	}
	public float area() {
		return getLength() * getWidth();
	}
	public static boolean sameArea(Rectangle rectangle1,Rectangle rectangle2) {
		if(rectangle1.area() == rectangle2.area()) {
			return true;
		}
		else {
			return false;
		}
	}
}
