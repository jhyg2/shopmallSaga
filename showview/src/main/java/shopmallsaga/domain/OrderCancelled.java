package shopmallsaga.domain;

import shopmallsaga.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
}
