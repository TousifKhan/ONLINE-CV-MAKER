CREATE TABLE IF NOT EXISTS `personal_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `career_objectives` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `hobbies` varchar(255) DEFAULT NULL,
  `langauge_proficiencies` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `strength` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

