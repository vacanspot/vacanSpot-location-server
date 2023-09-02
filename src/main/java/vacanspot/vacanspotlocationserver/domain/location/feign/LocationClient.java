package vacanspot.vacanspotlocationserver.domain.location.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import vacanspot.vacanspotlocationserver.domain.location.dto.response.KakaoLocationResponse;

@FeignClient(name="kakaoLocation", url = "https://dapi.kakao.com")
public interface LocationClient {
    @GetMapping("/v2/local/geo/coord2address.json")
    KakaoLocationResponse getKakaoLocationResponse(
            @RequestHeader("Authorization") String authorization,
            @RequestParam("x") String x,
            @RequestParam("y") String y,
            @RequestParam("input_coord") String inputCoordinate
    );


}
