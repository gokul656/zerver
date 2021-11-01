package bck;

import lombok.Getter;
import lombok.Setter;

public class OrderDetails{

    @Getter @Setter
    String productId;

    @Getter @Setter
    Integer qty;

    public OrderDetails(String productId, Integer qty){
        this.productId = productId; this.qty = qty;
    }

    public OrderDetails(){}
}