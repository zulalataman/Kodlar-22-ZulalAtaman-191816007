-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 13 Oca 2021, 16:16:56
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `tablolar`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(11) NOT NULL,
  `TcKimlik` text COLLATE utf8_turkish_ci NOT NULL,
  `KullanıcıAdı` text COLLATE utf8_turkish_ci NOT NULL,
  `Şifre` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `TcKimlik`, `KullanıcıAdı`, `Şifre`) VALUES
(1, '13182223569', 'Zülal', '951023'),
(2, '95853612547', 'Beyza', '1234567'),
(3, '19364256963', 'Ayşe Sena', '852013');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriler`
--

CREATE TABLE `musteriler` (
  `id` int(11) NOT NULL,
  `Ad` text COLLATE utf8_turkish_ci NOT NULL,
  `Soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `Mail` text COLLATE utf8_turkish_ci NOT NULL,
  `TelefonNumarası` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `musteriler`
--

INSERT INTO `musteriler` (`id`, `Ad`, `Soyad`, `Mail`, `TelefonNumarası`) VALUES
(1, 'Dilara ', 'Demirci', 'dilarademirci@gmail.com', '05369876532'),
(2, 'Hacer Nur ', 'Yavaş', 'hacernuryavas@gmail.com', '05235474798'),
(3, 'İrem Fatma ', 'Akyol', 'iremfatma@gmail.com', '05452361242'),
(4, 'Ayşe ', 'Öztekin', 'ayseoztekin@gmail.com', '05558336978'),
(5, 'Gamze', 'Keskin', 'gamzekeskin@gmail.com', '05345283641'),
(6, 'Şilan Gül', 'Kahramanoğlu', 'silangul@gmail.com', '05367894261'),
(7, 'Dilber', 'Kılıç', 'dilberkılıc@gmail.com', '05412367474'),
(8, 'Nurbanu', 'Şeref', 'nurbanuseref@gmail.com', '05361243598'),
(9, 'Abdullah', 'Ataman', 'abdullahataman@gmail.com', '05552691258'),
(10, 'Ayşe Gül', 'Ataman', 'aysegulataman@gmail.com', '05416982312');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `satis`
--

CREATE TABLE `satis` (
  `id` int(11) NOT NULL,
  `MüşteriAdı` text COLLATE utf8_turkish_ci NOT NULL,
  `MüşteriSoyadı` text COLLATE utf8_turkish_ci NOT NULL,
  `ÜrünStokKodu` text COLLATE utf8_turkish_ci NOT NULL,
  `ÜrünAdı` text COLLATE utf8_turkish_ci NOT NULL,
  `SatılanAdet` int(11) NOT NULL,
  `ÜrünBirimFiyatı` double NOT NULL,
  `ToplamTutar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `satis`
--

INSERT INTO `satis` (`id`, `MüşteriAdı`, `MüşteriSoyadı`, `ÜrünStokKodu`, `ÜrünAdı`, `SatılanAdet`, `ÜrünBirimFiyatı`, `ToplamTutar`) VALUES
(1, 'Dilara ', 'Demirci', 'ktp00001', 'Kuyucaklı Yusuf', 20, 13, 260),
(2, 'Hacer Nur ', 'Yavaş', 'ktp00014', 'Vezir Gambiti', 50, 38, 1900),
(3, 'Şilan Gül', 'Kahramanoğlu', 'ktp00009', 'Sevda Sözleri', 10, 32.25, 322.5),
(4, 'Hacer Nur ', 'Yavaş', 'ktp00022', 'Hayvan Çiftliği', 35, 22, 770),
(5, 'Abdullah', 'Ataman', 'ktp00031', 'Beyaz Zambaklar Ülkesinde ', 53, 15, 795),
(6, 'Gamze', 'Keskin', 'ktp00003', 'Küçük Prens', 32, 9.3, 297.6),
(7, 'Abdullah', 'Ataman', 'ktp00005', 'Siyasetname', 94, 30, 2820),
(8, 'Nurbanu', 'Şeref', 'ktp00030', 'Deliliğe Övgü', 10, 12.25, 122.5);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunler`
--

CREATE TABLE `urunler` (
  `id` int(11) NOT NULL,
  `StokKodu` text COLLATE utf8_turkish_ci NOT NULL,
  `KitapAdı` text COLLATE utf8_turkish_ci NOT NULL,
  `Yazar` text COLLATE utf8_turkish_ci NOT NULL,
  `Adet` int(11) NOT NULL,
  `Fiyat` double NOT NULL,
  `Tür` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `urunler`
--

INSERT INTO `urunler` (`id`, `StokKodu`, `KitapAdı`, `Yazar`, `Adet`, `Fiyat`, `Tür`) VALUES
(1, 'ktp00001', 'Kuyucaklı Yusuf', 'Sabahattin Ali', 150, 13, 'Roman'),
(2, 'ktp00002', 'Kürk Mantolu Madonna', 'Sabahattin Ali', 96, 12, 'Roman'),
(3, 'ktp00003', 'Küçük Prens', 'Antoine de Saint-Exupery', 131, 9.3, 'Çocuk'),
(4, 'ktp00004', 'Bu Ülke', 'Cemil Meriç', 200, 43, 'Sosyoloji'),
(5, 'ktp00005', 'Siyasetname', 'Nizamülmülk', 100, 30, 'Tarih'),
(6, 'ktp00006', 'Devlet', 'Platon', 147, 14.4, 'Felsefe'),
(7, 'ktp00007', 'Şeker Portakalı', 'Jose Mauro De Vasconcelos', 126, 25, 'Roman'),
(8, 'ktp00008', 'Büyük Saat', 'Turgut Uyar', 123, 50, 'Şiir'),
(9, 'ktp00009', 'Sevda Sözleri', 'Cemal Süreya', 90, 32.25, 'Şiir'),
(10, 'ktp00010', 'Dedemin Bakkalı', 'Şermin Yaşar', 64, 38, 'Çocuk'),
(11, 'ktp00011', 'Böyle Söyledi Zerdüşt', 'Friedrich Nietzsche', 172, 18, 'Felsefe'),
(12, 'ktp00012', 'Okulsuz Toplum', 'Ivan Illich', 49, 18.75, 'Sosyoloji'),
(13, 'ktp00013', 'İki Yıl Okul Tatili', 'Jules Verne', 93, 6.3, 'Çocuk'),
(14, 'ktp00014', 'Vezir Gambiti', 'Walter Tevis', 150, 38, 'Roman'),
(15, 'ktp00015', 'Türkiye\'nin Yakın Tarihi ', 'İlber Ortaylı', 96, 38, 'Tarih'),
(16, 'ktp00016', 'Gazi Mustafa Kemal Atatürk', 'İlber Ortaylı', 172, 37.25, 'Tarih'),
(17, 'ktp00017', 'Sokrates\'in  Savunması', 'Platon', 134, 12, 'Felsefe'),
(18, 'ktp00018', 'Hasretinden Prangalar Eskittim', 'Ahmed Arif', 75, 25, 'Şiir'),
(19, 'ktp00019', 'Yedi Güzel Adam ', 'Cahit Zarifoğlu', 46, 25.5, 'Şiir'),
(20, 'ktp00020', 'Jurnal', 'Cemil Meriç', 89, 48, 'Sosyoloji'),
(21, 'ktp00021', 'Çizgili Pijamalı  Çocuk', 'John Boyne', 163, 27, 'Çocuk'),
(22, 'ktp00022', 'Hayvan Çiftliği', 'George Orwell', 178, 22, 'Roman'),
(23, 'ktp00023', 'Seksen Günde Dünya Turu', 'Jules Verne', 163, 8, 'Çocuk'),
(25, 'ktp00025', 'Simyacı', 'Paulo Coelho', 159, 20, 'Roman'),
(26, 'ktp00026', 'Ayrılık Sevdaya Dahil', 'Atilla İlhan', 69, 18, 'Şiir'),
(27, 'ktp00027', 'Türk Ülküsü', 'Hüseyin Nihal Atsız ', 75, 20, 'Tarih'),
(28, 'ktp00028', 'Kardeşini Doğurmak', 'Büşra Sanay', 196, 43, 'Sosyoloji'),
(29, 'ktp00029', 'Utopia', 'Thomas More', 100, 13.1, 'Felsefe'),
(30, 'ktp00030', 'Deliliğe Övgü', 'Erasmus', 52, 12.25, 'Felsefe'),
(31, 'ktp00031', 'Beyaz Zambaklar Ülkesinde ', 'Grigory Petrov', 122, 15, 'Roman'),
(32, 'ktp00032', 'Küçük Kara Balık', 'Samed Behrengi', 53, 12, 'Çocuk'),
(33, 'ktp00033', 'Otuz Beş Yaş', 'Cahit Sıtkı Tarancı', 39, 34, 'Şiir'),
(34, 'ktp00034', 'Korku', 'Stefan Zweig', 195, 5, 'Roman'),
(35, 'ktp00035', 'Serenad', 'Zülfü Livaneli', 68, 45.5, 'Roman'),
(36, 'ktp00036', 'Milenaya Mektuplar', 'Kafka', 169, 30, 'Roman');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `TcKimlik` (`TcKimlik`) USING HASH;

--
-- Tablo için indeksler `musteriler`
--
ALTER TABLE `musteriler`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Mail` (`Mail`) USING HASH,
  ADD UNIQUE KEY `TelefonNumarası` (`TelefonNumarası`) USING HASH;

--
-- Tablo için indeksler `satis`
--
ALTER TABLE `satis`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `urunler`
--
ALTER TABLE `urunler`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `StokKodu` (`StokKodu`) USING HASH,
  ADD UNIQUE KEY `KitapAdı` (`KitapAdı`) USING HASH;

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `musteriler`
--
ALTER TABLE `musteriler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `satis`
--
ALTER TABLE `satis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Tablo için AUTO_INCREMENT değeri `urunler`
--
ALTER TABLE `urunler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
