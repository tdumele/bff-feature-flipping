package fr.tdumele.feature_flipping.infrastructure.dao;

import fr.tdumele.feature_flipping.infrastructure.entity.FeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureDao extends JpaRepository<FeatureEntity, Long>{

}
