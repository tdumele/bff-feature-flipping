package fr.tdumele.feature_flipping.api.controller;

import fr.tdumele.feature_flipping.api.mapper.FeatureAPIMapper;
import fr.tdumele.feature_flipping.api.vo.GetFeatureResponse;
import fr.tdumele.feature_flipping.domain.service.FeatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/features")
public class FeatureController {

    private final FeatureService featureService;
    private final FeatureAPIMapper featureAPIMapper;

    public FeatureController(FeatureService featureService, FeatureAPIMapper featureAPIMapper) {
        this.featureService = featureService;
        this.featureAPIMapper = featureAPIMapper;
    }

    @GetMapping
    public ResponseEntity<List<GetFeatureResponse>> getFeatures() {
        var features = featureService.getFeatures();
        var response = features.stream().map(featureAPIMapper::toGetFeatureResponse).toList();
        return ResponseEntity.ok(response);
    }

}
