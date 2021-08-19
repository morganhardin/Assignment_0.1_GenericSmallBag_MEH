public class Application 
{
	public static void main(String[] args) 
	{
		SmallBag<Item> Smallbag_Item = new SmallBag<Item>();
		Item<String> item_string = new Item<String>();
		Item<Integer> item_integer = new Item<Integer>();
		
		item_string.setE("Morgan");
		item_integer.setE(4);
		
		Smallbag_Item.setItem(item_string);
		System.out.println(Smallbag_Item.toString());
		Smallbag_Item.setItem(item_integer);
		System.out.println(Smallbag_Item.toString());
	}
}
