package interview.compare_list_change;

public class Order {
	private Long orderId;
    private Double amount;
    private String currencyPair;
    
	public Order(Long orderId, Double amount,String currencyPair) {
		super();
		this.orderId = orderId;
		this.currencyPair = currencyPair;
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((currencyPair == null) ? 0 : currencyPair.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;	
	}

	
	@Override
	public boolean equals(Object obj) {
		// == check |  If the object is compared with itself then return true
		if (this == obj)
			return true;
		
		//null and classname check
		if (obj == null ||  getClass() != obj.getClass())
			return false;
		
		//instance of check
		if(!(obj instanceof Order)) {
			return false;
		}
		
		//type cast to class object
		Order other = (Order) obj;

		//obj comparision check
		if(Double.compare(this.amount, other.amount) != 0)
			return false;
		if(Long.compare(this.orderId, other.orderId) != 0)
			return false;
		if(!currencyPair.equals(other.currencyPair))
			return false;
		
		//if code is not going into any of the above condition then return true
		return true;
	}
    
     
    
    
}
