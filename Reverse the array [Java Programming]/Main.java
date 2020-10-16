import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
	int counter, i=0, j=0, temp;
	int number[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	counter = scanner.nextInt();
	for(i=0; i<counter; i++)
	{
	    number[i] = scanner.nextInt();
	}
	j = i - 1;     
	int k;         
	scanner.close();
	//Try out your code here
	for(k=j; k>=0; k--)
	{
	   System.out.print(number[k]+ "  ");
	}       
   }
}
    