package com.hiberus.bill.controller;

import com.hiberus.bill.dto.BillProcessResponseDto;
import com.hiberus.bill.dto.ProductDto;
import com.hiberus.bill.service.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping
    @ResponseBody
    public BillProcessResponseDto billProcess(@RequestBody ProductDto[] products){
        return billService.billProcess(products);
    }
}
