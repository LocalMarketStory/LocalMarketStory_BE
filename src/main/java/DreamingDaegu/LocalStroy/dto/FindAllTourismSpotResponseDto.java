package DreamingDaegu.LocalStroy.dto;

import DreamingDaegu.LocalStroy.entity.TourismSpot;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAllTourismSpotResponseDto {

    private String name;
    private String district;
    private String description;
    private String latitude;
    private String longitude;
    private String address;

    public FindAllTourismSpotResponseDto(TourismSpot tourismSpot) {
        this.name = tourismSpot.getName();
        this.district = tourismSpot.getDistrict();
        this.description = tourismSpot.getDescription();
        this.latitude = tourismSpot.getLatitude();
        this.longitude = tourismSpot.getLongitude();
        this.address = tourismSpot.getAddress();
    }
}
