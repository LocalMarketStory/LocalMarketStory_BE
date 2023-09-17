package DreamingDaegu.LocalStroy.dto;

import DreamingDaegu.LocalStroy.entity.TourismSpot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Data
public class FindMarketsByTourismSpotResponseDto {

    private String tourismSpotName;
    private String latitude;
    private String longitude;
    private List<simpleMarketInfo> markets;

    @AllArgsConstructor
    @Getter
    @Setter
    private class simpleMarketInfo {
        private String name;
        private String latitude;
        private String longitude;
    }

    public FindMarketsByTourismSpotResponseDto(TourismSpot tourismSpot) {
        this.tourismSpotName = tourismSpot.getName();
        this.latitude = tourismSpot.getLatitude();
        this.longitude = tourismSpot.getLongitude();
        this.markets = tourismSpot.getMarketTourismSpots().stream()
                .map(marketTourismSpot -> new simpleMarketInfo(
                        marketTourismSpot.getMarket().getName(),
                        marketTourismSpot.getMarket().getLatitude(),
                        marketTourismSpot.getMarket().getLongitude()
                ))
                .toList();
    }
}
