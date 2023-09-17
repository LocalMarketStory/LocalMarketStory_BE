package DreamingDaegu.LocalStroy.service.impl;

import DreamingDaegu.LocalStroy.dto.FindAllTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindDetailTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.entity.TourismSpot;
import DreamingDaegu.LocalStroy.repository.TourismSpotRepository;
import DreamingDaegu.LocalStroy.service.TourismSpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TourismSpotServiceImpl implements TourismSpotService {

    private final TourismSpotRepository tourismSpotRepository;

    @Override
    public List<FindAllTourismSpotResponseDto> findAll() {
        List<TourismSpot> tourismSpots = tourismSpotRepository.findAll();
        return tourismSpots.stream()
                .map(FindAllTourismSpotResponseDto::new)
                .toList();
    }

    @Override
    public FindDetailTourismSpotResponseDto findDetailInfo(Long id) {
        TourismSpot findTourismSpot = tourismSpotRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 관광지가 없습니다."));
        return new FindDetailTourismSpotResponseDto(findTourismSpot);
    }
}
