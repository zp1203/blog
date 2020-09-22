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
@TableName("mayday_user")
public class MaydayUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer userId;
	/**
	 * 是否禁用登录
	 */
	private String loginEnable;
	/**
	 * 登录失败次数
	 */
	private Integer loginError;
	/**
	 * 最后登录时间
	 */
	private Date loginLastTime;
	/**
	 * 头像
	 */
	private String userPortrait;
	/**
	 * 说明
	 */
	private String userExplain;
	/**
	 * 显示名称
	 */
	private String userDisplayName;
	/**
	 * 邮箱
	 */
	private String userEmail;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String userPwd;

}
