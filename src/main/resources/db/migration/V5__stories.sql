CREATE TABLE stories (
   id BIGINT PRIMARY KEY,
   character_id BIGINT,
   name VARCHAR(255) NOT NULL,
   description VARCHAR(750),
   CONSTRAINT fk_character
      FOREIGN KEY(character_id)
	  REFERENCES characters(id)
	  ON DELETE SET NULL
);

INSERT INTO stories (id, character_id, name, description) VALUES
    (1, 1, 'Avengers (1998) #81', 'The Wrecking Crew is down, but not their secret sponsor, the malicious Morgan Le Fay! She can destroy England if she kills Captain Britain, but which one?'),
    (2, 2, 'Avengers (1998) #81', 'The Wrecking Crew is down, but not their secret sponsor, the malicious Morgan Le Fay! She can destroy England if she kills Captain Britain, but which one?'),
    (3, 3, 'Avengers (1998) #81', 'The Wrecking Crew is down, but not their secret sponsor, the malicious Morgan Le Fay! She can destroy England if she kills Captain Britain, but which one?');