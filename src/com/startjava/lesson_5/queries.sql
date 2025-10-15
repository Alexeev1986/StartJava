\echo '1. Вся таблица '
SELECT * FROM jaegers ORDER BY model_name;
\echo '2. Только не уничтоженные роботы '
SELECT * FROM jaegers WHERE status != 'Destroyed' ORDER BY model_name;
\echo '3. Роботы серии Mark-1 и Mark-4 '
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4') ORDER BY model_name;
\echo '4. Все роботы, кроме Mark-1 и Mark-4 (по mark DESC)'
SELECT * FROM jaegers 
WHERE mark NOT IN ('Mark-1', 'Mark-4') 
ORDER BY mark DESC;
\echo '5. Самые старые роботы (по дате запуска)'
SELECT * FROM jaegers 
WHERE launch = (SELECT MIN(launch) FROM jaegers)
ORDER BY model_name;
\echo '6. Роботы с максимальным количеством убитых кайдзю '
SELECT model_name, mark, launch, kaiju_kill 
FROM jaegers 
WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers)
ORDER BY model_name;
\echo '7. Средний вес роботов (округлён до 3 знаков) '
SELECT ROUND(AVG(weight), 3) AS avg_weight FROM jaegers;
\echo '8. Увеличение kaiju_kill на 1 у неразрушенных роботов '
UPDATE jaegers 
SET kaiju_kill = kaiju_kill + 1 
WHERE status != 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;
\echo ' 9. Удаление уничтоженных роботов и вывод оставшихся '
DELETE FROM jaegers 
WHERE status = 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;