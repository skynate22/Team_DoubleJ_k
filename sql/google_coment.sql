-- ���� �ڸ�Ʈ

CREATE TABLE tbl_googleComent (
    seq	    NUMBER		 PRIMARY KEY ,
    seqj    NUMBER	 UNIQUE NOT NULL ,
    writer	nVARCHAR2(100)	NOT NULL ,	
    dates	VARCHAR2(10)	NOT NULL ,	
    times	VARCHAR2(10)	NOT NULL ,	
    title	nVARCHAR2(4)	NOT NULL ,	
    cont	nVARCHAR2(20),
    likes	NUMBER,
    views	NUMBER		
);

-- seq_GC = seq 
CREATE SEQUENCE SEQ_GC
START WITH 1 INCREMENT BY 1;

DROP TABLE tbl_googleComent;
DROP SEQUENCE SEQ_GC;

SELECT * FROM tbl_googleComent;
commit;







