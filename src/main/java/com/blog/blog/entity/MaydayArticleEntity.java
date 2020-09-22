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
@TableName("mayday_article")
public class MaydayArticleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 发表用户
	 */
	private Integer userId;
	/**
	 * 文章内容html格式
	 */
	private String articleContent;
	/**
	 * 文章内容Markdown格式
	 */
	private String articleContentMd;
	/**
	 * 发布时间
	 */
	private Date articleNewstime;
	/**
	 * 文章状态 0已发布1草稿2回收站
	 */
	private Integer articleStatus;
	/**
	 * 文章摘要
	 */
	private String articleSummary;
	/**
	 * 略缩图
	 */
	private String articleThumbnail;
	/**
	 * 文章标题
	 */
	private String articleTitle;
	/**
	 * 文章类型0原创1转载
	 */
	private Integer articleType;
	/**
	 * post文章 page页面
	 */
	private String articlePost;
	/**
	 * 是否开启评论 0开启1不开启
	 */
	private Integer articleComment;
	/**
	 * 文章最后修改时间
	 */
	private Date articleUpdatetime;
	/**
	 * 文章路径
	 */
	private String articleUrl;
	/**
	 * 访问量统计
	 */
	private Long articleViews;

}
