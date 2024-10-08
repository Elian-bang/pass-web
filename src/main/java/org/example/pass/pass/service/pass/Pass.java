package org.example.pass.pass.service.pass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.pass.pass.repository.pass.PassStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Pass {
    private Integer passSeq;
    private Integer packageSeq;
    private String packageName;
    private String userId;

    private PassStatus status;
    private Integer remainingCount;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private LocalDateTime expiredAt;

}
