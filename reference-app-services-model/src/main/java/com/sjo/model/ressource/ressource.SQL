

ALTER TABLE Agence DROP CONSTRAINT FK_Agence_MoyenDeTransport
;

ALTER TABLE MoyenDeTransport DROP CONSTRAINT FK_MoyenDeTransport_TypeMoyenTransport
;

ALTER TABLE OrganismeTransport DROP CONSTRAINT FK_OrganismeTransport_Agence
;


DROP TABLE Agence
;
DROP TABLE Equipement
;
DROP TABLE MoyenDeTransport
;
DROP TABLE OrganismeTransport
;
DROP TABLE TypeMoyenTransport
;

CREATE TABLE Agence ( 
	adresseAgence varchar(80) not null ,
	dateCreation date not null ,
	agenceID int   not null ,
	moyenDeTransportID int not null ,
	 constraint pk_agence primary key (agenceID)
) 

;
COMMENT ON TABLE Agence
    IS ''
;

CREATE TABLE Equipement ( 
	origineFabriquant varchar(80) not null ,
	refFabriquant varchar(80) not null ,
	numSerie varchar(80) not null ,
	equipementID int  not null
) 

;
COMMENT ON TABLE Equipement
    IS ''
;

CREATE TABLE MoyenDeTransport ( 
	immatriculation varchar(80) not null ,
	isDisponible varchar(80) not null ,
	chargeMax int not null ,
	kilometrage int not null ,
	chargeMin int not null ,
	moyenDeTransportID int  not null,
	typeMoyenTransportID int not null 
) 

;
COMMENT ON TABLE MoyenDeTransport
    IS ''
;

CREATE TABLE OrganismeTransport ( 
	designiation varchar(80) not null ,
	adresseOrganisme varchar(80) not null ,
	mailOrganisme varchar(80) not null ,
	organismeTransportID int not null,
	agenceID int not null 
) 

;
COMMENT ON TABLE OrganismeTransport
    IS ''
;

CREATE TABLE TypeMoyenTransport ( 
	chargeax int not null ,
	hauteur int not null ,
	largeur int not null ,
	intitule varchar(80) not null ,
	vitesseMaxVide int not null ,
	vitesseMaxCharge int not null ,
	typeMoyenTransportID int not null
) 

;
COMMENT ON TABLE TypeMoyenTransport
    IS ''
;


ALTER TABLE Agence ADD CONSTRAINT PK_Agence 
PRIMARY KEY (agenceID) 

;


ALTER TABLE Equipement ADD CONSTRAINT PK_Equipement 
PRIMARY KEY (equipementID) 

;


ALTER TABLE MoyenDeTransport ADD CONSTRAINT PK_MoyenDeTransport 
PRIMARY KEY (moyenDeTransportID) 

;


ALTER TABLE OrganismeTransport ADD CONSTRAINT PK_OrganismeTransport 
PRIMARY KEY (organismeTransportID) 

;


ALTER TABLE TypeMoyenTransport ADD CONSTRAINT PK_TypeMoyenTransport 
PRIMARY KEY (typeMoyenTransportID) 

;





ALTER TABLE Agence ADD CONSTRAINT FK_Agence_MoyenDeTransport 
FOREIGN KEY (moyenDeTransportID) REFERENCES MoyenDeTransport (moyenDeTransportID)
;

ALTER TABLE MoyenDeTransport ADD CONSTRAINT FK_MoyenDeTransport_TypeMoyenTransport 
FOREIGN KEY (typeMoyenTransportID) REFERENCES TypeMoyenTransport (typeMoyenTransportID)
;

ALTER TABLE OrganismeTransport ADD CONSTRAINT FK_OrganismeTransport_Agence 
FOREIGN KEY (agenceID) REFERENCES Agence (agenceID)
;









-- Executing query:
DROP TABLE IF EXISTS AD_USERS;
CREATE TABLE AD_USERS(
 USER_ID INTEGER PRIMARY KEY,
 USER_NAME VARCHAR (75),
 PASSWORD VARCHAR (75));
DROP TABLE IF EXISTS ROLES;
CREATE TABLE AD_ROLES(
 ROLE_ID INTEGER PRIMARY KEY,
 ROLE_NAME VARCHAR (20));
DROP TABLE IF EXISTS AD_USER_ROLES;
CREATE TABLE AD_USER_ROLES(
 USER_ID_FK INTEGER,
 ROLE_ID_FK INTEGER);
INSERT INTO AD_USERS
 VALUES(1,'admin','password');
INSERT INTO AD_USERS
 VALUES(2,'csr','password');
INSERT INTO AD_USERS
 VALUES(3,'guest',
 '{SSHA}zEWG/X8AzSdkHEFXE8pyCt0ddA321ktZz6bx1to9bFikZBS5wlAw3g==');
INSERT INTO AD_ROLES
 VALUES(1,'everyone');
INSERT INTO AD_ROLES
 VALUES(2,'csr');
INSERT INTO AD_ROLES
 VALUES(3,'administrator');
INSERT INTO AD_USER_ROLES
 VALUES(1,1);
INSERT INTO AD_USER_ROLES
 VALUES(1,2);
INSERT INTO AD_USER_ROLES
 VALUES(1,3);
INSERT INTO AD_USER_ROLES
 VALUES(2,1);
INSERT INTO AD_USER_ROLES
 VALUES(2,2);
INSERT INTO AD_USER_ROLES
 VALUES(3,1);