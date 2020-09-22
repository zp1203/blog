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
@TableName("mayday_logs")
public class MaydayLogsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer logId;
	/**
	 * 标题
	 */
	private String logTitle;
	/**
	 * 内容
	 */
	private String logContent;
	/**
	 * ip
	 */
	private String logIp;
	/**
	 * 时间
	 */
	private Date logDate;

}
