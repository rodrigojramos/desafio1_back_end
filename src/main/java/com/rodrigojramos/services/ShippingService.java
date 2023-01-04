package com.rodrigojramos.services;

import com.rodrigojramos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double freight = 0.00;
        if(order.getBasic() < 100.00) {
            freight = 20.0;
        }
        if(order.getBasic() >= 100.00 && order.getBasic() < 200.00 ) {
            freight = 12.0;
        }
        if(order.getBasic() >= 200.00) {
            freight = 0.00;
        }
        return freight;
    }
}
