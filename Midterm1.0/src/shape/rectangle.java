package shape;

public class rectangle extends Shape implements Comparable<rectangle> {

	private int iWidth;
	private int iLength;
	
	public rectangle (int width, int length) {
		iWidth = width;
		iLength = length;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		this.iLength = length;
	}
	
	public double area() {
		return iWidth*iLength;
	}
	
	public double perimeter() {
		return iWidth*2 + iLength*2;
	}
	
	public int compareTo(rectangle rect1) {
		return this.compareTo(rect1);
	}
}
