\# Lab 04 — Нэгжийн тест JUnit 5



\## Оюутны мэдээлэл

\- Нэр: С.Төгөлдөр

\- Оюутны код: B232270801



\## Ашигласан технологи

\- Java 17.0.21.1

\- Maven 3.10.2

\- JUnit Jupiter 5.10.2

\- Maven Surefire 3.2.5

\- Windows 11



\## Тестийн үр дүн

\- Энгийн тестийн метод: 16

\- Parameterized тестийн метод: 2

\- Нийт тестийн метод: 18

\- Tests run: 29

\- Failures: 0

\- Errors: 0

\- Skipped: 0

\- BUILD SUCCESS



\## Mutation testing



GradeCalculator классын score >= 90 нөхцөлийг

score > 90 болгон зориуд өөрчилсөн.



Унасан тестүүд:

\- GradeCalculatorTest.ninetyIsExactlyA

\- GradeCalculatorParameterizedTest.letterGradeBoundaries



Алдааны мэдээлэл:

expected: <A> but was: <B>



\- Tests run: 29

\- Failures: 2

\- Errors: 0

\- Skipped: 0

\- BUILD FAILURE



Кодыг буцааж зассаны дараа 29 тест бүгд

амжилттай ажилласан.



\## Тестийн тайлан

\- results/mvn-test.txt

\- results/mvn-test-mutant.txt



\## Дүгнэлт



Энэхүү лабораторийн ажлаар JUnit 5 ашиглан нэгжийн тест бичиж сурсан.

GradeCalculator классын дүн болон нийт оноо тооцоолох методыг шалгасан.

Тестүүдийг Arrange, Act, Assert бүтцээр бичсэн.

Хязгаарын болон буруу утгуудыг тусгайлан шалгасан.

Parameterized тест ашиглан олон өгөгдлийг нэг методоор шалгасан.

Mutation testing хийхэд 90 онооны хязгаарыг шалгадаг хоёр тест алдааг илрүүлсэн.

Кодыг буцааж зассанаар нийт 29 тест амжилттай болсон.


## Java version
```text
openjdk version "17.0.21.1" 2026-11-17
OpenJDK Runtime Environment Temurin-17.0.21.1+2 (build 17.0.21.1+2)
OpenJDK 64-Bit Server VM Temurin-17.0.21.1+2 (build 17.0.21.1+2, mixed mode, sharing)
```

## Maven version
```text
Apache Maven 3.10.2 (61b8bc355f4c4325463c22aa9afe4e7811a290f8)
Maven home: C:\Users\Dell\Tools\apache-maven-3.10.2
Java version: 17.0.21.1, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-17.0.21.10002-hotspot
Default locale: en_US, platform encoding: Cp1252, time zone: Asia/Ulaanbaatar
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```
