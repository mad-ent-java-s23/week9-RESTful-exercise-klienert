DELETE FROM orders;
DELETE FROM user;
INSERT INTO user VALUES (1, 'Joe', 'Coyne', 'jcoyne', 'supersecret1', '1964-04-01'),(2, 'Fred', 'Hensen', 'fhensen', 'supersecret2', '1988-05-08'),(3, 'Barney', 'Curry', 'bcurry', 'supersecret3', '1947-11-11'),(4, 'Karen', 'Mack', 'kmack', 'supersecret4', '1986-07-08'),(5, 'Dianne', 'Klein', 'dklien', 'supersecret5', '1991-01-22' ),(6, 'Dawn', 'Tillman', 'dtillman', 'supersecret6', '1979-08-30');
INSERT INTO orders VALUES (1, 'Plates', 1),(2, 'Books', 2),(3, 'Plates, forks, and knives', 2),(4, 'Soccer Ball', 1),(5, 'Coffee, Oat Milk', 4),(6, 'Bananas', 1),(7, 'Coffee, cups, and creamer', 4);
