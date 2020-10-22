package com.wans.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品评价回复关系
 *
 * Created by wans on 2020-10-22 17:00:14.
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplay implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
    private Long id;
	/**
	 * 评论id
	 */
	@ApiModelProperty(name = "commentId",value = "评论id")
    private Long commentId;
	/**
	 * 回复id
	 */
	@ApiModelProperty(name = "replyId",value = "回复id")
    private Long replyId;

}
