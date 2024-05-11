package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Enseignant;

@Repository
public interface EnseignantRepository extends JpaRepository <Enseignant, Long> {
	Enseignant findByEnseignantId(long enseignantId);
}
