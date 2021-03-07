# 데이터베이스 생성
DROP DATABASE IF EXISTS whatIsMyName;
CREATE DATABASE whatIsMyName;
USE whatIsMyName;

# word 테이블 생성
CREATE TABLE word (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    `body` CHAR(100) NOT NULL
);

# word, 테스트 데이터 생성
INSERT INTO word
SET regDate = NOW(),
updateDate = NOW(),
`body` = "테스트1";

INSERT INTO word
SET regDate = NOW(),
updateDate = NOW(),
`body` = "테스트2";

INSERT INTO word
SET regDate = NOW(),
updateDate = NOW(),
`body` = "테스트3";

SELECT * FROM word;
