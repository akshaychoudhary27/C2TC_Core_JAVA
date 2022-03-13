interface Sayable {
	public void say();
}
public class LambdaExpr_no_params_multi_statement {
	public static void main(String[] args){	
		Sayable s=() -> {		
		System.out.println("I	have	nothing	to	say");
		System.out.println("I	have	nothing	to	say");
		System.out.println("I	have	nothing	to	say");
		} ;
		s.say();
		}

}
