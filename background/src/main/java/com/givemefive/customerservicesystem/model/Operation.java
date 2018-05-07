package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Operation {
    private String operationId;
    private int robotExpansion;
    private int repositoryExpansion;
    private Date expansionTime;
    private String packageId;
    private Package packageByPackageId;

    @Id
    @Column(name = "operation_id")
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "robot_expansion")
    public int getRobotExpansion() {
        return robotExpansion;
    }

    public void setRobotExpansion(int robotExpansion) {
        this.robotExpansion = robotExpansion;
    }

    @Basic
    @Column(name = "repository_expansion")
    public int getRepositoryExpansion() {
        return repositoryExpansion;
    }

    public void setRepositoryExpansion(int repositoryExpansion) {
        this.repositoryExpansion = repositoryExpansion;
    }

    @Basic
    @Column(name = "expansion_time")
    public Date getExpansionTime() {
        return expansionTime;
    }

    public void setExpansionTime(Date expansionTime) {
        this.expansionTime = expansionTime;
    }

    @Basic
    @Column(name = "package_id",insertable = false,updatable = false)
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation = (Operation) o;

        if (robotExpansion != operation.robotExpansion) return false;
        if (repositoryExpansion != operation.repositoryExpansion) return false;
        if (operationId != null ? !operationId.equals(operation.operationId) : operation.operationId != null)
            return false;
        if (expansionTime != null ? !expansionTime.equals(operation.expansionTime) : operation.expansionTime != null)
            return false;
        if (packageId != null ? !packageId.equals(operation.packageId) : operation.packageId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationId != null ? operationId.hashCode() : 0;
        result = 31 * result + robotExpansion;
        result = 31 * result + repositoryExpansion;
        result = 31 * result + (expansionTime != null ? expansionTime.hashCode() : 0);
        result = 31 * result + (packageId != null ? packageId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "package_id", referencedColumnName = "package_id", nullable = false)
    public Package getPackageByPackageId() {
        return packageByPackageId;
    }

    public void setPackageByPackageId(Package packageByPackageId) {
        this.packageByPackageId = packageByPackageId;
    }
}
