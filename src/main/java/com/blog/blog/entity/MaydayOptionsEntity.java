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
@TableName("mayday_options")
public class MaydayOptionsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 设置名
	 */
	@TableId
	private String optionName;
	/**
	 * 设置内容
	 */
	private String optionValue;

}
