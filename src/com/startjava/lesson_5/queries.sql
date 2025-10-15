\echo '1. ��� ������� '
SELECT * FROM jaegers ORDER BY model_name;
\echo '2. ������ �� ������������ ������ '
SELECT * FROM jaegers WHERE status != 'Destroyed' ORDER BY model_name;
\echo '3. ������ ����� Mark-1 � Mark-4 '
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4') ORDER BY model_name;
\echo '4. ��� ������, ����� Mark-1 � Mark-4 (�� mark DESC)'
SELECT * FROM jaegers 
WHERE mark NOT IN ('Mark-1', 'Mark-4') 
ORDER BY mark DESC;
\echo '5. ����� ������ ������ (�� ���� �������)'
SELECT * FROM jaegers 
WHERE launch = (SELECT MIN(launch) FROM jaegers)
ORDER BY model_name;
\echo '6. ������ � ������������ ����������� ������ ������ '
SELECT model_name, mark, launch, kaiju_kill 
FROM jaegers 
WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers)
ORDER BY model_name;
\echo '7. ������� ��� ������� (������� �� 3 ������) '
SELECT ROUND(AVG(weight), 3) AS avg_weight FROM jaegers;
\echo '8. ���������� kaiju_kill �� 1 � ������������� ������� '
UPDATE jaegers 
SET kaiju_kill = kaiju_kill + 1 
WHERE status != 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;
\echo ' 9. �������� ������������ ������� � ����� ���������� '
DELETE FROM jaegers 
WHERE status = 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;