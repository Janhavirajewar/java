// 1.	Find minimum and maximum number in array

import java.util.Scanner;
class MaxMinArray
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter the element of arrray");
		for(int i=0;i<5;i++)
		{
			 arr[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Array elements :"+arr[i]);
		}

		int min=arr[0];
		int max=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];	
			}

			if(arr[i]>min)
			{
				max=arr[i];	
			}			
		}
			System.out.println("Minimun is"+min);
			System.out.println("Maximun is"+max);

		System.out.println("Enter element you have to search");
		int search=sc.nextInt();
		boolean f=false;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("element found ad index"+(i+1));
				f=true;
				break;
			}
			
		}
		
		if (f==false) {
            System.out.println(search + " not found in the array.");
     	   }

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum Of Array Elements"+sum);

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0){
			System.out.println("even is"+arr[i]);	
			}
			
			else
			{
				System.out.println("odd array elements are"+arr[i]);
			}
			
		}

		System.out.println("Alternate elements are:");
       		 for (int i = 0; i <arr.length; i += 2) {
           	 System.out.print(" alternate"+arr[i]);
        	}
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			if(n<=1)
			continue;
			
			int flag=0;
			for(int j=2;j<n;j++)
			{
				if(n % j == 0)
			{
				flag = 1;
				break;
			}

			}
			if(flag==0)
			{
				System.out.println("prime is"+n);
			}
		}


		
		int[] brr= new int[5];
		System.out.println("enter elemnt in 2nd array");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=sc.nextInt();
		}		
		
		int[] crr = new int[arr.length + brr.length];
        
       		 for (int i = 0; i < arr.length; i++) 
		{
           		 crr[i] = arr[i];
     	 	}
		
		for(int i=0;i<brr.length;i++)
		{
			crr[arr.length+i]=brr[i];
		}

		 System.out.println("Merged array:");
       		 for (int i = 0; i < crr.length; i++)
		 {
          		  System.out.println("merged"+crr[i]);
        	}



		for(int i=0;i<arr.length/2;i++)
		{
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
			
			
		}
		System.out.println("Reversed array:");

		for (int i = 0; i < arr.length; i++)	
	 {
  		 System.out.println(arr[i]);
	}


	for (int i = 0; i < arr.length - 1; i++) {
    	for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}

	System.out.println("Array sorted in ascending order:");
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}


	}
}