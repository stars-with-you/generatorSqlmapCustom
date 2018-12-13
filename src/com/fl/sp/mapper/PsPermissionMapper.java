package com.fl.sp.mapper;

import com.fl.sp.model.PsPermission;
import com.fl.sp.model.PsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsPermissionMapper {
    int countByExample(PsPermissionExample example);

    int deleteByExample(PsPermissionExample example);

    int deleteByPrimaryKey(String pid);

    int insert(PsPermission record);

    int insertSelective(PsPermission record);

    List<PsPermission> selectByExample(PsPermissionExample example);

    PsPermission selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") PsPermission record, @Param("example") PsPermissionExample example);

    int updateByExample(@Param("record") PsPermission record, @Param("example") PsPermissionExample example);

    int updateByPrimaryKeySelective(PsPermission record);

    int updateByPrimaryKey(PsPermission record);
}