-- Use a PL/SQL block to delete item number 4 from the ITEM table.

BEGIN
    DELETE FROM ITEM WHERE ItemNum = 4;
    COMMIT;
END;
/