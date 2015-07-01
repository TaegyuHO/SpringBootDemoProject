-- Spring Boot에서는 표준위치의 schema.sql 파일과 data.sql파일을 기본적으로 실행시켜 준다
-- 자세한 내용은 아래 링크 참고 
-- http://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- ====================================================================================
drop table USER;
create table USER (
	ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(20) NOT NULL
);
