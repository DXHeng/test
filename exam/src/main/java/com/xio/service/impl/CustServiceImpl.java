package com.xio.service.impl;

import com.xio.mapper.CustMapper;
import com.xio.pojo.SCust;
import com.xio.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustServiceImpl implements CustService {

    @Autowired
    private CustMapper custMapper;

    @Override
    public List<SCust> getCustList(SCust cust) {
        return custMapper.getCustList(cust);
    }
}
