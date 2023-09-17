package DreamingDaegu.LocalStroy.service.impl;

import DreamingDaegu.LocalStroy.dto.FindMarketDetailInfoDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.entity.Market;
import DreamingDaegu.LocalStroy.entity.TourismSpot;
import DreamingDaegu.LocalStroy.repository.MarketRepository;
import DreamingDaegu.LocalStroy.repository.TourismSpotRepository;
import DreamingDaegu.LocalStroy.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MarketServiceImpl implements MarketService {

    private final MarketRepository marketRepository;
    private final TourismSpotRepository tourismSpotRepository;

    @Override
    public List<Market> findAllByDistrict(String district) {
        return marketRepository.findAllBydistrict(district);
    }

    public List<Market> findAll() {
        return marketRepository.findAll();
    }

    @Override
    public FindMarketDetailInfoDto findMarketDetailInfoById(Long id) {
        Market findMarket = marketRepository.findById(id).orElseThrow(() -> new NoSuchElementException("ID가 " + id + "인 시장이 존재하지 않습니다."));
        return new FindMarketDetailInfoDto(findMarket);
    }

    @Override
    public FindMarketsByTourismSpotResponseDto getMarketsByTourismSpot(Long id) {
        TourismSpot findTourismSpot = tourismSpotRepository.findById(id).orElseThrow(() -> new NoSuchElementException("ID가 " + id + "인 관광지가 존재하지 않습니다."));
        return new FindMarketsByTourismSpotResponseDto(findTourismSpot);
    }
}
