interface Drawable{
	public void draw(int width, int length);
}
public class Lambda_expr_with_param {
	public static void main(String[] args) {
		Drawable d2=(int width, int length) -> {
					System.out.println("Draw a cube with width and length of "+ width + " "+ length);
		};
		d2.draw(10,20);
	}
}
