class BankAccount {
	
    private int balance = 0;
    private int minBalance = -5000;
    private String owner ;
    
    
    public int getBalance() {
        return balance;
    }

    public int getMinBalance() {
        return minBalance;
    }
    
    public String getOwner() {
    	return owner;
    }
    
    public void setOwner(String owner){
    	this.owner = owner;
    }
    
    
    
    public void setBalance(int newBalance) {
    	if (newBalance >= minBalance) {
    		this.balance = newBalance;
    		System.out.println("new balance: " + newBalance);
    	}
    	else {
    		System.out.println("Cannot set balance below min balance of "+ minBalance);
    	}
    }
    
    
   
 // Constructor to initialize balance and minBalance
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
    
    public BankAccount(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
  
    }
   
    public boolean deposit(int amount){
    	if (amount>0) {
    		balance = balance + amount;
    		return true;
    	}
    	return false;
    }
    
    
	 public boolean withdraw(int amount) {
	        if (balance - amount < minBalance)
	            return false;
	        balance = balance - amount;
	        return true;
	    }
	 
	  public boolean transfer(BankAccount toAccount, int amount) {
	        if (withdraw(amount)) {
	            toAccount.deposit(amount);
	            return true;
	        }
	        return false; // Transfer denied due to insufficient funds
	    }
	  
	  public String toString() {
		 return ("Balance of " + this.owner + " = " + this.balance);
	  }
}
