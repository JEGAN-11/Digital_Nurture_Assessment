SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, DOB
        FROM Customers;

    v_age NUMBER;
BEGIN

    FOR cust IN customer_cursor LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE,cust.DOB)/12);

        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID '
                || cust.CustomerID
                || ' is '
                || v_age
                || ' years old. Interest reduced by 1%.'
            );

        END IF;

    END LOOP;

    COMMIT;

END;
