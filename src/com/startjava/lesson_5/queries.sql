\echo Вывод всей таблицы jaeger
SELECT *
  FROM jaegers
 ORDER BY model_name ASC;

\echo Вывод не уничтоженных роботов
SELECT *
  FROM jaegers
 WHERE NOT status = 'Destroyed'
 ORDER BY model_name ASC;

\echo  Отображение роботов нескольких серий: Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4')
 ORDER BY model_name ASC;

\echo Отображение всех роботов, кроме Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE NOT mark IN ('Mark-1', 'Mark-4')
 ORDER BY model_name ASC;

\echo Сортировка таблицы по убыванию по столбцу mark
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\echo Отображение информации о самом старом роботе
SELECT *
  FROM jaegers
 WHERE launch = (SELECT MIN(launch)
                   FROM jaegers)
 ORDER BY model_name ASC;

\echo Отображение роботов, которые уничтожили больше всех kaiju
SELECT *
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
                       FROM jaegers)
 ORDER BY model_name ASC;

\echo Отображение среднего веса роботов
SELECT ROUND(AVG(weight), 3)
  FROM jaegers;

\echo Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отображение таблицы
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE NOT status = 'Destroyed';

SELECT *
  FROM jaegers
 ORDER BY model_name ASC;

\echo Удаление уничтоженных роботов, а затем отображение оставшихся
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

SELECT *
  FROM jaegers
 ORDER BY model_name ASC;
