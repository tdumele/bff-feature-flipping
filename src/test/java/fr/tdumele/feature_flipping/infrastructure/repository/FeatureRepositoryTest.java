package fr.tdumele.feature_flipping.infrastructure.repository;

import fr.tdumele.feature_flipping.domain.bo.Feature;
import fr.tdumele.feature_flipping.infrastructure.dao.FeatureDao;
import fr.tdumele.feature_flipping.infrastructure.entity.FeatureEntity;
import fr.tdumele.feature_flipping.infrastructure.mapper.FeatureMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FeatureRepositoryTest {

    @Mock
    private FeatureDao featureDao;

    @Mock
    private FeatureMapper featureMapper;

    @InjectMocks
    private FeatureRepository featureRepository;

    @Test
    @DisplayName("getFeatures returns all features when dao has features")
    void getFeaturesReturnsAllFeaturesWhenDaoHasFeatures() {
        // Given
        FeatureEntity featureEntity = new FeatureEntity(); // Assume FeatureEntity is a POJO with some fields
        Feature feature = new Feature(); // Assume Feature is a POJO with some fields
        when(featureDao.findAll()).thenReturn(Collections.singletonList(featureEntity));
        when(featureMapper.toFeature(featureEntity)).thenReturn(feature);

        // When
        List<Feature> actualFeatures = featureRepository.getFeatures();

        // Then
        assertEquals(Collections.singletonList(feature), actualFeatures);
    }

    @Test
    @DisplayName("getFeatures returns empty list when dao has no features")
    void getFeaturesReturnsEmptyListWhenDaoHasNoFeatures() {
        // Given
        when(featureDao.findAll()).thenReturn(Collections.emptyList());

        // When
        List<Feature> actualFeatures = featureRepository.getFeatures();

        // Then
        assertEquals(Collections.emptyList(), actualFeatures);
    }
}