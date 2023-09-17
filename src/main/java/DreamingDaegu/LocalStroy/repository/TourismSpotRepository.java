package DreamingDaegu.LocalStroy.repository;

import DreamingDaegu.LocalStroy.entity.TourismSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourismSpotRepository extends JpaRepository<TourismSpot, Long> {

    Optional<TourismSpot> findById(Long id);
}
