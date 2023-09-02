package vacanspot.vacanspotlocationserver.domain.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vacanspot.vacanspotlocationserver.domain.location.dto.request.KakaoLocationRequest;
import vacanspot.vacanspotlocationserver.domain.location.dto.response.KakaoLocationResponse;

@SpringBootTest
class LocationServiceTest {

    @Autowired
    private LocationService locationService;

    @Test
    public void test() {
        KakaoLocationRequest kakaoLocationRequest = new KakaoLocationRequest(
                "127.423084873712",
                "37.0789561558879",
                "WGS84"
        );
        KakaoLocationResponse kakaoLocation = locationService.getKakaoLocation(kakaoLocationRequest);

        System.out.println(kakaoLocation);
    }

}