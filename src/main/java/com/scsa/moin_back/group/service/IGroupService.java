package com.scsa.moin_back.group.service;

import com.scsa.moin_back.common.dto.PageDTO;
import com.scsa.moin_back.group.dto.GroupDTO;

import java.util.Optional;


public interface IGroupService {
    PageDTO<GroupDTO> getGroups(String userId, Optional<Integer> page, Optional<String> category, String searchParam, String city, String district, String isActive);
}