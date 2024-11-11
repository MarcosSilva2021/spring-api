package dio.spring_api.domain.dto;

public record NewsDTO(Long id, String icon, String description) {
    // foi realizado online - favor sincronizar com o repositorio Local

    public NewsDTO(News model){
        
    }
}
