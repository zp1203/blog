package com.blog.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zp
 * @email https://github.com/zp1203
 * @date 2020-09-14 14:19:38
 */
@Data
@TableName("mayday_category")
public class MaydayCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer categoryId;
	/**
	 * 分类名称
	 */
	private String categoryName;
	/**
	 * 分类路径
	 */
	private String categoryUrl;
	/**
	 * 描述
	 */
	private String categoryDescribe;

}
