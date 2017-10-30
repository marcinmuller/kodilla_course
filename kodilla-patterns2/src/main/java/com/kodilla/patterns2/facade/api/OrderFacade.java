package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public /*final*/ class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder(final OrderDto order, final Long userId) throws OrderProcessingException{
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, id: "+orderId );
        if (orderId <0){
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
        }
        try {
            for (ItemDto ordeItem: order.getItems()){
                LOGGER.info("adding item"+ordeItem.getProductId()+", "+ordeItem.getQuantity()+" pos.");
                shopService.addItem(orderId, ordeItem.getProductId(), ordeItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("order value is "+value);
            if(!shopService.doPayment(orderId)){
                LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("payment for order was done");
            if (!shopService.verifyOrder(orderId)){
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("order is ready to submit");
            if (!shopService.submitOrder(orderId)){
                LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("order "+orderId+" submitted");
        } finally {
            if (wasError){
                LOGGER.info("cancelling order "+orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}
