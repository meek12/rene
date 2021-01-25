class ComputerEven
{
	double number1;
	double ComputerEven_number(){
		if (number1%2!=0) {
			System.out.println("the number is even");
			
		}
		else{
			System.out.println("the number is odd");

		}
		return 0;
}
class It_level3B{
	public static void main(String[] args) {
	It_level3B it =new It_level3B();
	ComputerEven c =new ComputerEven();// object from another ccclass
	c.number1=12.3;
	c.ComputerEven_number();	
		
	}
}