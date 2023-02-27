public class Customer
{
	private String name;
	private String address;
	private long phone;

	public Customer(String name)
	{
		this.name = name;
	}

	public Customer(String name, String address)
	{
		this.name = name;
		this.address = address;
	}

	public Customer(String name, long phone)
	{
		this.name = name;
		this.phone = phone;
	}

	public Customer(String name, String address, long phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}




	public void setName(String name)
	{
		this.name = name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setPhone(long phone)
	{
		this.phone = phone;
	}


	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public long getPhone()
	{
		return phone;
	}





}