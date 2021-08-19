public class Item <T>
{
	public T e;

	public T getE() 
	{
		return e;
	}
	public void setE(T e) 
	{
		this.e = e;
	}
	@Override
	public String toString() 
	{
		return "" + getE();
	}
}
