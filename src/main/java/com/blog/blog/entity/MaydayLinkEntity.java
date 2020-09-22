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
@TableName("mayday_link")
public class MaydayLinkEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer linkId;
	/**
	 * 名称
	 */
	private String linkName;
	/**
	 * 路径
	 */
	private String linkUrl;
	/**
	 * 链接logo
	 */
	private String linkLogo;
	/**
	 * 描述
	 */
	private String linkDescribe;

}
