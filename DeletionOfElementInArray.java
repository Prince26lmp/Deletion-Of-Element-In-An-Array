package JavaDSA;
import java.util.Scanner;
public class DeletionOfElementInArray {
	public static void main(String[] args) {	
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter The Size Of Array:");
     int n=sc.nextInt();
     int arr1[]=new int[n];
     int arr2[]=new int[n-1];
     System.out.println("Enter The Elements Of Array:");
     for(int i=0;i<n;i++)
     {
    	 arr1[i]=sc.nextInt();
     }
     System.out.print("Array Before Deletion Are :");
     for(int i=0;i<n;i++)
     {
    	 System.out.println(" " +arr1[i]);
     }
     System.out.print("Enter The Index Of Value To Be Deleted:");
     int index=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 if(i<index)
    	 {
    		 arr2[i]=arr1[i];
    	 }
    	 else if(i==index)
    	 {
    		 continue;
    	 }
    	 else
    	 {
    		 arr2[i-1]=arr1[i];
    	 }
     }
     System.out.println("Array After Deletion :");
     for(int i=0;i<n-1;i++)
     {
    	 System.out.println(" " +arr2[i]);
     }
	}
}
