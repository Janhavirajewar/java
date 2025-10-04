
class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr;
		arr=new int[5];




		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		//taking values in array from user 
		


		Emp[] brr= new Emp[5];
		//array of references which has null at all the array locations
		
		for(int i=0;i<brr.length;i++)
		System.out.println(brr[i]);// this code prints 5 times null 
		
		for(int i=0;i<brr.length;i++)
		brr[i].display();// this gives NullPointerException

		// what should we do >>
		brr[0]=new Emp();//default
		brr[1]= new Emp(101,"Sachin",2000);//parameterised

		//and so on...then
		for(int i=0;i<brr.length;i++)
		brr[i].display();
		
		


		


	}
}






