package com.givemefive.customerservicesystem.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    private String userId;
    private String userIp;
    private String userAccessMode;
    private String userAddress;
    private String userName;
    private String userContactInformation;
    private String userMail;
    private String userRemarks;

    @Id
    @Column(name = "user_id", nullable = false, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_ip", nullable = false, length = 20)
    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Basic
    @Column(name = "user_access_mode", nullable = false, length = 20)
    public String getUserAccessMode() {
        return userAccessMode;
    }

    public void setUserAccessMode(String userAccessMode) {
        this.userAccessMode = userAccessMode;
    }

    @Basic
    @Column(name = "user_address", nullable = true, length = 20)
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_contact_information", nullable = true, length = 20)
    public String getUserContactInformation() {
        return userContactInformation;
    }

    public void setUserContactInformation(String userContactInformation) {
        this.userContactInformation = userContactInformation;
    }

    @Basic
    @Column(name = "user_mail", nullable = true, length = 20)
    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    @Basic
    @Column(name = "user_remarks", nullable = true, length = 100)
    public String getUserRemarks() {
        return userRemarks;
    }

    public void setUserRemarks(String userRemarks) {
        this.userRemarks = userRemarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (userIp != null ? !userIp.equals(user.userIp) : user.userIp != null) return false;
        if (userAccessMode != null ? !userAccessMode.equals(user.userAccessMode) : user.userAccessMode != null)
            return false;
        if (userAddress != null ? !userAddress.equals(user.userAddress) : user.userAddress != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userContactInformation != null ? !userContactInformation.equals(user.userContactInformation) : user.userContactInformation != null)
            return false;
        if (userMail != null ? !userMail.equals(user.userMail) : user.userMail != null) return false;
        if (userRemarks != null ? !userRemarks.equals(user.userRemarks) : user.userRemarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userIp != null ? userIp.hashCode() : 0);
        result = 31 * result + (userAccessMode != null ? userAccessMode.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userContactInformation != null ? userContactInformation.hashCode() : 0);
        result = 31 * result + (userMail != null ? userMail.hashCode() : 0);
        result = 31 * result + (userRemarks != null ? userRemarks.hashCode() : 0);
        return result;
    }
}
