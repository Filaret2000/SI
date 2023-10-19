package lab1;
//Crainiciuc Filaret-Niculai
//Gr 3142A
public class Result {
	
	public Result() {
		
	}
	
	public boolean isDevidePossible(Double a, Double b) {
		if(b == 0)
			return false;
		return true;
	}
	
	public boolean isInt(Double a) {
		return Math.ceil(a) == Math.floor(a); 
	}
	
}
