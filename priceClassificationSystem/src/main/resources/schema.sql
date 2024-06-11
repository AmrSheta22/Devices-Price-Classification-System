CREATE TABLE IF NOT EXISTS devices (
    id INT NOT NULL AUTO_INCREMENT,
    battery_power INT,
    blue BOOLEAN,
    clock_speed FLOAT,
    dual_sim BOOLEAN,
    fc INT,
    four_g BOOLEAN,
    int_memory INT,
    m_dep FLOAT,
    mobile_wt INT,
    n_cores INT,
    pc INT,
    px_height INT,
    px_width INT,
    ram INT,
    sc_h INT,
    sc_w INT,
    talk_time INT,
    three_g BOOLEAN,
    touch_screen BOOLEAN,
    wifi BOOLEAN,
    price_range INT,
    PRIMARY KEY (id)
);
--! import data from csv
INSERT INTO devices (battery_power, blue, clock_speed, dual_sim, fc, four_g, int_memory, m_dep, mobile_wt, n_cores, pc, px_height, px_width, ram, sc_h, sc_w, talk_time, three_g, touch_screen, wifi, price_range)
SELECT 
    CAST(battery_power AS INT),
    CAST(blue AS BOOLEAN),
    clock_speed,
    CAST(dual_sim AS BOOLEAN),
    CAST(fc AS INT),
    CAST(four_g AS BOOLEAN),
    CAST(int_memory AS INT),
    m_dep,
    CAST(mobile_wt AS INT),
    CAST(n_cores AS INT),
    CAST(pc AS INT),
    CAST(px_height AS INT),
    CAST(px_width AS INT),
    CAST(ram AS INT),
    CAST(sc_h AS INT),
    CAST(sc_w AS INT),
    CAST(talk_time AS INT),
    CAST(three_g AS BOOLEAN),
    CAST(touch_screen AS BOOLEAN),
    CAST(wifi AS BOOLEAN),
    CAST(price_range AS INT)
FROM CSVREAD('D:\repos\device-price\train.csv', NULL, 'charset=UTF-8 fieldSeparator=,');
