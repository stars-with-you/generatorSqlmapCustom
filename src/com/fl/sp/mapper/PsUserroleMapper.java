package com.fl.sp.mapper;

import com.fl.sp.model.PsUserroleExample;
import com.fl.sp.model.PsUserroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsUserroleMapper {
    int countByExample(PsUserroleExample example);

    int deleteByExample(PsUserroleExample example);

    int deleteByPrimaryKey(PsUserroleKey key);

    int insert(PsUserroleKey record);

    int insertSelective(PsUserroleKey record);

    List<PsUserroleKey> selectByExample(PsUserroleExample example);

    int updateByExampleSelective(@Param("record") PsUserroleKey record, @Param("example") PsUserroleExample example);

    int updateByExample(@Param("record") PsUserroleKey record, @Param("example") PsUserroleExample example);
}