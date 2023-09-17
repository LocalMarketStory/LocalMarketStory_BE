package DreamingDaegu.LocalStroy.repository;

import DreamingDaegu.LocalStroy.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {

    List<Market> findAllBydistrict(String district);
}
