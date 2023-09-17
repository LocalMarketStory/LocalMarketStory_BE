package DreamingDaegu.LocalStroy.service;

import DreamingDaegu.LocalStroy.dto.FindAllTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindDetailTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;

import java.util.List;

public interface TourismSpotService {
    List<FindAllTourismSpotResponseDto> findAll();

    FindDetailTourismSpotResponseDto findDetailInfo(Long id);
}
