CREATE DATABASE childguard;
USE childguard;

CREATE TABLE reports (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  location VARCHAR(255),
  description TEXT,
  status VARCHAR(50),
  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50)
);
INSERT INTO users(username, password) VALUES ('admin', 'admin');
