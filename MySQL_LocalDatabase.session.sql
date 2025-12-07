SELECT *
FROM    customer;

SELECT *
FROM    customer
WHERE   Country = 'USA'
AND     City LIKE 'Lo%';

SELECT *
FROM    customer
WHERE   Country = 'USA';

SELECT *
FROM     customer
ORDER BY Country ASC, ContactName DESC;

SELECT *
FROM    customer
Where   (Country = 'USA' OR Country = 'UK' OR Country = 'Australia')
And     (ContactName LIKE 'M%' OR ContactName LIKE 'R%' );

Select *
From    customer
Where Not (ContactName LIKE 'M%' OR ContactName LIKE 'R%' );

Select *
 From   customer
 Where  CompanyName IS NULL 
    OR  ContactName IS NULL 
    OR  Address     IS NULL 
    OR  City        IS NULL 
    OR  PostalCode  IS NULL 
    OR  Country     IS NULL;

Select *
 From   customer
 Where  CompanyName IS Not NULL 
    AND ContactName IS Not NULL 
    AND Address     IS Not NULL 
    AND City        IS Not NULL 
    AND PostalCode  IS Not NULL 
    AND Country     IS Not NULL;

SELECT  CompanyName AS NameOfCompany, ContactName AS UserName
FROM    customer;

SELECT COUNT(Country) AS NumberOfCountries, Country
FROM    customer
GROUP BY Country
ORDER BY NumberOfCountries ASC;