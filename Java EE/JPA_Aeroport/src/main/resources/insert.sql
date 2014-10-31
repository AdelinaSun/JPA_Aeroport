INSERT INTO Airport
	(AIRPORT_NAME) 
VALUES
    ('Харьков'),
	('Киев'),
	('Донецк');
	
INSERT INTO CONCRETE_RAYS
	(DATA, NAME, "FROM", "WHERE", PRICE_OF_TICKET, TYPE_OF_FLIGHT) 
VALUES
    ('12.03.2015', 'Киев-Харьков', 'Киев', 'Харьков', 600, '1, 2, 3'),
	('12.03.2015', 'Киев-Донецк', 'Киев', 'Донецк', 700, '1, 2, 3');
	
INSERT INTO Passenger
	(NAME_PASSENGER, SURNAME_PASSENGER, PATRONYMIC_PASSENGER, TEL_NUMBER_PASSENGER) 
VALUES
    ('Роксолана', 'Султана', 'Хюррем', '123456789'),
	('Михримах', 'Султана', 'Сулеймановна', '123378789');

INSERT INTO RAYS
	(NAME_RAYS, "FROM", "WHERE", PRICE_OF_TICKET, TYPE_OF_FLIGHT) 
VALUES
    ('Киев-Харьков', 'Киев', 'Харьков', 600.0, '1, 2, 3'),
	('Киев-Донецк', 'Киев', 'Донецк', 700.0, '1, 2, 3');

INSERT INTO Ticket
	(PASSENGER,TYPE_OF_FLIGHT, TICKET_PRICE, LUGGAGE, TYPE_OF_TICKET) 
VALUES
    (1, '3', 600.0, 10, 'Взрослый'),
	(2, '2', 700.0, 5, 'Детский');

INSERT INTO TYPE_OF_REYS
	(NAME_OF_TYPE, NUMBER_OF_SEATS) 
VALUES
    ('Люкс', 25),
	('Бюджет', 35);

