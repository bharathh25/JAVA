class Ananya{
	long mobile;
	Knife knife;
	
	Ananya(long mobile,Knife knife){
		this.mobile=mobile;
		this.knife=knife;
	}
	
	public void display(){
		this.knife.details();
		System.out.println("Ananya Mobile :"+mobile);
	}
}