package com.fl.sp.model;

public class PsUserroleKey {
    private String pguid;

    private String rcode;

    public String getPguid() {
        return pguid;
    }

    public void setPguid(String pguid) {
        this.pguid = pguid == null ? null : pguid.trim();
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode == null ? null : rcode.trim();
    }
}