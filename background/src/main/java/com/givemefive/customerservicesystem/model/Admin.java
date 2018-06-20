package com.givemefive.customerservicesystem.model;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "CustomerSurvice", catalog = "")
public class Admin {
    private int adminId;
    private String adminMail;
    private String adminPass;
    private Integer adminPermission;

    @Id
    @Column(name = "admin_id", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_mail", nullable = false, length = 20)
    public String getAdminMail() {
        return adminMail;
    }

    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    @Basic
    @Column(name = "admin_pass", nullable = false, length = 20)
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Basic
    @Column(name = "admin_permission", nullable = true)
    public Integer getAdminPermission() {
        return adminPermission;
    }

    public void setAdminPermission(Integer adminPermission) {
        this.adminPermission = adminPermission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (adminId != admin.adminId) return false;
        if (adminMail != null ? !adminMail.equals(admin.adminMail) : admin.adminMail != null) return false;
        if (adminPass != null ? !adminPass.equals(admin.adminPass) : admin.adminPass != null) return false;
        if (adminPermission != null ? !adminPermission.equals(admin.adminPermission) : admin.adminPermission != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId;
        result = 31 * result + (adminMail != null ? adminMail.hashCode() : 0);
        result = 31 * result + (adminPass != null ? adminPass.hashCode() : 0);
        result = 31 * result + (adminPermission != null ? adminPermission.hashCode() : 0);
        return result;
    }
}
