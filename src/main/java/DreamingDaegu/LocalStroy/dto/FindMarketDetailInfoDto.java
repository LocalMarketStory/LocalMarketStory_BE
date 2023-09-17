package DreamingDaegu.LocalStroy.dto;

import DreamingDaegu.LocalStroy.entity.Market;
import DreamingDaegu.LocalStroy.entity.MarketVideo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
public class FindMarketDetailInfoDto {

    private String name;
    private String description;
    private String address;
    private List<String> videos;

    public FindMarketDetailInfoDto(Market market) {
        this.name = market.getName();
        this.description = market.getDescription();
        this.address = market.getAddress();
        this.videos =  market.getMarketVideos().stream()
                .map(MarketVideo::getUrl)
                .toList();
    }
}
