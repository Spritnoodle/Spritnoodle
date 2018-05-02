create table hibernate_sequence (
	next_val bigint
) engine=InnoDB;

insert into hibernate_sequence values (
	 1 
);

create table T_MESSAGE (
	ID bigint not null,
	DATECREATED datetime,
	DATEMODIFED datetime,
	DELETED bit,
	ENTITY_NAME varchar(255),
	AUTHOR varchar(255),
	COMMENTER varchar(255),
	DATE datetime,
	MESSAGE varchar(255),
	primary key (ID)
) engine=InnoDB;

