package DreamingDaegu.LocalStroy.repository;

import DreamingDaegu.LocalStroy.entity.TourismSpotPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourismSpotPictureRepository extends JpaRepository<TourismSpotPicture, Long> {
}
