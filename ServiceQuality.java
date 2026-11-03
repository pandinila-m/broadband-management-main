package com.pandinila.broadband_management.entity;
import jakarta.persistence.*; import java.time.Instant;
@Entity @Table(name="service_quality") public class ServiceQuality {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) @JoinColumn(name="customer_id") private Customer customer; @OneToOne @JoinColumn(name="network_metric_id") private NetworkMetric networkMetric; private double qualityScore; @Enumerated(EnumType.STRING) private Enums.QualityLevel qualityLevel; private Instant calculatedAt=Instant.now();
 public Long getId(){return id;} public Customer getCustomer(){return customer;} public void setCustomer(Customer v){customer=v;} public NetworkMetric getNetworkMetric(){return networkMetric;} public void setNetworkMetric(NetworkMetric v){networkMetric=v;} public double getQualityScore(){return qualityScore;} public void setQualityScore(double v){qualityScore=v;} public Enums.QualityLevel getQualityLevel(){return qualityLevel;} public void setQualityLevel(Enums.QualityLevel v){qualityLevel=v;}
}
