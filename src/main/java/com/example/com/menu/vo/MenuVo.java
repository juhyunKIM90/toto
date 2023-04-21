package com.example.com.menu.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MenuVo {
    // Fields
    private int      idx;
	private String   menu_id;
	private String   title;
	private String   cont;
	private String   writer;
	private String   regdate;
	private int      readcount;
	private int      bnum;
	private int      lvl;
	private int      step;
	private int      nref;	
	
	private int      delnum;
	
	private int      parent;
}
