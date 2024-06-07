package fr.tdumele.feature_flipping.infrastructure.mapper;

import fr.tdumele.feature_flipping.domain.bo.Feature;
import fr.tdumele.feature_flipping.infrastructure.entity.FeatureEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FeatureMapper {

    Feature toFeature(FeatureEntity entity);
}
