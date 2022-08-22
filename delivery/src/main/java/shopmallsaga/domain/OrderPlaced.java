package shopmallsaga.domain;

import shopmallsaga.domain.*;
import shopmallsaga.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;

// keep

}


