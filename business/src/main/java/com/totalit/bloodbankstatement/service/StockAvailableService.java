package com.totalit.bloodbankstatement.service;

import com.totalit.bloodbankstatement.domain.config.Branch;
import com.totalit.bloodbankstatement.domain.config.StockAvailable;
import com.totalit.bloodbankstatement.domain.config.StockQuarantined;
import com.totalit.bloodbankstatement.domain.dto.SearchDTO;
import com.totalit.bloodbankstatement.domain.dto.StockInfoDTO;

import java.util.Date;
import java.util.List;

public interface StockAvailableService extends GenericNameService<StockAvailable> {
    StockAvailable getByBranchAndActive(Branch branch, Boolean active);

    StockInfoDTO getResult(SearchDTO dto);

    StockAvailable getAvailableByDate(SearchDTO searchDTO, Branch branch);

    List<StockAvailable> getAllByActive(Boolean active);

    StockAvailable getByBranchAndActiveAndDateCreatedBetween(Branch branch, Boolean active, Date startDate, Date endDate);

    List<StockAvailable> getAvailableByDateAndBranch(Branch branch, Date startDate, Date endDate);
}
