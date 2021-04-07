CREATE TABLE series (
   id BIGINT PRIMARY KEY,
   character_id BIGINT,
   name VARCHAR(255) NOT NULL,
   description VARCHAR(750),
   CONSTRAINT fk_character
      FOREIGN KEY(character_id)
	  REFERENCES characters(id)
	  ON DELETE SET NULL
);

INSERT INTO series (id, character_id, name, description) VALUES
    (1, 1, 'A-Next (1998 - 1999)', NULL),
    (2, 1, 'Age of X: Universe (2011)', NULL),
    (3, 2, 'Amazing Spider-Man (1999 - 2013)', 'Looking for the one superhero comic you just have to read? You''ve found it! <i>Amazing Spider-Man</i> is the cornerstone of the Marvel Universe. This is where you''ll find all the big-time action, major storylines and iconic Spider-Man magic you''d come to expect from the Wall-Crawler.'),
    (4, 2, 'Adam: Legend of the Blue Marvel (2008)', NULL),
    (5, 3, 'A+X (2012 - 2014)', 'Get ready for action-packed stories featuring team-ups from your favorite Marvel heroes every month! First, a story where Wolverine and Hulk come together, and then Captain America and Cable meet up! But will each partner''s combined strength be enough?');