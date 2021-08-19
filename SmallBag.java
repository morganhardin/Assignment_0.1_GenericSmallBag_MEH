public class SmallBag <T>
{
	public T item;
	
	public T getItem() 
	{
		return item;
	}
	public void setItem(T item) 
	{
		this.item = item;
	}
	@Override
	public String toString()
	{
		return "The item is: " + getItem() + ".";
	}
}
