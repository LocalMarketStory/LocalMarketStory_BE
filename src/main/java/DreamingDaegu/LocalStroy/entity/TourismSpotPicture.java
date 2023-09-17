package DreamingDaegu.LocalStroy.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TourismSpotPicture {

    @Id
    @Column(name = "tourism_spot_picture_id")
    private Long id;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tourism_spot_id")
    private TourismSpot tourismSpot;

    public TourismSpotPicture(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public void changeUrl(String url) {
        this.url = url;
    }
}
