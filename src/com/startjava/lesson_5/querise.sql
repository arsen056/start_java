SELECT * FROM jaeger;
SELECT * FROM jaeger WHERE status = 'alive';
SELECT * FROM jaeger WHERE (mark = '1' OR mark = '6');
SELECT * FROM jaeger ORDER BY mark;
SELECT * FROM jaeger WHERE launch = (SELECT MIN(launch) FROM jaeger);
SELECT * FROM jaeger WHERE kajiuKill < '5';
SELECT AVG(weight) FROM jaeger;
UPDATE jaeger SET kajiuKill = kajiuKill + 1 WHERE status = 'alive';
DELETE FROM jaeger WHERE status = 'destroyed';
