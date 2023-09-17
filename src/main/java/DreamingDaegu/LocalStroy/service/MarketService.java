package DreamingDaegu.LocalStroy.service;

import DreamingDaegu.LocalStroy.dto.FindMarketDetailInfoDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.entity.Market;

import java.util.List;

public interface MarketService {
    List<Market> findAllByDistrict(String district);

    List<Market> findAll();

    FindMarketDetailInfoDto findMarketDetailInfoById(Long id);

    FindMarketsByTourismSpotResponseDto getMarketsByTourismSpot(Long id);
}
