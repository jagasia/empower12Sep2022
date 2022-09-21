import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int noOfItems=sc.nextInt();
		List<Item> itemList=new ArrayList<Item>();
		for(int i=0;i<noOfItems;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			Item item=Item.createItem(detail);
			itemList.add(item);
		}
		
		System.out.println("Enter a type to sort: \r\n" + 
				"1.Sort by Name \r\n" + 
				"2.Sort by Price \r\n" + 
				"");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:	//sort by name
			Collections.sort(itemList);
			break;
		case 2:	//sort by price
			Collections.sort(itemList,new PriceComparator());
			break;
		}
		
		System.out.format("%-20s %-10s %-12s\n","Name","Price","Type");
		for(Item i:itemList)
			System.out.format("%-20s %-10s %-12s\n",i.getName(),i.getPrice(),i.getType());
	}

}
