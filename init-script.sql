CREATE DATABASE IF NOT EXISTS projectone;

-- create the users for each database
CREATE USER 'gokul'@'%' IDENTIFIED BY 'somepassword';
GRANT CREATE, ALTER, INDEX, LOCK TABLES, REFERENCES, UPDATE, DELETE, DROP, SELECT, INSERT ON `projectone`.* TO 'projectoneuser'@'%';

FLUSH PRIVILEGES;