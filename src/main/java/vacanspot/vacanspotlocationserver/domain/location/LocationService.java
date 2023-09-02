package vacanspot.vacanspotlocationserver.domain.location;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vacanspot.vacanspotlocationserver.domain.location.dto.request.KakaoLocationRequest;
import vacanspot.vacanspotlocationserver.domain.location.dto.response.KakaoLocationResponse;
import vacanspot.vacanspotlocationserver.domain.location.feign.LocationClient;

@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationClient locationClient;

    public KakaoLocationResponse getKakaoLocation (
            final KakaoLocationRequest kakaoLocationRequest
    ) {
        return locationClient.getKakaoLocationResponse(
                "KakaoAK 054d2946ed830d1aaefa4b0c41bc058f",
                kakaoLocationRequest.getLocationX(),
                kakaoLocationRequest.getLocationY(),
                "WGS84"
        );
    }

    public String getLocationKeyword(
            final KakaoLocationRequest kakaoLocationRequest
    ) {
        return getKakaoLocation(kakaoLocationRequest)
                .getDocuments()
                .stream()
                .findFirst()
                .orElseThrow()
                .getAddress()
                .getRegion3depthName();
    }

}
