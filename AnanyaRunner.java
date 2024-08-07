class AnanyaRunner{
	public static void main(String[] args){
		
		Knife knife = new Knife(2.43,12.54);
		Ananya ananya = new Ananya(1234567890L, knife);
		ananya.display();
		
		System.out.println("---------------------");
		
		Knife knife1 = new Knife(2.63,11.54);
		Ananya ananya1 = new Ananya(1234567890L, knife1);
		ananya1.display();
		
		System.out.println("---------------------");
		
		Knife knife2 = new Knife(3.44,14.54);
		Ananya ananya2 = new Ananya(1234567890L, knife2);
		ananya2.display();
		
		System.out.println("---------------------");
		
	}
}