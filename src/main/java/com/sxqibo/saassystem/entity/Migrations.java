package com.sxqibo.saassystem.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public class Migrations implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long version;

    private String migrationName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Boolean breakpoint;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
    public String getMigrationName() {
        return migrationName;
    }

    public void setMigrationName(String migrationName) {
        this.migrationName = migrationName;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public Boolean getBreakpoint() {
        return breakpoint;
    }

    public void setBreakpoint(Boolean breakpoint) {
        this.breakpoint = breakpoint;
    }

    @Override
    public String toString() {
        return "Migrations{" +
            "version=" + version +
            ", migrationName=" + migrationName +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", breakpoint=" + breakpoint +
        "}";
    }
}
