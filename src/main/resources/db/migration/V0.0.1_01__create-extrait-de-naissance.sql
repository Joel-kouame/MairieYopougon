CREATE TABLE extrait_naissance (
    id INT8 PRIMARY KEY,
    numero_extrait VARCHAR(50) UNIQUE NOT NULL,
    nom_enfant VARCHAR(100) NOT NULL,
    prenom_enfant VARCHAR(100) NOT NULL,
    date_naissance DATE NOT NULL,
    heure_naissance TIME NOT NULL,
    lieu_naissance VARCHAR(100) NOT NULL,
    sexe VARCHAR(100) NOT NULL,
    parent_id INT8,
    date_declaration DATE NOT NULL,
    created_at TIMESTAMP,
    create_by VARCHAR(255),
    updated_at TIMESTAMP,
    update_by VARCHAR(255)
);
CREATE SEQUENCE extrait_naissance_id_SEQ INCREMENT BY 50 START 1;
ALTER TABLE extrait_naissance
    ALTER COLUMN id SET DEFAULT nextval('extrait_naissance_id_SEQ');