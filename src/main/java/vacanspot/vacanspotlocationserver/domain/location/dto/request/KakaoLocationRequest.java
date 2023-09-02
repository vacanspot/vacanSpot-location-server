package vacanspot.vacanspotlocationserver.domain.location.dto.request;

import feign.Param;
import lombok.Builder;

@Builder
public record KakaoLocationRequest(
        String x,
        String y,
        String inputCoordinate

) {
    @Param("x")
    public String getLocationX() { return x; }
    @Param("y")
    public String getLocationY() { return y; }
    @Param("input_coord")
    public String getInputCoordinate() { return inputCoordinate; }

    public static KakaoLocationRequest of(
            final String x,
            final String y
    )  {
        return KakaoLocationRequest.builder()
                .x(x)
                .y(y)
                .build();
    }

}
