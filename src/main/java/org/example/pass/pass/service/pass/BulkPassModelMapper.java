package org.example.pass.pass.service.pass;

import org.example.pass.pass.contoller.admin.BulkPassRequest;
import org.example.pass.pass.repository.pass.BulkPassEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BulkPassModelMapper {
    BulkPassModelMapper INSTANCE = Mappers.getMapper(BulkPassModelMapper.class);

    List<BulkPass> map(List<BulkPassEntity> passEntities);

    BulkPassEntity map(BulkPassRequest bulkPassRequest);

}
