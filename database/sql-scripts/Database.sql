-- CREATE DATABASE ProjectDB;
-- USE ProjectDB;

 
CREATE TABLE vaccines (
    id                  SERIAL primary key,
    name                varchar(255) UNIQUE NOT NULL,
    doses_required      INTEGER,
    dose_intervals  	INTEGER,
    doses_received      INTEGER,
    doses_remaining     INTEGER
);

INSERT INTO vaccines (name, doses_required, dose_intervals, doses_received, doses_remaining) 
VALUES ('Pfizer/BioNTech', 2, 21, 100, 98),
       ('Johnson & Johnson', 1, null, 5000, 4998),
       ('Moderna', 2, 28, 1200, 1198),
       ('AstraZeneca', 2, 28, 900, 898),
       ('Covaxin', 2, 28, 800, 798),
       ('Sinovac', 2, 21, 750, 748),
       ('Sputnik V', 2, 21, 600, 598),
       ('Sinopharm', 2, 28, 500, 498),
       ('Novavax', 2, 21, 450, 448),
       ('CanSinoBIO', 1, null, 1000, 999),
       ('Covovax', 2, 28, 1200, 1198),
       ('EpiVacCorona', 2, 21, 700, 698),
       ('Janssen', 1, null, 1100, 1099),
       ('BBV152', 2, 28, 950, 948),
       ('ZyCoV-D', 2, 28, 1000, 998),
       ('RBD-Dimer', 2, 28, 300, 298),
       ('SCB-2019', 2, 21, 800, 798),
       ('Valneva', 2, 28, 600, 598),
       ('QazCovid-in', 2, 21, 900, 898),
       ('Abdala', 2, 28, 450, 448),
       ('Soberana 02', 2, 28, 350, 348),
       ('Nuvaxovid', 2, 21, 600, 598),
       ('VLA2001', 2, 28, 500, 498),
       ('Imvanex', 2, 28, 800, 798),
       ('INO-4800', 2, 21, 300, 298),
       ('MVC-COV1901', 2, 28, 900, 898),
       ('BioVac', 2, 21, 650, 648),
       ('CovIran Barekat', 2, 28, 800, 798),
       ('Razi Cov Pars', 2, 21, 500, 498),
       ('Turkovac', 2, 28, 400, 398),
       ('Corbevax', 2, 28, 500, 498),
       ('Soberana Plus', 2, 21, 300, 298),
       ('COVIran Razi', 2, 28, 200, 198),
       ('BBIBP-CorV', 2, 28, 1000, 998),
       ('Convidecia', 1, null, 600, 599),
       ('FINLAY-FR-1', 2, 28, 450, 448),
       ('FINLAY-FR-2', 2, 21, 400, 398),
       ('Zhifei Longcom', 3, 28, 500, 498),
       ('SpikoGen', 2, 28, 250, 248),
       ('CoviVac', 2, 21, 900, 898),
       ('Vaccine X', 2, 28, 100, 98),
       ('Vaccine Y', 2, 21, 200, 198),
       ('Vaccine Z', 2, 28, 300, 298);

CREATE TABLE patients (
    id                  SERIAL primary key,
    first_name          varchar(255) not null,
    last_name           varchar(255) not null,
    vaccine_id          INTEGER not null,
    dose1_date     		date,
    dose2_date   		date,
    FOREIGN KEY 		(vaccine_id) REFERENCES vaccines(id)
);

INSERT INTO patients (first_name, last_name, vaccine_id, dose1_date, dose2_date)
VALUES ('John', 'Doe', 1, '2021-02-18', '2021-03-11'),
       ('Alice', 'Smith', 2, '2021-01-15', '2021-02-12'),
       ('Bob', 'Johnson', 3, '2021-01-20', '2021-02-17'),
       ('Charlie', 'Brown', 4, '2021-02-01', '2021-02-22'),
       ('Diana', 'Miller', 5, '2021-02-05', '2021-02-26'),
       ('Eve', 'Williams', 6, '2021-03-01', '2021-03-29'),
       ('Frank', 'Jones', 7, '2021-03-10', '2021-03-31'),
       ('Grace', 'Garcia', 8, '2021-03-20', NULL),
       ('Hannah', 'Rodriguez', 9, '2021-04-01', '2021-04-29'),
       ('Isaac', 'Martinez', 10, '2021-04-15', '2021-05-06'),
       ('Jack', 'Davis', 11, '2021-04-22', NULL),
       ('Karen', 'Lopez', 12, '2021-05-01', '2021-05-29'),
       ('Leo', 'Wilson', 13, '2021-05-10', '2021-06-07'),
       ('Maya', 'Anderson', 14, '2021-06-01', '2021-06-29'),
       ('Noah', 'Thomas', 15, '2021-06-15', '2021-07-13'),
       ('Olivia', 'Jackson', 16, '2021-06-21', '2021-07-19'),
       ('Paul', 'White', 17, '2021-07-05', '2021-08-02'),
       ('Quincy', 'Harris', 18, '2021-07-20', '2021-08-17'),
       ('Riley', 'Young', 19, '2021-07-31', '2021-08-28'),
       ('Sophie', 'King', 20, '2021-08-10', '2021-09-07'),
       ('Tom', 'Wright', 21, '2021-08-25', '2021-09-22'),
       ('Uma', 'Green', 22, '2021-09-05', '2021-10-03'),
       ('Victor', 'Baker', 23, '2021-09-20', '2021-10-18'),
       ('Wendy', 'Scott', 24, '2021-10-01', '2021-10-29'),
       ('Xavier', 'Morgan', 25, '2021-10-15', '2021-11-12'),
       ('Yasmin', 'Rivera', 26, '2021-11-01', '2021-11-29'),
       ('Zara', 'Cooper', 27, '2021-11-10', '2021-12-08'),
       ('Adam', 'Gray', 28, '2021-12-01', '2021-12-29'),
       ('Bella', 'Ward', 29, '2021-12-10', '2022-01-07'),
       ('Caleb', 'Walker', 30, '2021-12-20', '2022-01-17'),
       ('Derek', 'Perez', 31, '2022-01-05', '2022-02-02'),
       ('Eva', 'Ross', 32, '2022-01-15', '2022-02-12'),
       ('Finn', 'Hall', 33, '2022-01-28', '2022-02-25'),
       ('Grace', 'Adams', 34, '2022-02-10', '2022-03-10'),
       ('Hugo', 'Bennett', 35, '2022-02-21', NULL),
       ('Ivy', 'Torres', 36, '2022-03-01', NULL),
       ('Jake', 'Nguyen', 37, '2022-03-15', '2022-04-12'),
       ('Kara', 'Carter', 38, '2022-03-30', '2022-04-27'),
       ('Leo', 'Mitchell', 39, '2022-04-05', '2022-05-03'),
       ('Mona', 'Flores', 40, '2022-04-15', '2022-05-13'),
       ('Ned', 'Jenkins', 41, '2022-05-01', '2022-05-29'),
       ('Opal', 'Sanders', 42, '2022-05-10', '2022-06-07'),
       ('Pete', 'Stewart', 43, '2022-05-20', '2022-06-17');

-- PC Case Table
CREATE TABLE pc_case (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    case_type           VARCHAR(255) NOT NULL,
    color               VARCHAR(255) NOT NULL,
    price               DECIMAL(10, 2),
    stock               INTEGER DEFAULT 0, -- Track number of parts in stock
    max_gpu_length      INTEGER,           -- Maximum GPU length supported
    max_cooler_height   INTEGER,           -- Max CPU cooler height supported
    max_psu_length      INTEGER            -- Max PSU length supported
);

-- Inserting different PC Case parts into the pc_case table
INSERT INTO pc_case (name, brand, part_number, case_type, color, price, stock, max_gpu_length, max_cooler_height, max_psu_length) VALUES
	('Cooler Master MasterBox Q300L', 'Cooler Master', 'MCB-Q300L-KANN-S00', 'Micro ATX', 'Black', 44.99, 12, 360, 160, 180),
	('Corsair iCUE 4000X RGB', 'Corsair', 'CC-9011205-WW', 'ATX', 'White', 130.99, 9, 360, 170, 180),
	('NZXT H510', 'NZXT', 'CA-H510B-B1', 'ATX', 'Black', 69.99, 10, 381, 165, 210),
	('Phanteks Eclipse P500A', 'Phanteks', 'PH-EC500ATG_DBK01', 'ATX', 'Black', 99.99, 8, 435, 190, 195),
	('Fractal Design Meshify C', 'Fractal Design', 'FD-CA-MESH-C-BKO-TG', 'ATX', 'Black', 89.99, 15, 315, 172, 175),
	('Lian Li PC-O11 Dynamic', 'Lian Li', 'O11DX', 'ATX', 'White', 139.99, 6, 420, 168, 200),
	('Be Quiet! Pure Base 500DX', 'Be Quiet!', 'BGW37', 'ATX', 'Black', 99.99, 7, 369, 190, 180),
	('Cooler Master Cosmos C700P', 'Cooler Master', 'MCC-C700P-MG5N-S00', 'ATX', 'Gray', 319.99, 5, 490, 198, 240),
	('Thermaltake Core V21', 'Thermaltake', 'CA-1D5-00S1WN-00', 'Micro ATX', 'Black', 49.99, 14, 350, 155, 200),
	('InWin 101', 'InWin', 'IW-CS-101BL', 'ATX', 'Black', 69.99, 6, 421, 160, 200),
	('Cooler Master NR200P', 'Cooler Master', 'MCB-NR200P-KGNN-S00', 'Mini ITX', 'Black', 99.99, 9, 330, 155, 160),
	('Thermaltake Core P3', 'Thermaltake', 'CA-1G4-00M1WN-06', 'ATX', 'White', 149.99, 8, 450, 180, 220),
	('Corsair 275R Airflow', 'Corsair', 'CC-9011181-WW', 'ATX', 'Black', 84.99, 7, 370, 170, 180),
	('NZXT H710i', 'NZXT', 'CA-H710i-W1', 'ATX', 'White', 179.99, 5, 413, 185, 200),
	('Phanteks Enthoo Pro', 'Phanteks', 'PH-ES614P_BK', 'ATX', 'Black', 119.99, 6, 347, 193, 240),
	('Fractal Design Define R6', 'Fractal Design', 'FD-CA-DEF-R6C-BKO-TG', 'ATX', 'Black', 149.99, 9, 450, 185, 200),
	('Lian Li Lancool II', 'Lian Li', 'LANCOOL II', 'ATX', 'White', 89.99, 12, 384, 176, 210),
	('Be Quiet! Dark Base Pro 900', 'Be Quiet!', 'BGW11', 'ATX', 'Black', 269.99, 5, 472, 185, 230),
	('Cooler Master HAF 700', 'Cooler Master', 'HAF-700-EVO', 'ATX', 'Black', 269.99, 5, 490, 200, 240),
	('Thermaltake V250 TG ARGB', 'Thermaltake', 'CA-1Q5-00M1WN-00', 'ATX', 'Black', 69.99, 7, 320, 160, 180),
	('NZXT H1 V2', 'NZXT', 'CA-H16WR-W1', 'Mini ITX', 'White', 349.99, 8, 300, 165, 150),
	('Corsair 4000D Airflow', 'Corsair', 'CC-9011200-WW', 'ATX', 'Black', 94.99, 10, 360, 170, 180),
	('Phanteks Evolv Shift 2', 'Phanteks', 'PH-ES217A_AG02', 'Mini ITX', 'Gray', 109.99, 6, 335, 145, 160),
	('Cooler Master MasterBox TD500', 'Cooler Master', 'TD500', 'ATX', 'White', 99.99, 10, 410, 165, 180),
	('Lian Li PC-011 Air', 'Lian Li', 'PC-011AIR', 'ATX', 'Black', 139.99, 7, 420, 170, 210),
	('Fractal Design Node 304', 'Fractal Design', 'FD-CA-NODE-304-WT', 'Mini ITX', 'White', 89.99, 12, 310, 160, 180),
	('Thermaltake S100 TG', 'Thermaltake', 'CA-1Q9-00S1WN-00', 'Micro ATX', 'White', 54.99, 15, 330, 155, 200),
	('NZXT H510 Elite', 'NZXT', 'CA-H510E-W1', 'ATX', 'White', 149.99, 9, 368, 160, 210),
	('Phanteks Eclipse P300A', 'Phanteks', 'PH-EC300ATG', 'ATX', 'Black', 59.99, 14, 330, 160, 190),
	('Corsair Crystal Series 680X', 'Corsair', 'CC-9011168-WW', 'ATX', 'Black', 249.99, 6, 423, 180, 220),
	('Cooler Master Silencio S600', 'Cooler Master', 'MCB-S600-KN5N-S00', 'ATX', 'Black', 99.99, 8, 398, 165, 200),
	('Be Quiet! Silent Base 601', 'Be Quiet!', 'BGW28', 'ATX', 'Black', 129.99, 9, 449, 185, 230),
	('Thermaltake Level 20 GT', 'Thermaltake', 'CA-1K9-00F1WN-00', 'ATX', 'Black', 229.99, 7, 410, 200, 240),
	('NZXT H210i', 'NZXT', 'CA-H210I-B1', 'Mini ITX', 'Black', 109.99, 11, 320, 165, 160),
	('Corsair Obsidian 500D', 'Corsair', 'CC-9011139-WW', 'ATX', 'Black', 154.99, 7, 395, 180, 220),
	('Cooler Master SL600M', 'Cooler Master', 'MCM-SL600M-SGNN-S00', 'ATX', 'Silver', 199.99, 5, 480, 190, 210),
	('Thermaltake Versa H18', 'Thermaltake', 'CA-1J4-00S1WN-00', 'Micro ATX', 'Black', 49.99, 16, 360, 155, 200),
	('Fractal Design Define 7', 'Fractal Design', 'FD-C-DEF7A-02', 'ATX', 'Gray', 169.99, 9, 491, 185, 220),
	('Phanteks Evolv X', 'Phanteks', 'PH-ES518XTG_DBK01', 'ATX', 'Black', 199.99, 5, 435, 190, 230),
	('NZXT H500', 'NZXT', 'CA-H500B-W1', 'ATX', 'White', 79.99, 12, 380, 160, 180),
	('Corsair Carbide Series 275R', 'Corsair', 'CC-9011132-WW', 'ATX', 'White', 79.99, 11, 370, 170, 180),
	('Cooler Master Q500L', 'Cooler Master', 'MCB-Q500L-KANN-S00', 'ATX', 'Black', 59.99, 14, 360, 160, 180),
	('Thermaltake Tower 900', 'Thermaltake', 'CA-1H1-00F1WN-00', 'ATX', 'Black', 269.99, 6, 480, 200, 240),
	('Phanteks Eclipse P400A', 'Phanteks', 'PH-EC400ATG_BK01', 'ATX', 'Black', 79.99, 9, 420, 190, 210);


-- Storage drive table
CREATE TABLE storage_drive (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    storage_type        VARCHAR(255) NOT NULL,
    capacity            VARCHAR(255) NOT NULL,
    stock               INTEGER  -- Track number of parts in stock
);

-- Inserting different Storage Drives into the storage_drive table
INSERT INTO storage_drive (name, brand, part_number, price, storage_type, capacity, stock) VALUES
    ('Samsung 970 Evo 1 TB', 'Samsung', 'MZ-V7E1T0BW', 168.28, 'NVMe SSD', '1 TB', 10),
    ('Seagate BarraCuda 1 TB', 'Seagate', 'ST1000DM010', 49.99, 'HDD', '1 TB', 15),
    ('Western Digital Blue 2 TB', 'Western Digital', 'WD20EZAZ', 69.99, 'HDD', '2 TB', 18),
    ('Crucial MX500 500 GB', 'Crucial', 'CT500MX500SSD1', 59.99, 'SATA SSD', '500 GB', 12),
    ('Samsung 860 Evo 1 TB', 'Samsung', 'MZ-76E1T0B/AM', 99.99, 'SATA SSD', '1 TB', 9),
    ('Seagate FireCuda 2 TB', 'Seagate', 'ST2000LX001', 84.99, 'Hybrid SSHD', '2 TB', 7),
    ('Western Digital Black 4 TB', 'Western Digital', 'WD4005FZBX', 249.99, 'HDD', '4 TB', 6),
    ('Kingston A2000 1 TB', 'Kingston', 'SA2000M8/1000G', 109.99, 'NVMe SSD', '1 TB', 14),
    ('Toshiba X300 4 TB', 'Toshiba', 'HDWE140XZSTA', 109.99, 'HDD', '4 TB', 16),
    ('Intel 660p 2 TB', 'Intel', 'SSDPEKNW020T8X1', 189.99, 'NVMe SSD', '2 TB', 8),
    ('Crucial BX500 1 TB', 'Crucial', 'CT1000BX500SSD1', 79.99, 'SATA SSD', '1 TB', 15),
    ('Seagate IronWolf 8 TB', 'Seagate', 'ST8000VN004', 239.99, 'HDD', '8 TB', 5),
    ('Samsung 980 Pro 1 TB', 'Samsung', 'MZ-V8P1T0B/AM', 199.99, 'NVMe SSD', '1 TB', 7),
    ('Western Digital Red 6 TB', 'Western Digital', 'WD60EFAX', 199.99, 'HDD', '6 TB', 10),
    ('Crucial P5 1 TB', 'Crucial', 'CT1000P5SSD8', 119.99, 'NVMe SSD', '1 TB', 12),
    ('Seagate BarraCuda 4 TB', 'Seagate', 'ST4000DM004', 99.99, 'HDD', '4 TB', 18),
    ('Samsung 860 Pro 512 GB', 'Samsung', 'MZ-76P512BW', 129.99, 'SATA SSD', '512 GB', 11),
    ('Western Digital Blue 1 TB', 'Western Digital', 'WD10EZEX', 49.99, 'HDD', '1 TB', 20),
    ('Kingston KC2500 1 TB', 'Kingston', 'SKC2500M8/1000G', 149.99, 'NVMe SSD', '1 TB', 6),
    ('Toshiba P300 2 TB', 'Toshiba', 'HDWD220XZSTA', 59.99, 'HDD', '2 TB', 12),
    ('Intel Optane 905P 960 GB', 'Intel', 'SSDPEL1D960GAX1', 1299.99, 'NVMe SSD', '960 GB', 5),
    ('Crucial MX500 2 TB', 'Crucial', 'CT2000MX500SSD1', 189.99, 'SATA SSD', '2 TB', 10),
    ('Seagate FireCuda 510 1 TB', 'Seagate', 'ZP1000GM30021', 169.99, 'NVMe SSD', '1 TB', 9),
    ('Western Digital Gold 10 TB', 'Western Digital', 'WD101KRYZ', 379.99, 'HDD', '10 TB', 7),
    ('Samsung 970 Pro 512 GB', 'Samsung', 'MZ-V7P512BW', 149.99, 'NVMe SSD', '512 GB', 14),
    ('Toshiba Canvio 4 TB', 'Toshiba', 'HDWC340XZSTA', 99.99, 'HDD', '4 TB', 13),
    ('Kingston A400 240 GB', 'Kingston', 'SA400S37/240G', 29.99, 'SATA SSD', '240 GB', 16),
    ('Seagate BarraCuda Pro 10 TB', 'Seagate', 'ST10000DM0004', 339.99, 'HDD', '10 TB', 6),
    ('Western Digital Black 2 TB', 'Western Digital', 'WD2003FZEX', 129.99, 'HDD', '2 TB', 10),
    ('Samsung 870 QVO 1 TB', 'Samsung', 'MZ-77Q1T0B/AM', 89.99, 'SATA SSD', '1 TB', 15),
    ('Crucial BX500 480 GB', 'Crucial', 'CT480BX500SSD1', 44.99, 'SATA SSD', '480 GB', 19),
    ('Seagate IronWolf Pro 6 TB', 'Seagate', 'ST6000NE0023', 299.99, 'HDD', '6 TB', 8),
    ('Western Digital My Passport 2 TB', 'Western Digital', 'WDBYVG0020BBK-WESN', 59.99, 'External HDD', '2 TB', 17),
    ('Samsung 860 Evo 500 GB', 'Samsung', 'MZ-76E500B/AM', 69.99, 'SATA SSD', '500 GB', 14),
    ('Toshiba X300 5 TB', 'Toshiba', 'HDWE150XZSTA', 129.99, 'HDD', '5 TB', 9),
    ('Intel SSD 750 Series 1.2 TB', 'Intel', 'SSDPE2MW012T4R5', 699.99, 'PCIe SSD', '1.2 TB', 5),
    ('Crucial P2 500 GB', 'Crucial', 'CT500P2SSD8', 59.99, 'NVMe SSD', '500 GB', 13),
    ('Seagate SkyHawk 6 TB', 'Seagate', 'ST6000VX0023', 169.99, 'HDD', '6 TB', 11),
    ('Western Digital Red 4 TB', 'Western Digital', 'WD40EFAX', 129.99, 'HDD', '4 TB', 15),
    ('Samsung 970 Evo Plus 2 TB', 'Samsung', 'MZ-V7S2T0B/AM', 279.99, 'NVMe SSD', '2 TB', 7),
    ('Toshiba Canvio Basics 1 TB', 'Toshiba', 'HDTB410XK3AA', 49.99, 'External HDD', '1 TB', 20),
    ('Kingston HyperX Fury 480 GB', 'Kingston', 'SHFS37A/480G', 99.99, 'SATA SSD', '480 GB', 10),
    ('Crucial P1 1 TB', 'Crucial', 'CT1000P1SSD8', 99.99, 'NVMe SSD', '1 TB', 11),
    ('Seagate FireCuda Gaming SSD 1 TB', 'Seagate', 'STJP1000400', 159.99, 'External SSD', '1 TB', 9),
    ('Western Digital Black SN750 1 TB', 'Western Digital', 'WDS100T3X0C', 149.99, 'NVMe SSD', '1 TB', 12);

-- RAM Table
CREATE TABLE memory_ram (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    form_factor         VARCHAR(255) NOT NULL, -- For compatibility check with motherboard
    modules             VARCHAR(255) NOT NULL,
    frequency           VARCHAR(255) NOT NULL,
    capacity            VARCHAR(255) NOT NULL,
    stock               INTEGER DEFAULT 0
);

-- Inserting different RAM modules into the memory_ram table
INSERT INTO memory_ram (name, brand, part_number, price, form_factor, modules, frequency, capacity, stock) VALUES
	('Corsair Vengeance LPX 16 GB', 'Corsair', 'CMK16GX4M2B3200C16', 89.99, '288', '2 x 8GB', '3200 MHz', '16 GB', 10),
	('G.Skill Ripjaws V 32 GB', 'G.Skill', 'F4-3200C16D-32GVK', 159.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 8),
	('Kingston HyperX Fury 16 GB', 'Kingston', 'HX432C16FB3K2/16', 79.99, '288', '2 x 8GB', '3200 MHz', '16 GB', 12),
	('Crucial Ballistix 16 GB', 'Crucial', 'BL2K8G36C16U4B', 74.99, '288', '2 x 8GB', '3600 MHz', '16 GB', 14),
	('Corsair Dominator Platinum RGB 32 GB', 'Corsair', 'CMT32GX4M2C3200C16', 199.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 9),
	('G.Skill Trident Z Neo 16 GB', 'G.Skill', 'F4-3600C18D-16GTZN', 94.99, '288', '2 x 8GB', '3600 MHz', '16 GB', 11),
	('Team T-Force Vulcan Z 16 GB', 'Team', 'TLZGD416G3200HC16CDC01', 69.99, '288', '2 x 8GB', '3200 MHz', '16 GB', 15),
	('Corsair Vengeance RGB Pro 32 GB', 'Corsair', 'CMW32GX4M2E3200C16', 179.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 7),
	('G.Skill Aegis 16 GB', 'G.Skill', 'F4-3000C16D-16GISB', 59.99, '288', '2 x 8GB', '3000 MHz', '16 GB', 10),
	('Team T-Force Delta RGB 16 GB', 'Team', 'TF3D416G3000HC16CDC01', 79.99, '288', '2 x 8GB', '3000 MHz', '16 GB', 12),
	('Corsair Vengeance LPX 64 GB', 'Corsair', 'CMK64GX4M4A2666C16', 299.99, '288', '4 x 16GB', '2666 MHz', '64 GB', 6),
	('Crucial Ballistix 32 GB', 'Crucial', 'BL2K16G32C16U4R', 149.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 14),
	('G.Skill Trident Z RGB 64 GB', 'G.Skill', 'F4-3200C16Q-64GTZR', 329.99, '288', '4 x 16GB', '3200 MHz', '64 GB', 7),
	('Corsair Vengeance LPX 8 GB', 'Corsair', 'CMK8GX4M1A2400C16', 39.99, '288', '1 x 8GB', '2400 MHz', '8 GB', 15),
	('G.Skill Ripjaws V 16 GB', 'G.Skill', 'F4-2400C15D-16GVR', 74.99, '288', '2 x 8GB', '2400 MHz', '16 GB', 18),
	('Corsair Dominator Platinum 64 GB', 'Corsair', 'CMD64GX4M4C3200C16', 399.99, '288', '4 x 16GB', '3200 MHz', '64 GB', 5),
	('Team T-Force Night Hawk RGB 16 GB', 'Team', 'TF1D416G3200HC16CDC01', 89.99, '288', '2 x 8GB', '3200 MHz', '16 GB', 9),
	('Kingston HyperX Fury 32 GB', 'Kingston', 'HX432C16FB3K2/32', 169.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 7),
	('G.Skill Ripjaws V 64 GB', 'G.Skill', 'F4-3200C16Q-64GVK', 319.99, '288', '4 x 16GB', '3200 MHz', '64 GB', 9),
	('Corsair Vengeance Pro 64 GB', 'Corsair', 'CMW64GX4M4C3000C15', 299.99, '288', '4 x 16GB', '3000 MHz', '64 GB', 6),
	('G.Skill Trident Z Neo 32 GB', 'G.Skill', 'F4-3600C18D-32GTZN', 179.99, '288', '2 x 16GB', '3600 MHz', '32 GB', 8),
	('Patriot Signature Premium 16 GB', 'Patriot', 'PSD416G266681', 59.99, '288', '1 x 16GB', '2666 MHz', '16 GB', 17),
	('G.Skill Aegis 32 GB', 'G.Skill', 'F4-3200C16D-32GIS', 149.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 10),
	('Corsair Vengeance LPX 32 GB', 'Corsair', 'CMK32GX4M2E3200C16', 159.99, '288', '2 x 16GB', '3200 MHz', '32 GB', 12),
	('Team T-Force Dark Z 16 GB', 'Team', 'TDZGD416G3200HC16CDC01', 79.99, '288', '2 x 8GB', '3200 MHz', '16 GB', 11);


-- Monitor Table
CREATE TABLE monitor (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    screen_size         VARCHAR(255) NOT NULL,
    resolution          VARCHAR(255) NOT NULL,
    stock               INTEGER DEFAULT 0
);

-- Inserting different monitors into the monitor table
INSERT INTO monitor (name, brand, part_number, price, screen_size, resolution, stock) VALUES
	('Samsung U32R590', 'Samsung', 'LU32R590CWNXZA', 399.99, '32', '3840 x 2160', 15),
	('Dell UltraSharp U2720Q', 'Dell', 'U2720Q', 599.99, '27', '3840 x 2160', 10),
	('LG 27UK850-W', 'LG', '27UK850-W', 449.99, '27', '3840 x 2160', 12),
	('ASUS ProArt PA32UCX', 'ASUS', 'PA32UCX', 2999.99, '32', '3840 x 2160', 5),
	('BenQ PD3220U', 'BenQ', 'PD3220U', 1199.99, '32', '3840 x 2160', 8),
	('Gigabyte AORUS AD27QD', 'Gigabyte', 'AORUS AD27QD', 799.99, '27', '2560 x 1440', 14),
	('ASUS ROG Swift PG27UQ', 'ASUS', 'PG27UQ', 1999.99, '27', '3840 x 2160', 7),
	('Samsung Odyssey G7', 'Samsung', 'LC32G75TQSNXZA', 699.99, '32', '2560 x 1440', 11),
	('Dell Alienware AW2521H', 'Dell', 'AW2521H', 499.99, '25', '2560 x 1440', 9),
	('HP Omen X 27', 'HP', '6MC20AA#ABA', 599.99, '27', '2560 x 1440', 15),
	('LG 34WK95U-W', 'LG', '34WK95U-W', 1299.99, '34', '5120 x 2160', 8),
	('Dell P2720DC', 'Dell', 'P2720DC', 349.99, '27', '2560 x 1440', 18),
	('BenQ SW321C', 'BenQ', 'SW321C', 1199.99, '32', '3840 x 2160', 5),
	('Acer R240HY', 'Acer', 'UM.QR0AA.001', 149.99, '23.8', '1920 x 1080', 20),
	('ASUS ProArt PA278QV', 'ASUS', 'PA278QV', 299.99, '27', '2560 x 1440', 10),
	('ViewSonic VP2468', 'ViewSonic', 'VP2468', 239.99, '24', '1920 x 1080', 14),
	('LG 24MP88HV-S', 'LG', '24MP88HV-S', 199.99, '24', '1920 x 1080', 12),
	('Samsung CF390', 'Samsung', 'LC24F390FHNXZA', 169.99, '24', '1920 x 1080', 15),
	('Dell S2721D', 'Dell', 'S2721D', 349.99, '27', '2560 x 1440', 8),
	('BenQ GW2480', 'BenQ', 'GW2480', 179.99, '24', '1920 x 1080', 16),
	('HP 27F', 'HP', '4HA82AA#ABA', 199.99, '27', '1920 x 1080', 20),
	('Acer XB271HU', 'Acer', 'UM.HX1AA.001', 699.99, '27', '2560 x 1440', 9),
	('ASUS VG248QE', 'ASUS', '90LMG0011T01', 249.99, '24', '1920 x 1080', 12),
	('LG 27GL850-B', 'LG', '27GL850-B', 499.99, '27', '2560 x 1440', 11),
	('Dell U4919DW', 'Dell', 'U4919DW', 1399.99, '49', '5120 x 1440', 7),
	('Samsung Odyssey G9', 'Samsung', 'LC49G95TSSNXZA', 1399.99, '49', '5120 x 1440', 6),
	('BenQ Zowie XL2411P', 'BenQ', 'XL2411P', 249.99, '24', '1920 x 1080', 10),
	('HP EliteDisplay E243i', 'HP', '1FH47AA#ABA', 299.99, '24', '1920 x 1200', 5),
	('Acer Nitro VG271U', 'Acer', 'UM.HV1AA.001', 299.99, '27', '2560 x 1440', 18),
	('ASUS TUF Gaming VG259QM', 'ASUS', 'VG259QM', 399.99, '25', '1920 x 1080', 14),
	('LG 34GN850-B', 'LG', '34GN850-B', 999.99, '34', '3440 x 1440', 12),
	('Dell U2721DE', 'Dell', 'U2721DE', 499.99, '27', '2560 x 1440', 15),
	('Samsung S80A Series', 'Samsung', 'LS27A800UNNXZA', 499.99, '27', '3840 x 2160', 10),
	('ASUS ROG Strix XG27AQ', 'ASUS', 'XG27AQ', 699.99, '27', '2560 x 1440', 8),
	('Acer SB220Q', 'Acer', 'UM.QB0AA.001', 139.99, '21.5', '1920 x 1080', 20),
	('LG 27UL500-W', 'LG', '27UL500-W', 299.99, '27', '3840 x 2160', 9),
	('BenQ EW2780U', 'BenQ', 'EW2780U', 499.99, '27', '3840 x 2160', 12),
	('Dell P4317Q', 'Dell', 'P4317Q', 1399.99, '43', '3840 x 2160', 5);

-- Motherboard Table
CREATE TABLE motherboard (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    socket              VARCHAR(255) NOT NULL, -- For CPU compatibility
    form_factor         VARCHAR(255) NOT NULL, -- For case compatibility
    pins                VARCHAR(255) NOT NULL, -- RAM compatibility
    storage_type        VARCHAR(255) NOT NULL, -- Storage drive compatibility
    stock               INTEGER DEFAULT 0
);

-- Inserting different motherboards into the motherboard table
INSERT INTO motherboard (name, brand, part_number, price, socket, form_factor, pins, storage_type, stock) VALUES
	('ASUS ROG Strix Z490-E Gaming', 'ASUS', 'ROG STRIX Z490-E', 249.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 10),
	('Gigabyte AORUS X570 Master', 'Gigabyte', 'X570 AORUS MASTER', 349.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 7),
	('MSI MPG B550 Gaming Edge WiFi', 'MSI', 'B550 GAMING EDGE WIFI', 189.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 12),
	('ASRock B450M Steel Legend', 'ASRock', 'B450M Steel Legend', 109.99, 'AM4', 'Micro ATX', '288', 'SATA,HDD', 15),
	('ASUS Prime Z490-A', 'ASUS', 'PRIME Z490-A', 199.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 9),
	('Gigabyte Z490 AORUS Elite', 'Gigabyte', 'Z490 AORUS ELITE', 229.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 8),
	('MSI B450 TOMAHAWK MAX', 'MSI', 'B450 TOMAHAWK MAX', 109.99, 'AM4', 'ATX', '288', 'SATA,HDD', 14),
	('ASRock Z490 Taichi', 'ASRock', 'Z490 Taichi', 289.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 6),
	('ASUS ROG Crosshair VIII Hero', 'ASUS', 'ROG CROSSHAIR VIII HERO', 299.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 7),
	('Gigabyte B550M AORUS PRO-P', 'Gigabyte', 'B550M AORUS PRO-P', 139.99, 'AM4', 'Micro ATX', '288', 'SATA,NVMe,HDD', 11),
	('MSI MPG Z490 Gaming Plus', 'MSI', 'MPG Z490 GAMING PLUS', 159.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 13),
	('ASRock X570 Phantom Gaming 4', 'ASRock', 'X570 Phantom Gaming 4', 179.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 5),
	('ASUS TUF Gaming B550-PLUS', 'ASUS', 'TUF B550-PLUS', 159.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 16),
	('Gigabyte AORUS B450 Elite', 'Gigabyte', 'B450 AORUS ELITE', 109.99, 'AM4', 'ATX', '288', 'SATA,HDD', 15),
	('MSI Z490-A PRO', 'MSI', 'Z490-A PRO', 159.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 10),
	('ASRock B550M Pro4', 'ASRock', 'B550M Pro4', 99.99, 'AM4', 'Micro ATX', '288', 'SATA,NVMe,HDD', 12),
	('ASUS ROG Strix X570-F Gaming', 'ASUS', 'ROG STRIX X570-F', 249.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 8),
	('Gigabyte Z490 Gaming X', 'Gigabyte', 'Z490 GAMING X', 149.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 14),
	('MSI MAG B550M MORTAR WIFI', 'MSI', 'MAG B550M MORTAR WIFI', 139.99, 'AM4', 'Micro ATX', '288', 'SATA,NVMe,HDD', 9),
	('ASRock X570 Steel Legend', 'ASRock', 'X570 Steel Legend', 199.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 7),
	('ASUS ROG Strix Z490-I Gaming', 'ASUS', 'ROG STRIX Z490-I', 279.99, 'LGA 1200', 'Mini ITX', '288', 'SATA,NVMe,HDD', 6),
	('Gigabyte B450 AORUS M', 'Gigabyte', 'B450 AORUS M', 99.99, 'AM4', 'Micro ATX', '288', 'SATA,HDD', 11),
	('MSI X570-A PRO', 'MSI', 'X570-A PRO', 159.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 12),
	('ASRock B550 Phantom Gaming 4', 'ASRock', 'B550 Phantom Gaming 4', 139.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 10),
	('ASUS ROG Maximus XIII Hero', 'ASUS', 'MAXIMUS XIII HERO', 349.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 8),
	('Gigabyte Z490 Vision G', 'Gigabyte', 'Z490 VISION G', 239.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 9),
	('MSI MPG X570 Gaming Plus', 'MSI', 'MPG X570 GAMING PLUS', 189.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 14),
	('ASRock B550 Steel Legend', 'ASRock', 'B550 Steel Legend', 159.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 15),
	('ASUS TUF Gaming Z490-PLUS', 'ASUS', 'TUF Z490-PLUS', 179.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 10),
	('Gigabyte AORUS Elite X570', 'Gigabyte', 'X570 AORUS ELITE', 329.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 5),
	('MSI B550-A PRO', 'MSI', 'B550-A PRO', 139.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 11),
	('ASRock Z490M Pro4', 'ASRock', 'Z490M Pro4', 129.99, 'LGA 1200', 'Micro ATX', '288', 'SATA,NVMe,HDD', 12),
	('ASUS ROG Strix B550-F Gaming', 'ASUS', 'ROG STRIX B550-F', 199.99, 'AM4', 'ATX', '288', 'SATA,NVMe,HDD', 8),
	('Gigabyte B450M DS3H', 'Gigabyte', 'B450M DS3H', 89.99, 'AM4', 'Micro ATX', '288', 'SATA,HDD', 16),
	('MSI H510M PRO', 'MSI', 'H510M PRO', 89.99, 'LGA 1200', 'Micro ATX', '288', 'SATA,HDD', 10),
	('ASRock H470 Steel Legend', 'ASRock', 'H470 Steel Legend', 159.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 9),
	('ASUS ROG Strix H470-F Gaming', 'ASUS', 'ROG STRIX H470-F', 239.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 6),
	('Gigabyte H470 AORUS Elite', 'Gigabyte', 'H470 AORUS ELITE', 199.99, 'LGA 1200', 'ATX', '288', 'SATA,NVMe,HDD', 12),
	('MSI B460M PRO-VDH WiFi', 'MSI', 'B460M PRO-VDH WIFI', 99.99, 'LGA 1200', 'Micro ATX', '288', 'SATA,HDD', 10);

-- CPU Table
CREATE TABLE cpu (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    core_clock          VARCHAR(255) NOT NULL,
    core_count          INTEGER,
    required_wattage    INTEGER, -- For PSU compatibility
    socket              VARCHAR(255) NOT NULL, -- For motherboard compatibility
    stock               INTEGER DEFAULT 0
);

-- Inserting different CPUs into the gpu table
INSERT INTO cpu (name, brand, part_number, price, core_clock, core_count, required_wattage, socket, stock) VALUES
	('Intel Core i9-11900K', 'Intel', 'BX8070811900K', 499.99, '3.5 GHz', 8, 125, 'LGA 1200', 10),
	('AMD Ryzen 9 5900X', 'AMD', '100-100000031US', 499.00, '3.7 GHz', 12, 105, 'AM4', 15),
	('Intel Core i7-11700K', 'Intel', 'BX8070811700K', 399.99, '3.6 GHz', 8, 125, 'LGA 1200', 12),
	('AMD Ryzen 7 5800X', 'AMD', '100-100000032US', 449.99, '3.8 GHz', 8, 105, 'AM4', 9),
	('Intel Core i5-11600K', 'Intel', 'BX8070811600K', 289.99, '3.9 GHz', 6, 125, 'LGA 1200', 11),
	('AMD Ryzen 5 5600X', 'AMD', '100-100000065BOX', 299.99, '3.7 GHz', 6, 65, 'AM4', 20),
	('Intel Core i9-10900K', 'Intel', 'BX8070110900K', 499.99, '3.7 GHz', 10, 125, 'LGA 1200', 8),
	('AMD Ryzen 9 3950X', 'AMD', '100-100000051WOF', 719.99, '3.5 GHz', 16, 105, 'AM4', 5),
	('Intel Core i7-10700K', 'Intel', 'BX8070110700K', 374.99, '3.8 GHz', 8, 125, 'LGA 1200', 14),
	('Intel Core i5-10400F', 'Intel', 'BX8070110400F', 157.99, '2.9 GHz', 6, 65, 'LGA 1200', 15),
	('AMD Ryzen 5 3400G', 'AMD', 'YD3400C5FHBOX', 149.99, '3.7 GHz', 4, 65, 'AM4', 18),
	('Intel Core i3-10100', 'Intel', 'BX8070110100', 122.99, '3.6 GHz', 4, 65, 'LGA 1200', 16),
	('AMD Ryzen 3 3100', 'AMD', '100-100000033US', 99.99, '3.6 GHz', 4, 65, 'AM4', 14),
	('Intel Core i5-11400', 'Intel', 'BX8070811400', 199.99, '2.6 GHz', 6, 65, 'LGA 1200', 10),
	('AMD Ryzen 5 2600', 'AMD', 'YD2600BBAFBOX', 149.99, '3.4 GHz', 6, 65, 'AM4', 10),
	('Intel Core i7-11700', 'Intel', 'BX8070811700', 339.99, '2.5 GHz', 8, 65, 'LGA 1200', 9),
	('AMD Ryzen 7 1700', 'AMD', 'YD1700BBAEBOX', 299.99, '3.0 GHz', 8, 65, 'AM4', 8),
	('Intel Core i5-11500', 'Intel', 'BX8070811500', 249.99, '2.7 GHz', 6, 65, 'LGA 1200', 12),
	('AMD Ryzen 3 2200G', 'AMD', 'YD2200C5FHBOX', 99.99, '3.5 GHz', 4, 65, 'AM4', 19),
	('Intel Core i3-10105', 'Intel', 'BX8070110105', 129.99, '3.7 GHz', 4, 65, 'LGA 1200', 14),
	('AMD Ryzen 5 4500U', 'AMD', '100-100000265US', 199.99, '2.3 GHz', 6, 25, 'AM4', 10),
	('Intel Core i7-11700F', 'Intel', 'BX8070811700F', 329.99, '2.5 GHz', 8, 65, 'LGA 1200', 15),
	('AMD Ryzen 9 5900HS', 'AMD', '100-101000032US', 499.99, '3.3 GHz', 8, 35, 'AM4', 7),
	('Intel Core i9-11900', 'Intel', 'BX8070811900', 489.99, '2.7 GHz', 8, 65, 'LGA 1200', 9),
	('AMD Ryzen 7 5800H', 'AMD', '100-100000135US', 449.99, '3.2 GHz', 8, 45, 'AM4', 9),
	('Intel Core i7-11800H', 'Intel', 'BX8070811800H', 399.99, '2.3 GHz', 8, 45, 'LGA 1200', 11),
	('AMD Ryzen 5 5600H', 'AMD', '100-100000200US', 299.99, '3.3 GHz', 6, 45, 'AM4', 14),
	('Intel Core i5-11300H', 'Intel', 'BX8070811300H', 279.99, '3.1 GHz', 4, 35, 'LGA 1200', 15),
	('AMD Ryzen 5 PRO 4650U', 'AMD', '100-100000275US', 199.99, '2.1 GHz', 6, 25, 'AM4', 13),
	('Intel Core i5-10500', 'Intel', 'BX8070110500', 249.99, '3.1 GHz', 6, 65, 'LGA 1200', 10),
	('AMD Ryzen 3 PRO 4350G', 'AMD', '100-100000285US', 179.99, '3.8 GHz', 4, 35, 'AM4', 8),
	('Intel Core i5-11400H', 'Intel', 'BX8070811400H', 259.99, '2.6 GHz', 6, 65, 'LGA 1200', 10),
	('AMD Ryzen 5 5600U', 'AMD', '100-100000290US', 299.99, '2.3 GHz', 6, 25, 'AM4', 15),
	('Intel Pentium Gold G6400', 'Intel', 'BX80701G6400', 64.99, '4.0 GHz', 2, 58, 'LGA 1200', 20);



-- Graphics Card Table
CREATE TABLE gpu (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    memory              VARCHAR(255) NOT NULL,
    core_clock          VARCHAR(255) NOT NULL,
    length              INTEGER,           -- Length for case compatibility
    required_wattage    INTEGER,           -- wattage for psu compatibility
    stock               INTEGER DEFAULT 0
);

-- Inserting different GPUs into the gpu table
INSERT INTO gpu (name, brand, part_number, price, memory, core_clock, length, required_wattage, stock) VALUES
	('NVIDIA GeForce RTX 3090', 'NVIDIA', '900-1G136-2510-000', 1499.99, '24 GB', '1395 MHz', 313, 750, 10),
	('NVIDIA GeForce RTX 3080', 'NVIDIA', '900-1G190-2500-000', 699.99, '10 GB', '1710 MHz', 285, 750, 15),
	('NVIDIA GeForce RTX 3070', 'NVIDIA', '900-1G200-2500-000', 499.99, '8 GB', '1730 MHz', 242, 650, 12),
	('NVIDIA GeForce RTX 3060 Ti', 'NVIDIA', '900-1G241-2500-000', 399.99, '8 GB', '1665 MHz', 242, 600, 18),
	('NVIDIA GeForce RTX 3060', 'NVIDIA', '900-1G246-2500-000', 329.99, '12 GB', '1777 MHz', 232, 550, 14),
	('AMD Radeon RX 6900 XT', 'AMD', '113-DC-150061', 999.99, '16 GB', '2015 MHz', 267, 750, 7),
	('AMD Radeon RX 6800 XT', 'AMD', '113-DC-150052', 649.99, '16 GB', '2015 MHz', 267, 750, 11),
	('AMD Radeon RX 6800', 'AMD', '113-DC-150053', 579.99, '16 GB', '1815 MHz', 250, 650, 8),
	('AMD Radeon RX 6700 XT', 'AMD', '113-DC-150047', 479.99, '12 GB', '2424 MHz', 250, 600, 10),
	('AMD Radeon RX 6600 XT', 'AMD', '113-DC-150046', 379.99, '8 GB', '2589 MHz', 227, 500, 14),
	('NVIDIA GeForce GTX 1660 Ti', 'NVIDIA', 'GTX1660TI', 279.99, '6 GB', '1770 MHz', 245, 450, 9),
	('NVIDIA GeForce GTX 1660 Super', 'NVIDIA', 'GTX1660SUPER', 229.99, '6 GB', '1785 MHz', 238, 450, 20),
	('NVIDIA GeForce GTX 1650 Super', 'NVIDIA', 'GTX1650SUPER', 189.99, '4 GB', '1725 MHz', 228, 400, 16),
	('NVIDIA GeForce GTX 1650', 'NVIDIA', 'GTX1650', 149.99, '4 GB', '1485 MHz', 232, 300, 12),
	('AMD Radeon RX 5700 XT', 'AMD', '112-GB-1020', 399.99, '8 GB', '1755 MHz', 267, 600, 8),
	('AMD Radeon RX 5700', 'AMD', '112-GB-1019', 349.99, '8 GB', '1750 MHz', 267, 550, 10),
	('NVIDIA GeForce RTX 2080 Ti', 'NVIDIA', '900-1G500-2500-000', 999.99, '11 GB', '1350 MHz', 267, 650, 6),
	('NVIDIA GeForce RTX 2080 Super', 'NVIDIA', '900-1G501-2500-000', 699.99, '8 GB', '1650 MHz', 267, 650, 5),
	('NVIDIA GeForce GTX 1070 Ti', 'NVIDIA', '900-1G204-2500-000', 449.99, '8 GB', '1683 MHz', 267, 500, 10),
	('NVIDIA GeForce GTX 1070', 'NVIDIA', '900-1G202-2500-000', 399.99, '8 GB', '1506 MHz', 267, 500, 13),
	('NVIDIA GeForce GTX 1060', 'NVIDIA', '900-1G201-2500-000', 299.99, '6 GB', '1506 MHz', 228, 400, 18),
	('AMD Radeon RX 580', 'AMD', '112-GB-580', 249.99, '8 GB', '1340 MHz', 267, 500, 12),
	('AMD Radeon RX 570', 'AMD', '112-GB-570', 199.99, '4 GB', '1244 MHz', 267, 450, 15),
	('AMD Radeon RX 560', 'AMD', '112-GB-560', 159.99, '4 GB', '1175 MHz', 227, 400, 17),
	('NVIDIA GeForce GTX 1050 Ti', 'NVIDIA', '900-1G150-2500-000', 169.99, '4 GB', '1290 MHz', 228, 300, 19),
	('NVIDIA GeForce GTX 1050', 'NVIDIA', '900-1G149-2500-000', 139.99, '2 GB', '1354 MHz', 228, 300, 14),
	('NVIDIA Quadro RTX 4000', 'NVIDIA', '900-1G500-1200-000', 899.99, '8 GB', '1000 MHz', 267, 600, 9),
	('NVIDIA Quadro P5000', 'NVIDIA', '900-1G501-1200-000', 1999.99, '16 GB', '1180 MHz', 267, 800, 8),
	('NVIDIA Quadro P4000', 'NVIDIA', '900-1G502-1200-000', 899.99, '8 GB', '1200 MHz', 267, 600, 10),
	('AMD Radeon Pro VII', 'AMD', '113-DC-150097', 1999.99, '16 GB', '1800 MHz', 267, 800, 7),
	('AMD Radeon Pro WX 8200', 'AMD', '113-DC-150048', 999.99, '8 GB', '1200 MHz', 267, 600, 9),
	('AMD Radeon Pro WX 7100', 'AMD', '113-DC-150049', 599.99, '8 GB', '1200 MHz', 267, 600, 10),
	('Intel Iris Xe Max', 'Intel', 'iGPU-1000001', 149.99, '4 GB', '1300 MHz', 190, 300, 15),
	('Intel HD Graphics 630', 'Intel', 'iGPU-1000002', 0.00, '0 GB', '1200 MHz', 190, 200, 20),
	('NVIDIA GeForce GTX 950', 'NVIDIA', '900-1G201-2500-010', 199.99, '2 GB', '1050 MHz', 228, 300, 10);


-- Power Supply Table
CREATE TABLE psu (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR(255) NOT NULL,
    brand               VARCHAR(255) NOT NULL,
    part_number         VARCHAR(255) UNIQUE NOT NULL,
    price               DECIMAL(10, 2),
    wattage             INTEGER NOT NULL,  -- For GPU/CPU power needs
    length              INTEGER,           -- Length for case compatibility
    stock               INTEGER DEFAULT 0
);

-- Inserting different PSUs into the psu table
INSERT INTO psu (name, brand, part_number, price, wattage, length, stock) VALUES
	('Corsair RM850x', 'Corsair', 'CP-90201770', 189.99, 850, 160, 10),
	('Seasonic Focus GX-850', 'Seasonic', 'SSR-850GD', 169.99, 850, 150, 16),
	('EVGA SuperNOVA 850 G5', 'EVGA', '220-G5-0850-X1', 149.99, 850, 150, 12),
	('Thermaltake Toughpower GF1 850W', 'Thermaltake', 'PS-TPG-0850FNF', 139.99, 850, 160, 8),
	('Cooler Master MWE Gold 850W', 'Cooler Master', 'MPE-8501-ACAAB-US', 109.99, 850, 150, 15),
	('Corsair RM750x', 'Corsair', 'CP-90201771', 169.99, 750, 160, 11),
	('Seasonic Focus GX-750', 'Seasonic', 'SSR-750GD', 139.99, 750, 150, 14),
	('EVGA SuperNOVA 750 G5', 'EVGA', '220-G5-0750-X1', 129.99, 750, 150, 20),
	('Thermaltake Toughpower GF1 750W', 'Thermaltake', 'PS-TPG-0750FNF', 119.99, 750, 160, 10),
	('Cooler Master MWE Gold 750W', 'Cooler Master', 'MPE-7501-ACAAB-US', 99.99, 750, 150, 16),
	('Corsair RM650x', 'Corsair', 'CP-90201772', 149.99, 650, 160, 12),
	('Seasonic Focus GX-650', 'Seasonic', 'SSR-650GD', 129.99, 650, 150, 14),
	('EVGA SuperNOVA 650 G5', 'EVGA', '220-G5-0650-X1', 119.99, 650, 150, 20),
	('Thermaltake Toughpower GF1 650W', 'Thermaltake', 'PS-TPG-0650FNF', 109.99, 650, 160, 15),
	('Cooler Master MWE Gold 650W', 'Cooler Master', 'MPE-6501-ACAAB-US', 89.99, 650, 150, 10),
	('Corsair CV550', 'Corsair', 'CP-90201710', 74.99, 550, 140, 20),
	('Seasonic S12III 550', 'Seasonic', 'SSR-550GB3', 69.99, 550, 140, 15),
	('EVGA 500 W1', 'EVGA', '100-W1-0500-K3', 59.99, 500, 140, 12),
	('Thermaltake Smart 500W', 'Thermaltake', 'PS-SPD-0500NPCWUS', 49.99, 500, 140, 8),
	('Cooler Master MWE Bronze 500W', 'Cooler Master', 'MPE-5001-ACAAB-US', 59.99, 500, 150, 20),
	('Corsair TX650M', 'Corsair', 'CP-90200771', 109.99, 650, 150, 11),
	('Seasonic Focus Plus 650W', 'Seasonic', 'SSR-650FL', 109.99, 650, 150, 14),
	('EVGA SuperNOVA 650 G2', 'EVGA', '220-G2-0650-X1', 99.99, 650, 150, 19),
	('Thermaltake Toughpower RGB 650W', 'Thermaltake', 'PS-TPG-0650FMF', 89.99, 650, 160, 17),
	('Cooler Master V750 Gold', 'Cooler Master', 'MPY-7501-ACAAG', 139.99, 750, 150, 15),
	('Corsair HX850i', 'Corsair', 'CP-90200717', 229.99, 850, 160, 5),
	('Seasonic Prime 850W', 'Seasonic', 'SSR-850TD', 249.99, 850, 150, 8),
	('EVGA SuperNOVA 1000 G5', 'EVGA', '220-G5-1000-X1', 229.99, 1000, 150, 10),
	('Thermaltake Toughpower PF1 1000W', 'Thermaltake', 'PS-TPG-1000FNF', 229.99, 1000, 160, 6),
	('Cooler Master MWE Gold 1000W', 'Cooler Master', 'MPE-1000-ACAAB-US', 189.99, 1000, 150, 9),
	('Corsair CV450', 'Corsair', 'CP-90201709', 69.99, 450, 140, 20),
	('Seasonic S12III 450', 'Seasonic', 'SSR-450GB3', 59.99, 450, 140, 15),
	('EVGA 400 N1', 'EVGA', '400-N1-400-XX', 49.99, 400, 140, 12),
	('Thermaltake Smart 450W', 'Thermaltake', 'PS-SPD-0450NPCWUS', 39.99, 450, 140, 8),
	('Cooler Master MWE Bronze 450W', 'Cooler Master', 'MPE-4501-ACAAB-US', 49.99, 450, 150, 20),
	('Corsair TX850M', 'Corsair', 'CP-90200775', 149.99, 850, 150, 15),
	('Seasonic Focus Plus 750W', 'Seasonic', 'SSR-750FL', 129.99, 750, 150, 10),
	('EVGA SuperNOVA 750 GA', 'EVGA', '220-GA-0750-X1', 139.99, 750, 150, 12),
	('Thermaltake Toughpower SFX 450W', 'Thermaltake', 'PS-TPG-0450FNF', 89.99, 450, 130, 16);

-- User's pc parts
CREATE TABLE user_picks (
	id INT PRIMARY KEY,
    case_id INTEGER,
    motherboard_id INTEGER,
    cpu_id INTEGER,
    memory_id INTEGER,
    storage_id INTEGER,
    monitor_id INTEGER,
    gpu_id INTEGER,
	psu_id INTEGER
);

INSERT INTO user_picks (id, case_id, motherboard_id, cpu_id, memory_id, storage_id, monitor_id, gpu_id, psu_id) 
	VALUES (1, 0, 0, 0, 0, 0, 0, 0, 0);
