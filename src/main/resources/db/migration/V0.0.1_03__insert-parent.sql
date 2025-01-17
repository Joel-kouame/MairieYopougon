INSERT INTO parents (id, nom, prenom, date_naissance, lieu_naissance, nationalite, profession, adresse, created_at, create_by, updated_at, update_by)
VALUES
    (nextval('parents_id_SEQ'), 'Dupont', 'Jean', '1975-05-20', 'Paris', 'Française', 'Ingénieur', '123 Rue de la République, Paris', NOW(), 'jdd', NOW(), 'jdd'),
    (nextval('parents_id_SEQ'), 'Martin', 'Sophie', '1980-08-15', 'Lyon', 'Française', 'Médecin', '456 Avenue des Champs-Élysées, Lyon', NOW(), 'jdd', NOW(), 'jdd'),
    (nextval('parents_id_SEQ'), 'Nguyen', 'Thierry', '1965-12-10', 'Marseille', 'Française', 'Professeur', '789 Boulevard de la Liberté, Marseille', NOW(), 'jdd', NOW(), 'jdd');
