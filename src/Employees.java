class Employees extends Person
{
	private int EmployeeID;
	private float BasicSal;
	public void SetDetails (int id, float BasSal)
	{
		EmployeeID = id;
		BasicSal = BasSal;
	}
	public String GetDetails ()
	{
		//System.out.println ("Citizen ID : " + CitizenID);
		//System.out.println ("Name : " + Name);
		//System.out.println ("EmployeeID : " + EmployeeID);
		//System.out.println ("Basic Salary : " + BasicSal);
		System.out.println("Retrieved employee details");
		return "EmployeeID : " + EmployeeID + "\tBasic Salary : " +  BasicSal;
	}
	public void SetEmployeeID (int id)
	{
		EmployeeID = id;
	}
	public int GetEmployeeID ()
	{
		return EmployeeID;
	}
}