package com.fl.sp.mapper;

import com.fl.sp.model.PsRolepermissionExample;
import com.fl.sp.model.PsRolepermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsRolepermissionMapper {
    int countByExample(PsRolepermissionExample example);

    int deleteByExample(PsRolepermissionExample example);

    int deleteByPrimaryKey(PsRolepermissionKey key);

    int insert(PsRolepermissionKey record);

    int insertSelective(PsRolepermissionKey record);

    List<PsRolepermissionKey> selectByExample(PsRolepermissionExample example);

    int updateByExampleSelective(@Param("record") PsRolepermissionKey record, @Param("example") PsRolepermissionExample example);

    int updateByExample(@Param("record") PsRolepermissionKey record, @Param("example") PsRolepermissionExample example);
}