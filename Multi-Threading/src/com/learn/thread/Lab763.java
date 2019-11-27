package com.learn.thread;

class Account{
	int bal=970;
	public void withdraw(int amt) {
		if(bal>=amt){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw.... "+bal);
		
		try{
			Thread.sleep(200);
		}catch(Exception e){
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+" is completed withdraw.. "+bal);
		}
		}else {
			System.out.println("No Funds for "+Thread.currentThread().getName());
		}
	}
	public int getBal(){
		return bal;
	}
}

class AccountThread implements Runnable {
	
	Account acc=null;
	public AccountThread(Account ac) {
		this.acc=ac;
		Thread t1=new Thread(this,"A");
		Thread t2= new Thread(this,"B");
		t1.start(); t2.start();
	}
	public void run() {
		for (int i = 0; i <5; i++) {
			acc.withdraw(225);
			if(acc.getBal()<0)
				System.out.println("Amount is OverDrawn....");
		}
	}
	
}

public class Lab763 {

	public static void main(String[] args) throws Exception {
		Account acc=new Account();
		new AccountThread(acc);
	}
}


// run it 
/*
			
			NEW
			Thread-1-value is: 0	RUNNABLE
			TIMED_WAITING
			Thread-1-value is: 1	RUNNABLE
			Thread-1-value is: 2	RUNNABLE
			Thread-1-value is: 3	RUNNABLE
			Thread-1-value is: 4	RUNNABLE
			Thread-1-value is: 5	RUNNABLE
			Thread-1-value is: 6	RUNNABLE
			Thread-1-value is: 7	RUNNABLE
			Thread-1-value is: 8	RUNNABLE
			Thread-1-value is: 9	RUNNABLE
			TERMINATED		

 */
