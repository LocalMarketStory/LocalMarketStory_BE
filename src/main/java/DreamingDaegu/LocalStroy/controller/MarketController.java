package DreamingDaegu.LocalStroy.controller;


import DreamingDaegu.LocalStroy.dto.FindMarketDetailInfoDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/markets")
@RequiredArgsConstructor
public class MarketController {

    private final MarketService marketService;

    @GetMapping("/detail/{id}")
    public FindMarketDetailInfoDto getMarket(@PathVariable Long id) {
        return marketService.findMarketDetailInfoById(id);
    }

    @GetMapping("near-by-tourism-spot")
    public FindMarketsByTourismSpotResponseDto getMarketsByTourismSpot(@Param("id") Long id) {
        return marketService.getMarketsByTourismSpot(id);
    }
}
