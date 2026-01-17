-- SELECT Customer.Name, Invoices.InvoiceDate, Invoices.Amount
-- FROM customer
-- LEFT OUTER JOIN invoices
-- ON invoices.CustomerID = Customer.ID;

SELECT Customer.Name, Invoices.InvoiceDate, Invoices.Amount
FROM invoices
RIGHT OUTER JOIN customer
ON invoices.CustomerID = Customer.ID;