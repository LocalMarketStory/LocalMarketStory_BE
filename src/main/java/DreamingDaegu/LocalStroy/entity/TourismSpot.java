package DreamingDaegu.LocalStroy.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class TourismSpot {

    @Id
    @Column(name = "tourism_spot_id")
    private Long id;
    private String name;
    private String district;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String latitude;
    private String longitude;
    private String address;
    @OneToMany(mappedBy = "tourismSpot")
    private List<MarketTourismSpot> marketTourismSpots;
    @OneToMany(mappedBy = "tourismSpot")
    private List<TourismSpotPicture> tourismSpotPictures;
}
