CREATE TABLE book(
bookNo char(10) PRIMARY KEY NOT NULL COMMENT '도서 번호',
bookTitle varchar(30) NOT NULL COMMENT '도서 제목',
bookAuthor varchar(20) COMMENT '저자',
bookYear date COMMENT '발행연도',
bookPrice int COMMENT '가격',
bookPublisher char(10) COMMENT '출판사'
);

INSERT INTO book values('B001','자바프로그래밍','홍길동','2020-01-01',30000,'멀티출판사');
INSERT INTO book values('B002','MYSQL이해','나이해','2022-01-01',25000,'캠퍼스출판');
INSERT INTO book values('B003','SPRING 활용','김고수','2021-01-01',45000,'디지털출판사');

select bookNo 도서번호,bookTitle 도서제목,bookAuthor 저자,year(bookYear) 발행연도,bookPrice 가격,bookPublisher 출판사 from book;