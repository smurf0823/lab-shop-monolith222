package labshopmonolith.external;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class DecreasestockCommand {

    private Long qty;
}