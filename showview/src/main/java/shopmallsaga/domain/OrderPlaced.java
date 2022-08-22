package shopmallsaga.domain;

import shopmallsaga.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
}
