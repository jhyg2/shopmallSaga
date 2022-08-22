package shopmallsaga.domain;

import shopmallsaga.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
}
