public class PrintArray 
{  
    public static void main(String[] args) 
	{  
        int [] arr = new int [] {1,2,3,4,5,6,8};  
		int sum = 0;  
		
        System.out.println("Elements of array:- ");  
        for (int i = 0; i < arr.length; i++) 
		{  
            System.out.print(arr[i] + " ");  
			sum = sum + arr[i];  
        }  
		System.out.println("\nSum of elements of array:- " + sum);  
		
		System.out.println("Odd Numbers:-"); 
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]%2!=0)
			{  
				System.out.println(arr[i]);  
			}  
		}  
		
		System.out.println("Even Numbers:-");  
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]%2==0)
			{  
				System.out.println(arr[i]);  
			}  
		}  
    }  
}  