package DreamingDaegu.LocalStroy.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Market {

    @Id
    @Column(name = "market_id")
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String latitude;
    private String longitude;
    private String address;
    private String district;
    @OneToMany(mappedBy = "market")
    private List<MarketVideo> marketVideos;
    @OneToMany(mappedBy = "market")
    private List<MarketTourismSpot> marketTourismSpots;
}
