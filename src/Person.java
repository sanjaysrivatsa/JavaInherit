class Person
{
	private int CitizenID; //Private members of a class are not inherited by it's child classes. So, they can't be accessed within the child class.
	private String Name;

	public void SetName (String Name)
	{
		Name = Name;
	}
	public String GetName ()
	{
		return Name;
	}
	public void SetCitizenID (int id)
	{
		CitizenID = id;
	}
	public int GetCitizenID ()
	{
		return CitizenID;
	}
	public String GetDetails ()
	{
		System.out.println("returned the values..");
		return  ("Citizen ID : " + CitizenID + "\t\tName : " + Name);
		/*System.out.println ("EmployeeID : " + EmployeeID);
		System.out.println ("Basic Salary : " + BasicSal);*/
	}
}