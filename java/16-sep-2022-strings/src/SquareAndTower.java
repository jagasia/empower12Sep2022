import java.util.Scanner;

public class SquareAndTower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cityLength=sc.nextInt();
		int noOfTowers=sc.nextInt();
		int towers[][]=new int[noOfTowers][2];
		int city[][]=new int[cityLength][cityLength];
		
		for(int i=0;i<noOfTowers;i++)
		{
			towers[i][0]=sc.nextInt();
			towers[i][1]=sc.nextInt();
		}
		//for as many towers present, we need to update the towers and adjacent
		for(int i=0;i<noOfTowers;i++)
		{
			int x=towers[i][0];
			int y=towers[i][1];
			
			city[x][y]=1;
//			System.out.println("The adjacency of "+x+" and "+y);
			for(int m=-1;m<=1;m++)
			{
				for(int n=-1;n<=1;n++)
				{
					int x1=x+m;
					int y1=y+n;
					if(x1>=0 && x1<cityLength && y1>=0 && y1<cityLength)
					{
//						System.out.println("x1="+x1+" y1="+y1);
						city[x1][y1]=1;
					}
				}
			}
//			
		}
		
		System.out.println("-----------------");
		//showing the city
		for(int i=0;i<cityLength;i++)
		{
			for(int j=0;j<cityLength;j++)
			{
				System.out.print(city[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
