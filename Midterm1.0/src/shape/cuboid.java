package shape;

import java.util.Comparator;

public class cuboid extends rectangle{
	
	private int iDepth;
	
	public cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth,iLength);
		this.iDepth = iDepth;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return super.getiLength()*super.getiWidth()*iDepth;
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double area() {
		return (2*super.getiWidth()*iDepth)+(2*super.getiWidth()*super.getiLength())+(2*iDepth*super.getiLength());
	}
	
	public int compareTo(cuboid cub1) {
		return cub1.compareTo(cub1);
	}
	
	public class SortByArea implements Comparator<cuboid>{
		@Override
		public int compare(cuboid c1, cuboid c2) {
			return Double.compare(c1.area(), c2.area());
		}	
	}
	
	public class SortByVolume implements Comparator<cuboid>{
		@Override
		public int compare(cuboid c1, cuboid c2) {
			return Double.compare(c1.volume(), c2.volume());
		}	
	}
}
