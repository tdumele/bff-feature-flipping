package fr.tdumele.feature_flipping.api.mapper;

import fr.tdumele.feature_flipping.api.vo.GetFeatureResponse;
import fr.tdumele.feature_flipping.domain.bo.Feature;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FeatureAPIMapper {

    GetFeatureResponse toGetFeatureResponse(Feature feature);
}
