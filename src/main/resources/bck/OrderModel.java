package bck;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class OrderModel {

    @Getter @Setter
    List<OrderDetails> orders;

    public OrderModel(List<OrderDetails> orders){
        this.orders = orders;
    }

    public OrderModel(){}
}

