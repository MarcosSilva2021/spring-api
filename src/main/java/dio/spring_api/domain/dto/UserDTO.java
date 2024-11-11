package dio.spring_api.domain.dto;

import java.awt.*;

public record UserDTO (
    Long id,
    String name,
    AccountDTO account,
    CardDTO card,
    List<FeatureDTO> features,
    List<NewsDTO> news) {
}
