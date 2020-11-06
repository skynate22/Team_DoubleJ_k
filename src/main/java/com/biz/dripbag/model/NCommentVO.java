package com.biz.dripbag.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NCommentVO {
	private Long seq; //NUMBER		PRIMARY KEY,
	private Long seqC;    //	NUMBER 	NOT NULL UNIQUE	,
	private String writer;	//nVARCHAR2(100)	NOT NULL,	
    private String dates;	//VARCHAR2(10)	NOT NULL,	
    private String time;	//VARCHAR2(10)	NOT NULL,	
    private String title;	//VARCHAR2(10)	NOT NULL,	
    private String  cont;	//nVARCHAR2(20),		
    private int likes;	//NUMBER,		
    private int views;	//NUMBER		
}
