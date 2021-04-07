CREATE TABLE events (
   id BIGINT PRIMARY KEY,
   character_id BIGINT,
   name VARCHAR(255) NOT NULL,
   description VARCHAR(750) NOT NULL,
   CONSTRAINT fk_character
      FOREIGN KEY(character_id)
	  REFERENCES characters(id)
	  ON DELETE SET NULL
);

INSERT INTO events(id, character_id, name, description) VALUES
    (1, 1, 'Acts of Vengeance!', 'Loki sets about convincing the super-villains of Earth to attack heroes other than those they normally fight in an attempt to destroy the Avengers to absolve his guilt over inadvertently creating the team in the first place.'),
    (2, 1, 'Age of Ultron', 'In a 10-issue event written by Brian Michael Bendis with art by Bryan Hitch, Carlos Pacheco, Brandon Peterson and more, the heroes of the Marvel Universe have already fallen with the robot Ultron remaking the world in his image. The surviving Avengers, X-Men and others must fight through time and space in the hope of defeating their foe by any means necessary!'),
    (3, 1, 'Armor Wars', 'Tony Stark discovers that someone has been stealing his Iron Man tech and selling it to supervillains. He decides he must do whatever it takes to reacquire -- or destroy -- the stolen tech.'),
    (4, 2, 'Onslaught', 'The evil within Professor Charles Xavier combines with the power of Magneto to create Onslaught, perhaps the greatest threat ever to the Marvel Universe! It begins with the X-Men, but before the end, the Avengers, the Fantastic Four and the rest of Earth''s greatest heroes will know sacrifice before victory!'),
    (5, 2, 'Maximum Security', 'At a meeting of the Shi''Ar intergalactic council, after numerous races lodge complaints against humanity, it is decided that Earth will become a prison planet. Unfortunately, one of the prisoners sentenced to Earth is Ego the Living Planet, who proceeds to expand exponentially, threatening the entire planet. It is soon discovered that one of the complaining races, the Ruul, are the Kree, whose Supreme Intelligence evolved them using the Destiny Crystal and manipulated the council to destroy Earth''s heroes!'),
    (6, 3, 'Inhumanity', 'Following Infinity, the actions of Black Bolt have affected not only his people, but the entire Marvel Universe, as a new race of Inhumans rises up! Witness change for every major Marvel character, led by Inhuman, a new series from Matt Fraction and Joe Madureira!');