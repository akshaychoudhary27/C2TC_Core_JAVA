interface addition {
	public int add();
}
public class Lambda_expr2 {
	public static void main(String[] args) {
		addition d2=()-> (10+20); {
			System.out.println(d2.add());
		}
	}

}
