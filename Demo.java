package opps.com;

 class Demo {
	
	  public static void main(String[] args) {
		  
		  System.out.println("Print the data of First  Students");
		Students  st1 = new Students();
		st1.StudentId = 123;
		st1.StudentName = " Tushar ";
		st1.StudentCity = " Bangalore ";
		
		st1.study();
		st1.showFullDetails();
		
		
		System.out.println("Print the data of Second Students");
		
		Students  st2 = new Students();
		st2.StudentId = 23851;
		st2.StudentName = " Tushar Bhartiya ";
		st2.StudentCity = " Kanpur  ";
		
		st2.study();
		st2.showFullDetails();
		
		
	}  
	 

}
