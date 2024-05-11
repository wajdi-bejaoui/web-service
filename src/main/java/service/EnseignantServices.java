package service;

import entity.Enseignant;

public interface EnseignantServices {
    void AddEnseignant(Enseignant enseignant);

    Enseignant getEnseignantById(long enseignantId);

    void updateEnseignant(Enseignant enseignant);

    void deleteEnseignant(long enseignantId);
}
