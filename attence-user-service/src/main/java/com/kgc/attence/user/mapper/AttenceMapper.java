package com.kgc.attence.user.mapper;

import com.kgc.attence.bean.Attence;
import com.kgc.attence.bean.AttenceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttenceMapper {
    int countByExample(AttenceExample example);

    int deleteByExample(AttenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attence record);

    int insertSelective(Attence record);

    List<Attence> selectByExample(AttenceExample example);

    Attence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByExample(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByPrimaryKeySelective(Attence record);

    int updateByPrimaryKey(Attence record);
}