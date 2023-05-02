--  insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           1,
--           'What is a correct syntax to output "Hello World" in Java?',
--           'echo "Hello World"',
--           'printf("Hello World")',
--           'System.out.println("Hello World")',
--           3,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           2,
--           'Java is short for "JavaScript."',
--           'True',
--           'False',
--           'Partially True',
--           2,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           3,
--           'How do you insert COMMENTS in Java code?',
--           '# This is a comment',
--           '// This is a comment',
--           '/* This is a comment',
--           2,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           4,
--           'Which data type is used to create a variable that should store text?',
--           'String',
--           'Char',
--           'Both',
--           1,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           5,
--           'How do you create a variable with the numeric value 5?',
--           'num x = 5',
--           'float x = 5',
--           'int x = 5',
--           3,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           6,
--           'How do you create a variable with the floating number 2.8?',
--           'num x = 2.8',
--           'float x = 2.8',
--           'int x = 2.8',
--           2,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           7,
--           'Which method can be used to find the length of a string?',
--           'getSize()',
--           'length()',
--           'size()',
--           2,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           8,
--           'Which operator is used to add together two values?',
--           '&&',
--           '.add()',
--           '+',
--           3,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           9,
--           'The value of a string variable can be surrounded by single quotes.',
--           'True',
--           'False',
--           'Maybe',
--           2,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           10,
--           'Which operator can be used to compare two values?',
--           '><',
--           '&|',
--           '==',
--           3,
--           -1)
-- ;
--
-- insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
-- values(
--           11,
--           'Что такое Spring Boot?',
--           'язык программирование',
--           'фреймворк',
--           'платформа',
--           2,
--           -1)
-- ;


--1. Вопрос: Решите уравнение: x^2 - 4 = 0. Какой корень уравнения x^2 - 4 = 0?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           1,
           'Решите уравнение: x^2 - 4 = 0. Какой корень уравнения x^2 - 4 = 0?',
           'x = -2',
           'x = 2',
           'x = 4',
           2,
           -1
       );

--2. Вопрос: Решите систему уравнений:
--x + y = 5,
--2x - y = 3. Какое значение x получится при решении этой системы?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           2,
           'Решите систему уравнений: x + y = 5, 2x - y = 3. Какое значение x получится при решении этой системы?',
           'x = 2',
           'x = 3',
           'x = 4',
           1,
           -1
       );

--3. Вопрос: Каково значение выражения 2a - 4b при a = 3 и b = 5?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           3,
           'Каково значение выражения 2a - 4b при a = 3 и b = 5?',
           '-4',
           '-2',
           '4',
           2,
           -1
       );

--4. Вопрос: Вычислите значение выражения: (x^2 + 3x - 4) / (x - 1) при x = 2.
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           4,
           'Вычислите значение выражения: (x^2 + 3x - 4) / (x - 1) при x = 2.',
           '3',
           '6',
           '8',
           2,
           -1
       );

--5. Вопрос: Решите уравнение: 2x + 7 = 15. Какое значение x будет являться решением уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           5,
           'Решите уравнение: 2x + 7 = 15. Какое значение x будет являться решением уравнения?',
           '4',
           '5',
           '6',
           1,
           -1
       );


-- 7. Вопрос: Решите уравнение: |x - 2| = 4. Какие значения x будут являться решением этого уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           6,
           'Решите уравнение: |x - 2| = 4. Какие значения x будут являться решением этого уравнения?',
           '-2 и 6',
           '-4 и 8',
           '-6 и 10',
           2,
           -1
       );

-- 8. Вопрос: Решите уравнение: 3x - 2 = x + 10. Какое значение x будет являться решением этого уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           7,
           'Решите уравнение: 3x - 2 = x + 10. Какое значение x будет являться решением этого уравнения?',
           '4',
           '6',
           '8',
           3,
           -1
       );

-- 9. Вопрос: Вычислите значение выражения: 2(3x - 4) + 5x при x = 2.
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           8,
           'Вычислите значение выражения: 2(3x - 4) + 5x при x = 2.',
           '5',
           '12',
           '15',
           2,
           -1
       );

-- 10. Вопрос: Решите уравнение: 4x^2 + 8x + 3 = 0. Какие корни будут у этого уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           9,
           'Решите уравнение: 4x^2 + 8x + 3 = 0. Какие корни будут у этого уравнения?',
           'нет корней',
           'два комплексных корня',
           'два действительных корня',
           2,
           -1
       );

-- 11. Вопрос: Решите систему уравнений:
-- 2x + 3y = 11,
-- 4x - y = 5. Какое значение y получится при решении этой системы?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           10,
           'Решите систему уравнений: 2x + 3y = 11, 4x - y = 5. Какое значение y получится при решении этой системы?',
           'y = -3',
           'y = -2',
           'y = -1',
           1,
           -1
       );

-- Конечно, продолжаю:

-- 12. Вопрос: Решите уравнение: 3x + 2 = 5x - 1. Какое значение x будет являться решением уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           11,
           'Решите уравнение: 3x + 2 = 5x - 1. Какое значение x будет являться решением уравнения?',
           'x = 1',
           'x = 3',
           'x = 4',
           2,
           -1
       );

-- 13. Вопрос: Решите систему уравнений:
-- 2x - y = 7,
-- x + 3y = -5. Какое значение y получится при решении этой системы?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           12,
           'Решите систему уравнений: 2x - y = 7, x + 3y = -5. Какое значение y получится при решении этой системы?',
           'y = -3',
           'y = -2',
           'y = -1',
           1,
           -1
       );

-- 14. Вопрос: Решите уравнение: 2x^2 - 5x - 12 = 0. Какие корни будут у этого уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           13,
           'Решите уравнение: 2x^2 - 5x - 12 = 0. Какие корни будут у этого уравнения?',
           'x = -2, x = 3/2',
           'x = -3/2, x = 4',
           'x = -4, x = 3/2',
           1,
           -1
       );

-- 15. Вопрос: Вычислите значение выражения: 3a + 4b - 2c при a = 2, b = 3 и c = 4.
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           14,
           'Вычислите значение выражения: 3a + 4b - 2c при a = 2, b = 3 и c = 4.',
           '5',
           '7',
           '9',
           2,
           -1
       );

-- 16. Вопрос: Решите уравнение: 2(x + 3) = 5x - 1. Какое значение x будет являться решением уравнения?
INSERT INTO questions(ques_id, title, optionA, optionB, optionC, ans, chose)
VALUES (
           15,
           'Решите уравнение: 2(x + 3) = 5x - 1. Какое значение x будет являться решением уравнения?',
           'x = 4',
           'x = 5',
           'x = 6',
           1,
           -1
       );


-- CREATE TABLE subject (
--                          subject_id SERIAL PRIMARY KEY,
--                          name VARCHAR(255) NOT NULL
-- );
--
-- ALTER TABLE questions ADD COLUMN subject_id INTEGER REFERENCES subject(subject_id);






