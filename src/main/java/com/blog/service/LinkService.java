package com.blog.service;

import java.util.List;
import java.util.Map;

import com.blog.entity.Link;
/**
 * 友情链接
 *
 */
public interface LinkService {
	/**根据id查询一条友情链接*/
	public Link findById(Integer id);
	
	/**不固定参数查询友情链接列表*/
	public List<Link> list(Map<String,Object> paramMap);
	
	/**不固定参数查询友情链接数*/
	public Long getTotal(Map<String,Object> paramMap);
	
	/**添加一条友情链接*/
	public Integer add(Link link);
	
	/**修改一条友情链接*/
	public Integer update(Link link);
	
	/**删除一条友情链接*/
	public Integer delete(Integer id);	
}
