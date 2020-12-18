package com.kgc.attence.service;

import com.kgc.attence.bean.Attence;

import java.util.List;

/**
 * @Author LHX
 * @Date 2020/12/18 15:35
 */
public interface AttenceService {
    List<Attence> selectAll();

    void insert(Attence attence);
}
