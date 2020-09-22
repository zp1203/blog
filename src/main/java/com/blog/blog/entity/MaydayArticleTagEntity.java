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
@TableName("mayday_article_tag")
public class MaydayArticleTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer articleId;
	/**
	 * 
	 */
	private Long tagId;

}
