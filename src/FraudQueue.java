import java.util.ArrayList;

public class FraudQueue {
	
	
	private  ArrayList<Transaction> fraudList = new ArrayList<Transaction>();
	
	FraudQueue(){
		
	}
	
	public void addTransaction(Transaction transaction) {
		fraudList.add(transaction);
	}
	
	public Transaction getTransaction() {
		
		return null;
		
	}
	
	public Transaction readFromString(String fraudQueueData) {
		
		return null;
	}
}