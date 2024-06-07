package fr.tdumele.feature_flipping.domain.service;

import fr.tdumele.feature_flipping.domain.bo.Feature;
import fr.tdumele.feature_flipping.infrastructure.repository.FeatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final FeatureRepository featureRepository;

    public FeatureService(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    public List<Feature> getFeatures() {
        return featureRepository.getFeatures();
    }
}
