package vacanspot.vacanspotlocationserver.domain.location.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class KakaoLocationResponse {
    private Meta meta;
    private List<Document> documents;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Meta {
        private Integer totalCount;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Document {
        private Address address;
        private RoadAddress roadAddress;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Address {
        private String addressName;
        @JsonProperty("region_1depth_name")
        private String region1depthName;
        @JsonProperty("region_2depth_name")
        private String region2depthName;
        @JsonProperty("region_3depth_name")
        private String region3depthName;
        private String mountainYn;
        private String mainAddressNo;
        private String subAddressNo;

    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class RoadAddress {
        private String addressName;
        @JsonProperty("region_1depth_name")
        private String region1depthName;
        @JsonProperty("region_2depth_name")
        private String region2depthName;
        @JsonProperty("region_3depth_name")
        private String region3depthName;
        private String roadName;
        private String undergroundYn;
        private String mainBuildingNo;
        private String subBuildingNo;
        private String buildingName;
        private String zoneNo;
    }


}
