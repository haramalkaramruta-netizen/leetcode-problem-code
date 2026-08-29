# Write your MySQL query statement below
SELECT max(a.num) as num
FROM (
  SELECT num, count(num) as num_count
  FROM MyNumbers
  GROUP BY num
  HAVING count(num)=1
) as a


