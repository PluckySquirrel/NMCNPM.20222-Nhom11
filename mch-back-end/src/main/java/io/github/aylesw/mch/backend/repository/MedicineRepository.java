package io.github.aylesw.mch.backend.repository;

import io.github.aylesw.mch.backend.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    boolean existsByName(String name);

    Medicine findByName(String name);
}
