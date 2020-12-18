package com.kgc.attence.user.service;

import com.kgc.attence.bean.Attence;
import com.kgc.attence.service.AttenceService;
import com.kgc.attence.user.mapper.AttenceMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author LHX
 * @Date 2020/12/18 15:36
 */
@Component
@Service
public class AttenceServiceImpl implements AttenceService {
    @Resource
    AttenceMapper attenceMapper;
    @Override
    public List<Attence> selectAll() {
        return attenceMapper.selectByExample(null);
    }

    @Override
    public void insert(Attence attence) {

    }
}
