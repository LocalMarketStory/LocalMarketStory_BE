package DreamingDaegu.LocalStroy.controller;

import DreamingDaegu.LocalStroy.dto.FindAllTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindDetailTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.dto.FindMarketsByTourismSpotResponseDto;
import DreamingDaegu.LocalStroy.service.TourismSpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tourism-spots")
public class TourismSpotController {

    public final TourismSpotService tourismSpotService;

    @GetMapping
    public List<FindAllTourismSpotResponseDto> findAll() {
        return tourismSpotService.findAll();
    }

    @GetMapping("{id}")
    public FindDetailTourismSpotResponseDto findDetailInfo(@PathVariable Long id) {
        return tourismSpotService.findDetailInfo(id);
    }
}
