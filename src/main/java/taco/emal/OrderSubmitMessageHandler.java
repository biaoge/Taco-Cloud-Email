package taco.emal;

import org.springframework.integration.handler.AbstractReplyProducingMessageHandler;
import org.springframework.stereotype.Component;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderSubmitMessageHandler extends AbstractReplyProducingMessageHandler {

    private final RestTemplate rest;
    private final ApiProperties apiProps;

    public OrderSubmitMessageHandler(ApiProperties apiProps, RestTemplate rest) {
        this.apiProps = apiProps;
        this.rest = rest;
    }

    @Override
    protected Object handleRequestMessage(Message<?> message) {
        Order order = (Order) message.getPayload();
        rest.postForObject(apiProps.getUrl(), order, String.class);
        return null;
    }
}
