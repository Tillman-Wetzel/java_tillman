CREATE TABLE Users(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    emailAdress char(255) UNIQUE KEY,
    password char(255)
)