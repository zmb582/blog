package com.blog.dao;

import java.util.List;
import java.util.Map;

import com.blog.entity.BlogType;

public interface BlogTypeDao {
	/**无参数查询所有博客类型列表*/
   public List<BlogType> countList();
   /**根据id查询一条博客类型*/
   public BlogType findById(Integer id);
   /**不固定参数查询博客类型列表*/
   public List<BlogType> list(Map<String,Object> paramMap);
   /**不固定参数查询博客类型数*/
   public Long getTotal(Map<String,Object> paramMap);
   /**添加一条博客类型*/
   public Integer add(BlogType blogType);
   /**修改一条博客类型*/
   public Integer update(BlogType blogType);
   /**查询一条博客类型*/
   public Integer delete(Integer id);
}
