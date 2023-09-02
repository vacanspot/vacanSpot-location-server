package vacanspot.vacanspotlocationserver.domain.location.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vacanspot.vacanspotlocationserver.domain.location.LocationService;
import vacanspot.vacanspotlocationserver.domain.location.dto.request.KakaoLocationRequest;

@RestController
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;
    @GetMapping("/location")
    public ResponseEntity<String> getLocationKeyword(
            @RequestParam("x") String x,
            @RequestParam("y") String y
    ) {
        return ResponseEntity.ok(
                locationService.getLocationKeyword(
                        KakaoLocationRequest.of(x, y)
                ));
    }

}
