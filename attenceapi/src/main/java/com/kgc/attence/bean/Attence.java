package com.kgc.attence.bean;

import java.util.Date;

public class Attence {
    private Integer id;

    private String empname;

    private String dept;

    private Date chkdate;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public Date getChkdate() {
        return chkdate;
    }

    public void setChkdate(Date chkdate) {
        this.chkdate = chkdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}