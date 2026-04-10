-- Write a PL/SQL block to ask a user to input a valid employee Id. 
-- Retrieve employees name, qualification description, salary and commission. 
-- Print name, qualification and sum of salary and commission.

DECLARE
    eid NUMBER(38);
    ename VARCHAR2(15);
    equaldesc VARCHAR2(100);
    esal NUMBER(10,2);
    ecom NUMBER(10,2);
    totalsal NUMBER(10,2);

BEGIN
    eid := &eid;

    SELECT E.FNAME, Q.QUALDESC, E.SALARY, E.COMMISSION
    INTO ename, equaldesc, esal, ecom
    FROM EMPLOYEE E
    JOIN QUALIFICATION Q ON E.QUALID = Q.QUALID
    WHERE E.EMPLOYEEID = eid;

    totalsal := esal + ecom;

    DBMS_OUTPUT.PUT_LINE('Employee Name: ' || ename);
    DBMS_OUTPUT.PUT_LINE('Qualification: ' || equaldesc);
    DBMS_OUTPUT.PUT_LINE('Total Earnings: ' || totalsal);
    
END;
/
