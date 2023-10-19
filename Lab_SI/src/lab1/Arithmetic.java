package lab1;
//Crainiciuc Filaret-Niculai
//Gr 3142A
public class Arithmetic {
	private double a, b;
	private String operation;
	private Result result = new Result();
	
	public Arithmetic() {
		
	}
	
	public void setFirstOperand(double x) {
		this.a = x;
	}
	
	public void setSecondOperand(double x) {
		this.b = x;
	}
	
	public void setOperation(String s) {
		operation = s;
	}
	
	public String calculate() {
		String res = "";
		Double r;
		switch (operation) {
		case "+":
			r = a + b;
			res = intOrDoubleToString(r, res);

			return res;
		case "-":
			r = a - b;
			res = intOrDoubleToString(r, res);

			return res;
		case "*":
			r = a * b;
			res = intOrDoubleToString(r, res);

			return res;
		case "/":
			if(result.isDevidePossible(a, b)) {
				r = a / b;
				res = intOrDoubleToString(r, res);
				
				return res;
			} else {
				return "NaN";
			}

		default:
			return null;
		}
	}
	
	private String intOrDoubleToString(Double r, String res) {
		if(result.isInt(r)) {
			res = Integer.toString((int)Math.round(r));
		}
		else {
			res = Double.toString(r);
		}
		return res;
	}
	
	public void clear() {
		this.a = 0;
		this.b = 0;
		operation = "";
	}
}
