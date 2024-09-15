
public class Main {

	
	public static void main(String[] args) {
		//BankAccount acct1 = new BankAccount();
        BankAccount acct1 = new BankAccount(3000, -1000);
        boolean success = acct1.withdraw(1500);
        acct1.deposit(7000);
        System.out.println("success=" + success + ", balance=" + acct1.getBalance());
        
        
        // Create two accounts for Lisa and Bob, each with a balance of 1000 and minBalance of -1000
        BankAccount lisa = new BankAccount(1000, -1000);
        BankAccount bob = new BankAccount(1000, -1000);
        
     // מציג יתרות
        System.out.println("Initial balances:");
        System.out.println("Lisa's balance: " + lisa.getBalance());
        System.out.println("Bob's balance: " + bob.getBalance());

     // Transfer 500 from Lisa to Bob
        boolean transferSuccess = lisa.transfer(bob, 500);
        System.out.println("\nTransfer 500 from Lisa to Bob: " + (transferSuccess ? "Success" : "Failed"));
        
     // Display new balances
        System.out.println("Lisa's balance: " + lisa.getBalance());
        System.out.println("Bob's balance: " + bob.getBalance());

     // Try to transfer 1600 from Lisa to Bob (should fail)
        transferSuccess = lisa.transfer(bob, 1600);
        System.out.println("\nAttempt to transfer 1600 from Lisa to Bob: " + (transferSuccess ? "Success" : "Failed"));
        
        if (!transferSuccess) {
            System.out.println("\nAttempt to transfer 1600 from Lisa to Bob failed: Insufficient funds or would exceed the minimum balance allowed.");
        } else {
            System.out.println("\nTransfer 1600 from Lisa to Bob: Success");
        }
        
        
        
     // Display final balances
        System.out.println("Lisa's balance: " + lisa.getBalance());
        System.out.println("Bob's balance: " + bob.getBalance());
        
        
        
        
        
    }

	
	
	
}