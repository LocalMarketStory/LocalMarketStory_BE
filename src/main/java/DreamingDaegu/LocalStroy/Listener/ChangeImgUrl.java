package DreamingDaegu.LocalStroy.Listener;

import DreamingDaegu.LocalStroy.entity.TourismSpotPicture;
import DreamingDaegu.LocalStroy.repository.TourismSpotPictureRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class ChangeImgUrl implements ApplicationListener<ContextRefreshedEvent> {

    private final TourismSpotPictureRepository tourismSpotPictureRepository;

    @Value("${accessIp}")
    private String ip;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("관광지 이미지 주소 변경 시작");
        List<TourismSpotPicture> findTourismSpotPicture = tourismSpotPictureRepository.findAll();
        for (TourismSpotPicture tourismSpotPicture : findTourismSpotPicture) {
            String path = tourismSpotPicture.getUrl();
            tourismSpotPicture.changeUrl("http://" + ip + path);
        }
//
//        Path path = Paths.get(imgFolder);
//        List<TourismSpotPicture> findTourismSpotPicture = tourismSpotPictureRepository.findAll();
//        for (TourismSpotPicture tourismSpotPicture : findTourismSpotPicture) {
//            tourismSpotPicture.changeUrl(String.valueOf(path.resolve(tourismSpotPicture.getUrl())));
//        }


        log.info("관광지 이미지 주소 변경 완료");
    }
}
