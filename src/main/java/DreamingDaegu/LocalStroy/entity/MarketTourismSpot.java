package DreamingDaegu.LocalStroy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
public class MarketTourismSpot {

    @Id
    @Column(name = "market_tourism_spot_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "market_id")
    private Market market;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "tourism_spot_id")
    private TourismSpot tourismSpot;
}
