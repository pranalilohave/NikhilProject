package com.pasistence.mantrafingerprint.Models;

import java.io.Serializable;

public class WorkerModel implements Serializable {
    public String Id, memberId, adminId, statusId, firstName, middleName, lastName, empId, contactNo, alternatNo, dateOfBirth, emailId, permanentAddress, currentAddress, fingerprintOne, fingerprintTwo, bankName, accountHolder, accountNumber, IFSCCode, status, created_at, updated_at, photourl;


    public WorkerModel() {
    }

    public WorkerModel(String id, String memberId, String adminId, String statusId, String firstName, String middleName, String lastName, String empId, String contactNo, String alternatNo, String dateOfBirth, String emailId, String permanentAddress, String currentAddress, String fingerprintOne, String fingerprintTwo, String bankName, String accountHolder, String accountNumber, String IFSCCode, String status, String created_at, String updated_at, String photourl) {
        Id = id;
        this.memberId = memberId;
        this.adminId = adminId;
        this.statusId = statusId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.empId = empId;
        this.contactNo = contactNo;
        this.alternatNo = alternatNo;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.fingerprintOne = fingerprintOne;
        this.fingerprintTwo = fingerprintTwo;
        this.bankName = bankName;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.IFSCCode = IFSCCode;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.photourl = photourl;
    }




    /*  public WorkerModel() {
        this.Id = Id;
        this.memberId = memberId;
        this.adminId = adminId;
        this.statusId = statusId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.empId = empId;
        this.contactNo = contactNo;
        this.alternatNo = alternatNo;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.fingerprintOne = fingerprintOne;
        this.fingerprintTwo = fingerprintTwo;
        this.bankName = bankName;
        this.accountHolder = accountHolder;
        *//*this.accountNumber = accountNumber;
        this.IFSCCode = IFSCCode;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.photourl = photourl;*//*
    }*/

    public WorkerModel(int id, String memberId, String adminId, String s, String statusId, String firstName, String middleName, String lastName, String empId, String contactNo, String alternatNo, String emailId, String permanentAddress, String currentAddress, String fingerprintOne, String fingerprintTwo, String bankName) {
    }

    @Override
    public String toString() {
        return "WorkerModel{" +
                "Id='" + Id + '\'' +
                ", memberId='" + memberId + '\'' +
                ", adminId='" + adminId + '\'' +
                ", statusId='" + statusId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId='" + empId + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", alternatNo='" + alternatNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", emailId='" + emailId + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", fingerprintOne='" + fingerprintOne + '\'' +
                ", fingerprintTwo='" + fingerprintTwo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", photourl='" + photourl + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAlternatNo() {
        return alternatNo;
    }

    public void setAlternatNo(String alternatNo) {
        this.alternatNo = alternatNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getFingerprintOne() {
        return fingerprintOne;
    }

    public void setFingerprintOne(String fingerprintOne) {
        this.fingerprintOne = fingerprintOne;
    }

    public String getFingerprintTwo() {
        return fingerprintTwo;
    }

    public void setFingerprintTwo(String fingerprintTwo) {
        this.fingerprintTwo = fingerprintTwo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }
}