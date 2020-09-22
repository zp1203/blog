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
@TableName("mayday_menu")
public class MaydayMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer menuId;
	/**
	 * 菜单图标
	 */
	private String menuIcon;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 排序
	 */
	private Integer menuSort;
	/**
	 * 打开方式
	 */
	private String menuTarget;
	/**
	 * 菜单路径
	 */
	private String menuUrl;

}
