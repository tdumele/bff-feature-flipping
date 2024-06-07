package fr.tdumele.feature_flipping.domain.service;

import fr.tdumele.feature_flipping.domain.bo.Feature;
import fr.tdumele.feature_flipping.infrastructure.repository.FeatureRepository;
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
class FeatureServiceTest {

    @Mock
    private FeatureRepository featureRepository;

    @InjectMocks
    private FeatureService featureService;

    @Test
    @DisplayName("getFeatures returns all features when repository has features")
    void getFeaturesReturnsAllFeaturesWhenRepositoryHasFeatures() {
        // Given
        Feature feature = new Feature();
        List<Feature> expectedFeatures = Collections.singletonList(feature);
        when(featureRepository.getFeatures()).thenReturn(expectedFeatures);

        // When
        List<Feature> actualFeatures = featureService.getFeatures();

        // Then
        assertEquals(expectedFeatures, actualFeatures);
    }

    @Test
    @DisplayName("getFeatures returns empty list when repository has no features")
    void getFeaturesReturnsEmptyListWhenRepositoryHasNoFeatures() {
        // Given
        when(featureRepository.getFeatures()).thenReturn(Collections.emptyList());

        // When
        List<Feature> actualFeatures = featureService.getFeatures();

        // Then
        assertEquals(Collections.emptyList(), actualFeatures);
    }
}