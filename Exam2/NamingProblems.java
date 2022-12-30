public class NamingProblems {
	
	//String first_name;
	String firstName;
	static int namingErrors(int x, int y) {
		int z = 1;
		for(int i = 0; i < y; i++) {
			z = z * x;
		}
		return z;
	}
	
	public static void main(String[] args) {
		//NamingProblems naming_errors = new NamingProblems();
		NamingProblems namingErrors = new NamingProblems();
		//int base_var = 2;
		int baseVariable = 2;
		//int exp_var = 10;
		int expVariable = 10;
		//int base_var_of_pow_exp_var = naming_errors.f(base_var, exp_var);
		int baseVariableOfPowerExpVariable = namingErrors(baseVariable,expVariable);
		//System.out.println(base_var + " to the " + exp_var + " is " + base_var_of_pow_exp_var);
		System.out.println(baseVariable + " to the " + expVariable + " is " + baseVariableOfPowerExpVariable);
		//System.out.println(base_var + " ^ " + exp_var + " is " + base_var_of_pow_exp_var);
		System.out.println(baseVariable + " ^ " + expVariable + " is " + baseVariableOfPowerExpVariable);
	
//		int _ = 10;
		int number = 10;
	}
}
