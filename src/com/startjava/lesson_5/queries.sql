\echo Вывод всей таблицы jaeger
SELECT *
    FROM jaegers;

\echo Вывод не уничтоженных роботов
SELECT *
    FROM jaegers
 WHERE NOT status = 'Destroyed';

\echo  Отображение роботов нескольких серий: Mark-1 и Mark-4
SELECT *
    FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo Отображение всех роботов, кроме Mark-1 и Mark-4
SELECT *
    FROM jaegers
 WHERE NOT mark IN ('Mark-1', 'Mark-4');

\echo Сортировка таблицы по убыванию по столбцу mark
SELECT *
    FROM jaegers
 ORDER BY mark DESC;

\echo Отображение информации о самом старом роботе
SELECT *
    FROM jaegers
 ORDER BY launch ASC
    LIMIT 1;

\echo Отображение роботов, которые уничтожили больше всех kaiju
SELECT *
    FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
                     FROM jaegers);

\echo Отображение среднего веса роботов
SELECT AVG(weight)
    FROM jaegers;

\echo Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отображение таблицы

UPDATE jaegers
    SET kaiju_kill = kaiju_kill + 1
 WHERE NOT status = 'Destroyed';

SELECT *
    FROM jaegers;

\echo Удаление уничтоженных роботов, а затем отображение оставшихся
DELETE
    FROM jaegers
 WHERE status = 'Destroyed';

SELECT *
    FROM jaegers;
