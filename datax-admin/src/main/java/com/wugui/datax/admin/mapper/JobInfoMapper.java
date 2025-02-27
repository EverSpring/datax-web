package com.wugui.datax.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wugui.datax.admin.entity.JobInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


/**
 * job info
 *
 * @author xuxueli 2016-1-12 18:03:45
 */
@Mapper
public interface JobInfoMapper extends BaseMapper<JobInfo> {

    Page<JobInfo> pageList(Page page,
                           @Param("jobGroup") int jobGroup,
                           @Param("triggerStatus") int triggerStatus,
                           @Param("jobDesc") String jobDesc,
                           @Param("glueType") String glueType,
                           @Param("userId") int userId,
                           @Param("projectIds") Integer[] projectIds);

    int pageListCount(@Param("offset") int offset,
                      @Param("pagesize") int pagesize,
                      @Param("jobGroup") int jobGroup,
                      @Param("triggerStatus") int triggerStatus,
                      @Param("jobDesc") String jobDesc,
                      @Param("glueType") String glueType,
                      @Param("userId") int userId,
                      @Param("projectIds") Integer[] projectIds);

    List<JobInfo> findAll();

    JobInfo loadById(@Param("id") int id);

    int update(JobInfo jobInfo);

    int delete(@Param("id") long id);

    List<JobInfo> getJobsByGroup(@Param("jobGroup") int jobGroup);

    int findAllCount();

    Page<JobInfo> scheduleJobQuery(Page page, @Param("maxNextTime") long maxNextTime);

    int scheduleUpdate(JobInfo xxlJobInfo);

    int incrementTimeUpdate(@Param("id") int id, @Param("incStartTime") Date incStartTime);

	public int updateLastHandleCode(@Param("id") int id,@Param("lastHandleCode")int lastHandleCode);

    void incrementIdUpdate(@Param("id") int id, @Param("incStartId")Long incStartId);
}
