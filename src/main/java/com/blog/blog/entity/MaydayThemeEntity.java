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
@TableName("mayday_theme")
public class MaydayThemeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 主题名(url)
	 */
	private String themeName;
	/**
	 * 主题描述
	 */
	private String themeDescribe;
	/**
	 * 主题预览图
	 */
	private String themeImg;
	/**
	 * 0未启用1已启用
	 */
	private Integer themeStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
