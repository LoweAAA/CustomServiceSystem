package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;

@Entity
public class Advertisement {
    private String advertisementId;
    private String advertisementWebsite;
    private String companyId;
    private Company companyByCompanyId;

    @Id
    @Column(name = "advertisement_id")
    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    @Basic
    @Column(name = "advertisement_website")
    public String getAdvertisementWebsite() {
        return advertisementWebsite;
    }

    public void setAdvertisementWebsite(String advertisementWebsite) {
        this.advertisementWebsite = advertisementWebsite;
    }

    @Basic
    @Column(name = "company_id",insertable = false,updatable = false)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advertisement that = (Advertisement) o;

        if (advertisementId != null ? !advertisementId.equals(that.advertisementId) : that.advertisementId != null)
            return false;
        if (advertisementWebsite != null ? !advertisementWebsite.equals(that.advertisementWebsite) : that.advertisementWebsite != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = advertisementId != null ? advertisementId.hashCode() : 0;
        result = 31 * result + (advertisementWebsite != null ? advertisementWebsite.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }
/*

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    public Company getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(Company companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }
*/

}
