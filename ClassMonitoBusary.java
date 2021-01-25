class StudentBousary  //parent class
{
  
  double bousary=450000;
  void printbursry()
  {
    System.out.println("The  bursary  of student is ="+ bousary);
  }
	
}
  class ClassMonitoBusary extends StudentBousary
  {
     double commission= (bousary*2)/100;
     double total =bousary+commission;
     void printbursry()
     {
     	System.out.println("The total bursary for class is ="+ total);
     }
          public static void main(String[] args) {
     	ClassMonitoBusary b=new ClassMonitoBusary();
     	//b.printbursry();

        b.printbursry();
     }
  }
  class Viceclass extends ClassMonitoBusary
  {
  	double total =bousary+(bousary*1)/100;
  	void printbursry()
  	{
  		System.out.println("The busary for VC chef is "+total);
  	}
  	 public static void main(String[] args) 
  	 {
  	 	Viceclass h=new Viceclass();
  	 	h.printbursry();
  	 	 //h.printbursry();
  	 	 //h.printbursry();

  	 }
  }

