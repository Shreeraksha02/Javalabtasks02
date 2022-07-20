class Mobile
{
	String MobileModel;
	String MobileCompany;
	Double MobilePrice;

	public void AddMobile(String Mmodel, String Mcompany, double Mprice)

{
	MobileModel=Mmodel;
	MobileCompany=Mcompany;
	MobilePrice=Mprice;
	System.out.println(Mmodel+" "+Mcompany+" price is "+Mprice);
}

	public void displayMobile()
	{
		System.out.println(MobileModel+ " " +MobileCompany+ " price is " +MobilePrice);
	}
}
