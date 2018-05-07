package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Package {
    private String packageId;
    private String packageTemId;
    private String companyId;
    private int robotNow;
    private int repoNow;
    private Date effectiveTime;
    private Collection<Operation> operationsByPackageId;
    private PackageTem packageTemByPackageTemId;
    private Company companyByCompanyId;

    @Id
    @Column(name = "package_id")
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "package_tem_id",insertable = false,updatable = false)
    public String getPackageTemId() {
        return packageTemId;
    }

    public void setPackageTemId(String packageTemId) {
        this.packageTemId = packageTemId;
    }

    @Basic
    @Column(name = "company_id",insertable = false,updatable = false)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "robot_now_")
    public int getRobotNow() {
        return robotNow;
    }

    public void setRobotNow(int robotNow) {
        this.robotNow = robotNow;
    }

    @Basic
    @Column(name = "repo_now")
    public int getRepoNow() {
        return repoNow;
    }

    public void setRepoNow(int repoNow) {
        this.repoNow = repoNow;
    }

    @Basic
    @Column(name = "effective_time")
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        if (robotNow != aPackage.robotNow) return false;
        if (repoNow != aPackage.repoNow) return false;
        if (packageId != null ? !packageId.equals(aPackage.packageId) : aPackage.packageId != null) return false;
        if (packageTemId != null ? !packageTemId.equals(aPackage.packageTemId) : aPackage.packageTemId != null)
            return false;
        if (companyId != null ? !companyId.equals(aPackage.companyId) : aPackage.companyId != null) return false;
        if (effectiveTime != null ? !effectiveTime.equals(aPackage.effectiveTime) : aPackage.effectiveTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packageId != null ? packageId.hashCode() : 0;
        result = 31 * result + (packageTemId != null ? packageTemId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + robotNow;
        result = 31 * result + repoNow;
        result = 31 * result + (effectiveTime != null ? effectiveTime.hashCode() : 0);
        return result;
    }
/*

    @OneToMany(mappedBy = "packageByPackageId")
    public Collection<Operation> getOperationsByPackageId() {
        return operationsByPackageId;
    }

    public void setOperationsByPackageId(Collection<Operation> operationsByPackageId) {
        this.operationsByPackageId = operationsByPackageId;
    }

    @ManyToOne
    @JoinColumn(name = "package_tem_id", referencedColumnName = "package_tem_id", nullable = false)
    public PackageTem getPackageTemByPackageTemId() {
        return packageTemByPackageTemId;
    }

    public void setPackageTemByPackageTemId(PackageTem packageTemByPackageTemId) {
        this.packageTemByPackageTemId = packageTemByPackageTemId;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public Company getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(Company companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }
*/


}
