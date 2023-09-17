package DreamingDaegu.LocalStroy.dto;

import DreamingDaegu.LocalStroy.entity.TourismSpot;
import DreamingDaegu.LocalStroy.entity.TourismSpotPicture;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FindDetailTourismSpotResponseDto {
    private String name;
    private String address;
    private List<String> imgUrls;

    public FindDetailTourismSpotResponseDto(TourismSpot tourismSpot){
        this.name = tourismSpot.getName();
        this.address = tourismSpot.getAddress();
        this.imgUrls = tourismSpot.getTourismSpotPictures().stream()
                .map(TourismSpotPicture::getUrl)
                .toList();
    }
}
