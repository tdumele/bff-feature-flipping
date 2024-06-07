package fr.tdumele.feature_flipping.infrastructure.repository;

import fr.tdumele.feature_flipping.domain.bo.Feature;
import fr.tdumele.feature_flipping.infrastructure.dao.FeatureDao;
import fr.tdumele.feature_flipping.infrastructure.mapper.FeatureMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FeatureRepository {

    private final FeatureDao featureDao;
    private final FeatureMapper featureMapper;

    FeatureRepository(FeatureDao featureDao, FeatureMapper featureMapper) {
        this.featureDao = featureDao;
        this.featureMapper = featureMapper;
    }

    public List<Feature> getFeatures() {
        var entities = featureDao.findAll();
        return entities.stream().map(featureMapper::toFeature).toList();
    }
}
