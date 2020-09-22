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
@TableName("mayday_attachment")
public class MaydayAttachmentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 图片名称
	 */
	private String pictureName;
	/**
	 * 图片路径
	 */
	private String picturePath;
	/**
	 * 略缩图
	 */
	private String pictureSmallPath;
	/**
	 * 图片类型
	 */
	private String pictureType;
	/**
	 * 上传时间
	 */
	private String pictureCreateDate;
	/**
	 * 文件大小
	 */
	private String pictureSize;
	/**
	 * 后缀
	 */
	private String pictureSuffix;
	/**
	 * 尺寸
	 */
	private String pictureWh;

}
