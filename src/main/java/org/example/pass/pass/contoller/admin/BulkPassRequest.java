package org.example.pass.pass.contoller.admin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.pass.pass.util.LocalDateTimeUtils;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BulkPassRequest {
    private Integer packageSeq;
    private String userGroupId;
    private LocalDateTime startedAt;

    public void setStartedAt(String startedAtString) {
        this.startedAt = LocalDateTimeUtils.parse(startedAtString);

    }

}
