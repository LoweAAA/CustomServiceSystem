package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Company {
    private String companyId;
    private String companyName;
    private String companyAccount;
    private String companyPassword;
    private String companyAddress;
    private String companyContactInformation;
    private String companyMail;
    private int companyBalance;
    private Collection<Advertisement> advertisementsByCompanyId;
    private Collection<Category> categoriesByCompanyId;
    private Collection<Coml> comlsByCompanyId;
    private Collection<CustomerService> customerServicesByCompanyId;
    private Collection<Package> packagesByCompanyId;

    @Id
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_account")
    public String getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(String companyAccount) {
        this.companyAccount = companyAccount;
    }

    @Basic
    @Column(name = "company_password")
    public String getCompanyPassword() {
        return companyPassword;
    }

    public void setCompanyPassword(String companyPassword) {
        this.companyPassword = companyPassword;
    }

    @Basic
    @Column(name = "company_address")
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "company_contact_information")
    public String getCompanyContactInformation() {
        return companyContactInformation;
    }

    public void setCompanyContactInformation(String companyContactInformation) {
        this.companyContactInformation = companyContactInformation;
    }

    @Basic
    @Column(name = "company_mail")
    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }

    @Basic
    @Column(name = "company_balance")
    public int getCompanyBalance() {
        return companyBalance;
    }

    public void setCompanyBalance(int companyBalance) {
        this.companyBalance = companyBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyBalance != company.companyBalance) return false;
        if (companyId != null ? !companyId.equals(company.companyId) : company.companyId != null) return false;
        if (companyName != null ? !companyName.equals(company.companyName) : company.companyName != null) return false;
        if (companyAccount != null ? !companyAccount.equals(company.companyAccount) : company.companyAccount != null)
            return false;
        if (companyPassword != null ? !companyPassword.equals(company.companyPassword) : company.companyPassword != null)
            return false;
        if (companyAddress != null ? !companyAddress.equals(company.companyAddress) : company.companyAddress != null)
            return false;
        if (companyContactInformation != null ? !companyContactInformation.equals(company.companyContactInformation) : company.companyContactInformation != null)
            return false;
        if (companyMail != null ? !companyMail.equals(company.companyMail) : company.companyMail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId != null ? companyId.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyAccount != null ? companyAccount.hashCode() : 0);
        result = 31 * result + (companyPassword != null ? companyPassword.hashCode() : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (companyContactInformation != null ? companyContactInformation.hashCode() : 0);
        result = 31 * result + (companyMail != null ? companyMail.hashCode() : 0);
        result = 31 * result + companyBalance;
        return result;
    }

    @OneToMany(mappedBy = "companyByCompanyId")
    public Collection<Advertisement> getAdvertisementsByCompanyId() {
        return advertisementsByCompanyId;
    }

    public void setAdvertisementsByCompanyId(Collection<Advertisement> advertisementsByCompanyId) {
        this.advertisementsByCompanyId = advertisementsByCompanyId;
    }

    @OneToMany(mappedBy = "companyByCompanyId")
    public Collection<Category> getCategoriesByCompanyId() {
        return categoriesByCompanyId;
    }

    public void setCategoriesByCompanyId(Collection<Category> categoriesByCompanyId) {
        this.categoriesByCompanyId = categoriesByCompanyId;
    }

    @OneToMany(mappedBy = "companyByCompanyId")
    public Collection<Coml> getComlsByCompanyId() {
        return comlsByCompanyId;
    }

    public void setComlsByCompanyId(Collection<Coml> comlsByCompanyId) {
        this.comlsByCompanyId = comlsByCompanyId;
    }

    @OneToMany(mappedBy = "companyByCsCompanyId")
    public Collection<CustomerService> getCustomerServicesByCompanyId() {
        return customerServicesByCompanyId;
    }

    public void setCustomerServicesByCompanyId(Collection<CustomerService> customerServicesByCompanyId) {
        this.customerServicesByCompanyId = customerServicesByCompanyId;
    }

    @OneToMany(mappedBy = "companyByCompanyId")
    public Collection<Package> getPackagesByCompanyId() {
        return packagesByCompanyId;
    }

    public void setPackagesByCompanyId(Collection<Package> packagesByCompanyId) {
        this.packagesByCompanyId = packagesByCompanyId;
    }
}
