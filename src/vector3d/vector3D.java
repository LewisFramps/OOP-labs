package vector3d;

public class vector3D {
	private double x;
	private double y;
	private double z;
	
	public vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
	public double getTheta() {
		return Math.acos(this.z/getR());
	}
	
	public double getPhi() {
		return Math.atan2(this.y, this.x);
	}
	
	public static vector3D add(vector3D v1, vector3D v2) {
		return new vector3D(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
	}
	
	public static vector3D subtract(vector3D v1, vector3D v2) {
		return new vector3D(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
	}
	
	public static vector3D scale(vector3D v, double scale) {
		return new vector3D(v.x * scale, v.y * scale, v.z * scale);
	}
}
