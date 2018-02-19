DROP TABLE IF EXISTS stock;
CREATE TABLE stock (
    id INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    sku_code VARCHAR(255) NOT NULL,
    item_name VARCHAR(255) NOT NULL,
    delivery_code VARCHAR(255),
    stock_count INT(11) NOT NULL,
    shipping_status VARCHAR(255) NOT NULL
);