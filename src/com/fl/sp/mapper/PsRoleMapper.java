package com.fl.sp.mapper;

import com.fl.sp.model.PsRole;
import com.fl.sp.model.PsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsRoleMapper {
    int countByExample(PsRoleExample example);

    int deleteByExample(PsRoleExample example);

    int deleteByPrimaryKey(String rcode);

    int insert(PsRole record);

    int insertSelective(PsRole record);

    List<PsRole> selectByExample(PsRoleExample example);

    PsRole selectByPrimaryKey(String rcode);

    int updateByExampleSelective(@Param("record") PsRole record, @Param("example") PsRoleExample example);

    int updateByExample(@Param("record") PsRole record, @Param("example") PsRoleExample example);

    int updateByPrimaryKeySelective(PsRole record);

    int updateByPrimaryKey(PsRole record);
}