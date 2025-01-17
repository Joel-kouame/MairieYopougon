CREATE TABLE parents (
    id INT8 PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100) NOT NULL,
    date_naissance DATE NOT NULL,
    lieu_naissance VARCHAR(100) NOT NULL,
    nationalite VARCHAR(50) NOT NULL,
    profession VARCHAR(100),
    adresse VARCHAR(255),
    created_at TIMESTAMP,
    create_by VARCHAR(255),
    updated_at TIMESTAMP,
    update_by VARCHAR(255)
);
CREATE SEQUENCE parents_id_SEQ INCREMENT BY 50 START 1;
ALTER TABLE parents
    ALTER COLUMN id SET DEFAULT nextval('parents_id_SEQ');
