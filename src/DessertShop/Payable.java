package DessertShop;

public interface Payable {
    enum PayType{
    	CASH,
    	CARD,
    	PHONE,
    }
    //Methods
    PayType getPayType();
    void setPayType(PayType pt);
}
