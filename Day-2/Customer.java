package definedexception;


public class Customer {
	String name;
    long mobile;
    char key;

	
	public Customer(String name , long mobile , char key) {
		this.name=name;
	    this.mobile=mobile;
	    this.key=key;

		
	}
	
	public String encrypt() {
		if(name.indexOf(key)>=0) {
			return "Already Encrypted";
		}
		else {
			long dig=mobile;
			while(dig >= 10)
			{
				dig = dig / 10;
			}
			int n=(int)dig;
			
			StringBuilder s = new StringBuilder(name);
		    for(int i=0; i<n; i++){
		        s.append(key);
		    }
		    return s.toString();
		}
		
	}

	public long minCount() {
		long min,rem;
		long temp=mobile;
		min=temp%10;
	    while(temp>0) {
	    	rem=temp%10;
	    	if(min>rem)
	    		min=rem;
	    	temp=temp/10;
	    }
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Doselect", 29999992, '#');
		System.out.println(customer.encrypt());
		System.out.println(customer.minCount());


	}

}

