INSERT INTO extrait_naissance (id, numero_extrait, nom_enfant, prenom_enfant, date_naissance, heure_naissance, lieu_naissance, sexe, parent_id, date_declaration, created_at, create_by, updated_at, update_by)
VALUES
    (nextval('extrait_naissance_id_SEQ'), 'EX123456', 'Dupont', 'Marie', '2020-01-15', '10:30:00', 'Paris', 'Féminin', 1, '2020-01-16', now(), 'JDD', now(), 'JDD'),
    (nextval('extrait_naissance_id_SEQ'), 'EX123457', 'Martin', 'Lucas', '2019-05-20', '14:45:00', 'Lyon', 'Masculin', 51, '2019-05-21', now(), 'JDD', now(), 'JDD'),
    (nextval('extrait_naissance_id_SEQ'), 'EX123458', 'Nguyen', 'Emma', '2018-08-10', '09:15:00', 'Marseille', 'Féminin', 101, '2018-08-11', now(), 'JDD', now(), 'JDD');
