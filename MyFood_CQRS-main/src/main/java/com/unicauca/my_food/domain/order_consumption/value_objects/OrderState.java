package com.unicauca.my_food.domain.order_consumption.value_objects;

import com.unicauca.my_food.domain.order_consumption.constants.OrderStateConstans;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.BusinessRuleException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderState {
    private String id_state;
    private String state;

    public OrderState(){}
    
    public OrderState(int state){
        this.state = this.selectState(state);
    }

    public String selectState(int state){
        if(state == 0)
            return OrderStateConstans.ORDER_STATE_PROCESING;
        else if(state == 1)
            return OrderStateConstans.ORDER_STATE_COMPLETED;
        else if(state == 2)
            return OrderStateConstans.ORDER_STATE_CANCELLED;
        else
            throw new BusinessRuleException("State is no valid...");
    }
}
