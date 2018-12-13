package com.fl.mapper;

import com.fl.model.SReply;
import com.fl.model.SReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SReplyMapper {
    int countByExample(SReplyExample example);

    int deleteByExample(SReplyExample example);

    int insert(SReply record);

    int insertSelective(SReply record);

    List<SReply> selectByExample(SReplyExample example);

    int updateByExampleSelective(@Param("record") SReply record, @Param("example") SReplyExample example);

    int updateByExample(@Param("record") SReply record, @Param("example") SReplyExample example);
}