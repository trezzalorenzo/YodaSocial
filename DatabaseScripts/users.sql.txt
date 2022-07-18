CREATE TABLE YodaSocial.Users (
	id BIGINT UNSIGNED auto_increment NOT NULL,
	name varchar(100) NULL,
	nickname varchar(100) NOT NULL,
	birthDate DATE NOT NULL,
	isPremium BOOL DEFAULT False NOT NULL,
	CONSTRAINT Users_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;
