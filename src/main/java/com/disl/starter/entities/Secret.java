package com.disl.starter.entities;

import com.disl.starter.enums.UserTokenPurpose;
import com.disl.starter.models.AuditModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "SECRETS")
@Getter
@Setter
public class Secret extends AuditModel<String> {

    @Column(name = "GOOGLE_ACCESS_TOKEN")
    private String googleAccessToken;

    @Column(name = "APPLE_ACCESS_TOKEN")
    private String appleAccessToken;

    @Column(name = "FB_ACCESS_TOKEN")
    private String fbAccessToken;

    private String userToken;

    private Instant userTokenExpiresAt;

    @Enumerated(EnumType.STRING)
    private UserTokenPurpose userTokenPurpose;

    private Long userId;

}