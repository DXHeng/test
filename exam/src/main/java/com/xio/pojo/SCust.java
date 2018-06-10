package com.xio.pojo;


public class SCust {

    private long cid;
    private String custName;
    private String custType;
    private String custPhone;
    private String custAddress;
    private SUser user;


    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }


    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }


    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }


    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }


    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }


//  public long getCustLinkUser() {
//    return custLinkUser;
//  }
//
//  public void setCustLinkUser(long custLinkUser) {
//    this.custLinkUser = custLinkUser;
//  }

    public SUser getUser() {
        return user;
    }

    public void setUser(SUser user) {
        this.user = user;
    }
}
