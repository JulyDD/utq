package com.utongqu.dao;

import java.util.List;

import com.utongqu.entity.Contents;

public interface ContentsDao {

	//写内容
	public boolean addContent(Contents content);
	//查内容（临时/无限循环查询/BUG）
	public List<Contents> findContents();
	//根据关键字查内容
	public List<Contents> queryByPage(String hql, int offset, int pageSize);
	    
	public int getAllRowCount(String hql);
}
