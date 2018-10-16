package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "package_tem", schema = "CustomerSurvice", catalog = "")
public class PackageTem {
    private String packageTemId;
    private String packageTemName;
    private int onlineCs;
    private int robotMaxCapacity;
    private int repositoryMaxCapacity;
    private int price;
    private Collection<Package> packagesByPackageTemId;

    @Id
    @Column(name = "package_tem_id")
    public String getPackageTemId() {
        return packageTemId;
    }

    public void setPackageTemId(String packageTemId) {
        this.packageTemId = packageTemId;
    }

    @Basic
    @Column(name = "package_tem_name")
    public String getPackageTemName() {
        return packageTemName;
    }

    public void setPackageTemName(String packageTemName) {
        this.packageTemName = packageTemName;
    }

    @Basic
    @Column(name = "online_cs")
    public int getOnlineCs() {
        return onlineCs;
    }

    public void setOnlineCs(int onlineCs) {
        this.onlineCs = onlineCs;
    }

    @Basic
    @Column(name = "robot_max_capacity")
    public int getRobotMaxCapacity() {
        return robotMaxCapacity;
    }

    public void setRobotMaxCapacity(int robotMaxCapacity) {
        this.robotMaxCapacity = robotMaxCapacity;
    }

    @Basic
    @Column(name = "repository_max_capacity")
    public int getRepositoryMaxCapacity() {
        return repositoryMaxCapacity;
    }

    public void setRepositoryMaxCapacity(int repositoryMaxCapacity) {
        this.repositoryMaxCapacity = repositoryMaxCapacity;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageTem that = (PackageTem) o;

        if (onlineCs != that.onlineCs) return false;
        if (robotMaxCapacity != that.robotMaxCapacity) return false;
        if (repositoryMaxCapacity != that.repositoryMaxCapacity) return false;
        if (price != that.price) return false;
        if (packageTemId != null ? !packageTemId.equals(that.packageTemId) : that.packageTemId != null) return false;
        if (packageTemName != null ? !packageTemName.equals(that.packageTemName) : that.packageTemName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packageTemId != null ? packageTemId.hashCode() : 0;
        result = 31 * result + (packageTemName != null ? packageTemName.hashCode() : 0);
        result = 31 * result + onlineCs;
        result = 31 * result + robotMaxCapacity;
        result = 31 * result + repositoryMaxCapacity;
        result = 31 * result + price;
        return result;
    }
/*
    @OneToMany(mappedBy = "packageTemByPackageTemId")
    public Collection<Package> getPackagesByPackageTemId() {
        return packagesByPackageTemId;
    }

    public void setPackagesByPackageTemId(Collection<Package> packagesByPackageTemId) {
        this.packagesByPackageTemId = packagesByPackageTemId;
    }
    */
}
