package com.xio.mapper;

import com.xio.pojo.SCust;
import com.xio.pojo.SUser;

import java.util.List;

/**
 *
 */
public interface CustMapper {

    List<SCust> getCustList(SCust cust);

}
