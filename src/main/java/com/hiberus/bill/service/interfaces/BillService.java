package com.hiberus.bill.service.interfaces;

import com.hiberus.bill.dto.BillProcessResponseDto;
import com.hiberus.bill.dto.ProductDto;

public interface BillService {

    public BillProcessResponseDto billProcess(ProductDto[] products);
}
