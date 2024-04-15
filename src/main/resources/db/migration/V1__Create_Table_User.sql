CREATE TABLE IF NOT EXISTS users (
    username INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    roles VARCHAR(255),
    date DATE
);
