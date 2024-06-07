-- Description: This script is used to populate the database with test data.
DROP TABLE IF EXISTS FEATURE;

-- Create the FEATURE table
CREATE TABLE FEATURE (
    ID INT PRIMARY KEY,
    NAME VARCHAR(255),
    DESCRIPTION VARCHAR(255),
    ACTIVE BOOLEAN DEFAULT FALSE
);

-- Insert some test data
INSERT INTO FEATURE (ID, NAME, DESCRIPTION) VALUES (1, 'Feature 1', 'Feature 1 description');
INSERT INTO FEATURE (ID, NAME, DESCRIPTION) VALUES (2, 'Feature 2', 'Feature 2 description');
INSERT INTO FEATURE (ID, NAME, DESCRIPTION) VALUES (3, 'Feature 3', 'Feature 3 description');