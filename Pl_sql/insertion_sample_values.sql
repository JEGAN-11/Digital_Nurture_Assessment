INSERT INTO Customers
VALUES (1,
        'John Doe',
        TO_DATE('1955-05-15','YYYY-MM-DD'),
        15000,
        'FALSE',
        SYSDATE);

INSERT INTO Customers
VALUES (2,
        'Jane Smith',
        TO_DATE('1990-07-20','YYYY-MM-DD'),
        1500,
        'FALSE',
        SYSDATE);


INSERT INTO Accounts
VALUES (1,1,'Savings',15000,SYSDATE);

INSERT INTO Accounts
VALUES (2,2,'Checking',1500,SYSDATE);


INSERT INTO Transactions
VALUES (1,1,SYSDATE,200,'Deposit');

INSERT INTO Transactions
VALUES (2,2,SYSDATE,300,'Withdrawal');


INSERT INTO Loans
VALUES (1,
        1,
        5000,
        5,
        SYSDATE,
        SYSDATE+20);

INSERT INTO Loans
VALUES (2,
        2,
        10000,
        8,
        SYSDATE,
        ADD_MONTHS(SYSDATE,24));


INSERT INTO Employees
VALUES (1,
        'Alice Johnson',
        'Manager',
        70000,
        'HR',
        TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees
VALUES (2,
        'Bob Brown',
        'Developer',
        60000,
        'IT',
        TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;