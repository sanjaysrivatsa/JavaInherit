class MainClass
{
	public static void main (String args[])
	{
		Employees e = new Employees ();

		/*e.EmployeeID = 100;
		e.Name = "ROGER";
		e.BasicSal = 10000.00;*/

		e.SetEmployeeID (100); //Locates this in Employee
		e.SetName ("ROGER"); //Locates this in Person
		//e.SetBasicSal (10000.00); //Not defined either in Employee or in Person

		System.out.println ("EmployeeID : " + e.GetEmployeeID ()); //Locates this in Employee
		System.out.println ("Name : " + e.GetName ()); //Locates this in Person
		//System.out.println ("Basic Sal : " + e.GetBasicSal ()); //Not defined either in Employee or in Person

		Employees m = new Employees ();
		m.SetEmployeeID (101); //Locates this in Employee
		m.SetName ("KING");//Locates this in Person
		//m.SetBasicSal (20000.00); //Not defined either in Employee or in Person

		System.out.println ("EmployeeID : " + m.GetEmployeeID ());//Locates this in Employee
		System.out.println ("Name : " + m.GetName ()); //Locates this in Person
		//System.out.println ("Basic Sal : " + m.GetBasicSal ()); //Not defined either in Employee or in Person
		
		ContractEmployee  cemp=new ContractEmployee();
		cemp.GetCitizenID();
		cemp.GetDetails();
		
		
		if( e instanceof Employees)
			System.out.println("E is a Employee object");
		else
			System.out.println("E is not an Employee object");
		

		System.out.println(e instanceof ContractEmployee); //false
		//System.out.println(e instanceof IndependentProfessional); 
		
		System.out.println(cemp instanceof ContractEmployee); //true
		
		System.out.println(cemp instanceof Object); //true
		
		System.out.println("cemp belongs to " + cemp.getClass().getName());
		
		System.out.println("e belongs to " + e.getClass().getName());
	}
}	