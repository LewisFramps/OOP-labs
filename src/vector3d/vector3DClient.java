package vector3d;

public class vector3DClient {
	public static void main(String[] args) {
		vector3D newV = new vector3D(3, 4, 5);
		System.out.printf("r: %s\ntheta: %s\nPhi: %s\n",  newV.getR(), newV.getTheta(), newV.getPhi());
	}
}
