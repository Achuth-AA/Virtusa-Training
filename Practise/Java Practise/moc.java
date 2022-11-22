package javaoops;

public class moc {
	int x;
	public moc(int y) {
		x = y;
	}
	public moc(int z,int a) {
		x = z+a;
	}
	public static void main(String[] args) {
		moc myobj = new moc(1,2);
		System.out.println(myobj.x);
	}
}
