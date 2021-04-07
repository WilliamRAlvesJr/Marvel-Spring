CREATE TABLE comics (
   id BIGINT PRIMARY KEY,
   character_id BIGINT,
   name VARCHAR(255) NOT NULL,
   issue_number BIGINT,
   modified timestamp(6) NOT NULL,
   CONSTRAINT fk_character
      FOREIGN KEY(character_id)
	  REFERENCES characters(id)
	  ON DELETE SET NULL
);

INSERT INTO comics(id, character_id, name, issue_number, modified) VALUES
    (1, 1, 'Captain America (2018) #28', 28, '2020-12-05T09:03:59-0500'),
    (2, 1, 'CAPTAIN AMERICA ANNIVERSARY TRIBUTE 1 (2021) #1', 1, '2020-12-05T09:04:01-0500'),
    (3, 1, 'King In Black: Captain America (2021) #1', 1, '2021-02-23T13:14:28-0500'),
    (4, 2, 'Iron Man (2020) #7', 7, '2020-04-30T09:15:11-0400'),
    (5, 2, 'Aero (2019) #12', 12, '2021-01-20T18:37:17-0500'),
    (6, 2, 'Iron Man (2020) #5', 5, '2020-11-05T09:06:05-0500'),
    (7, 3, 'Thor (2020) #13', 13, '2020-12-05T09:08:39-0500'),
    (8, 3, 'Thor & Loki: Double Trouble (2021) #1', 1, '2020-12-26T09:07:09-0500');