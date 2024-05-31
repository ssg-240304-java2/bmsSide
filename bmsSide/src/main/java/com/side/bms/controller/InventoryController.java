package com.side.bms.controller;

import com.side.bms.model.dto.BookDTO;
import com.side.bms.model.dto.QuantityByBookDTO;
import com.side.bms.model.dto.QuantityByLocationDTO;
import com.side.bms.model.service.InventoryService;
import com.side.bms.view.ResultView;

import java.util.List;

public class InventoryController {
    private InventoryService inventoryService = new InventoryService();
    private ResultView resultView = new ResultView();

    public void selectBookQuantity() {

        List<QuantityByBookDTO> bookQuantityList = inventoryService.selectBookQuantity();

        if(bookQuantityList != null) {
            resultView.printSuccessMessage("selectBook");
            resultView.printBookQuantity(bookQuantityList);
        } else {
            resultView.printErrorMessage("selectBookList");
        }
    }


    public void selectLocationQuantity(String locationName) {
        List<QuantityByLocationDTO> locationQuantityList = inventoryService.selectLocationQuantity(locationName);

        switch(locationName) {
            case "창고1" : case "창고2" : case "창고3" : {
                resultView.printSuccessMessage("selectInventory");
                resultView.printLocationQuantity(locationQuantityList);
            } break;
            default : {
                resultView.printErrorMessage("selectInventoryList");
            }


        }

        if(locationName.equals("창고1")||locationName.equals("창고2")||locationName.equals("창고3")) {
            resultView.printSuccessMessage("selectInventory");
            resultView.printLocationQuantity(locationQuantityList);
        } else {
            resultView.printErrorMessage("selectInventoryList");
        }
    }
}
