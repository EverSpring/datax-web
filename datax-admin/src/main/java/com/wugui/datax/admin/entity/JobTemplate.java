package com.wugui.datax.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * xxl-job info
 *
 * @author jingwk  2019-11-17 14:25:49
 */
@KeySequence(value = "SEQ_ID")
@Data
public class JobTemplate {
	@TableId(type = IdType.INPUT)
	@ApiModelProperty("主键ID")
	private int id;

	@ApiModelProperty("执行器主键ID")
	private int jobGroup;

	@ApiModelProperty("任务执行CRON表达式")
	private String jobCron;

	@ApiModelProperty("排序")
	private String jobDesc;

	private Date addTime;

	private Date updateTime;

	@ApiModelProperty("修改用户")
	private int userId;

	@ApiModelProperty("报警邮件")
	private String alarmEmail;

	@ApiModelProperty("执行器路由策略")
	private String executorRouteStrategy;

	@ApiModelProperty("执行器，任务Handler名称")
	private String executorHandler;

	@ApiModelProperty("执行器，任务参数")
	private String executorParam;

	@ApiModelProperty("阻塞处理策略")
	private String executorBlockStrategy;

	@ApiModelProperty("任务执行超时时间，单位秒")
	private int executorTimeout;

	@ApiModelProperty("失败重试次数")
	private int executorFailRetryCount;

	@ApiModelProperty("GLUE类型\t#com.wugui.datatx.core.glue.GlueTypeEnum")
	private String glueType;

	@TableField(exist = false)
	@ApiModelProperty("GLUE源代码")
	private String glueSource;

	@TableField(exist = false)
	@ApiModelProperty("GLUE备注")
	private String glueRemark;

	@ApiModelProperty("GLUE更新时间")
	private Date glueUpdatetime;

	@ApiModelProperty("子任务ID")
	private String childJobid;

	@ApiModelProperty("上次调度时间")
	private long triggerLastTime;

	@ApiModelProperty("下次调度时间")
	private long triggerNextTime;

	@ApiModelProperty("datax运行json")
	private String jobJson;

	@ApiModelProperty("jvm参数")
	private String jvmParam;

    @ApiModelProperty("所属项目")
	private int projectId;

	@TableField(exist=false)
	private String projectName;

	@TableField(exist=false)
	private String userName;
}
