package com.pandinila.broadband_management.entity;

public final class Enums {
    private Enums() { }
    public enum QualityLevel { EXCELLENT, GOOD, FAIR, POOR }
    public enum RiskLevel { LOW, MEDIUM, HIGH }
    public enum IncidentType { PROACTIVE_NETWORK_ISSUE, HIGH_LATENCY, PACKET_LOSS, LOW_SPEED, POOR_SIGNAL, SERVICE_DEGRADATION }
    public enum Priority { HIGH, MEDIUM, LOW }
    public enum IncidentStatus { NEW, ASSIGNED, IN_PROGRESS, ON_HOLD, RESOLVED, CLOSED }
}
