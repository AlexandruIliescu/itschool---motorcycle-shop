CREATE TABLE IF NOT EXISTS products (
                                        id SERIAL PRIMARY KEY,
                                        brand VARCHAR(100),
                                        colour VARCHAR(100),
                                        price NUMERIC(10,2),
                                        weight INT,
                                        year_of_manufacture DATE
);