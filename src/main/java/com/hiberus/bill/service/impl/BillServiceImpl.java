package com.hiberus.bill.service.impl;

import com.hiberus.bill.dto.BillProcessResponseDto;
import com.hiberus.bill.dto.ProductDto;
import com.hiberus.bill.service.interfaces.BillService;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillServiceImpl implements BillService {

    public BillProcessResponseDto billProcess(ProductDto[] products){

        BillProcessResponseDto billProcessResponseDto = new BillProcessResponseDto();
        double total = 0;
        for (ProductDto product: products) {
            total = total + (product.getCost() * product.getQuantity());
        }
        billProcessResponseDto.setTotal(total);
        return billProcessResponseDto;
    }

}
