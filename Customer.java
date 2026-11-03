package com.pandinila.broadband_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.Instant;

@Entity @Table(name = "customers")
public class Customer {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 @Column(nullable=false, unique=true, name="customer_id") private String customerId;
 @NotBlank @Column(nullable=false) private String name;
 @Email private String email; private String phone; private String address; private String city;
 @Column(name="service_plan") private String servicePlan; @Column(name="connection_type") private String connectionType;
 @Column(name="account_status") private String accountStatus = "ACTIVE"; @Column(name="previous_complaint_count") private int previousComplaintCount;
 @Column(name="created_at") private Instant createdAt = Instant.now();
 public Long getId(){return id;} public String getCustomerId(){return customerId;} public void setCustomerId(String v){customerId=v;} public String getName(){return name;} public void setName(String v){name=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;} public String getAddress(){return address;} public void setAddress(String v){address=v;} public String getCity(){return city;} public void setCity(String v){city=v;} public String getServicePlan(){return servicePlan;} public void setServicePlan(String v){servicePlan=v;} public String getConnectionType(){return connectionType;} public void setConnectionType(String v){connectionType=v;} public String getAccountStatus(){return accountStatus;} public void setAccountStatus(String v){accountStatus=v;} public int getPreviousComplaintCount(){return previousComplaintCount;} public void setPreviousComplaintCount(int v){previousComplaintCount=v;}
}
