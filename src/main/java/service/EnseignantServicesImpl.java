package service;

import entity.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.EnseignantRepository;

@Service
public class EnseignantServicesImpl implements EnseignantServices {

	 @Autowired
	 EnseignantRepository enseignantRepository;
	
	
	@Override
	public Enseignant getEnseignantById(long enseignantId) {
		
		Enseignant obj = enseignantRepository.findByEnseignantId(enseignantId);
		return obj;
		
	}

	@Override
	public void AddEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
	}

	@Override
	public void updateEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);

	}

	@Override
	public void deleteEnseignant(long enseignantId) {
		enseignantRepository.deleteById(enseignantId);

	}
	
}
