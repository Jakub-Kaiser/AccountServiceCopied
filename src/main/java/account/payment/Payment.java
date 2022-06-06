package account.payment;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.YearMonth;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue
    private BigInteger id;
    private String employee;
    private YearMonth period;
    private Long salary;
}
