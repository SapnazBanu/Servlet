package com.xworkz.compnayImplement;

import com.xworkz.companyDTO.CompanyDTO;
import com.xworkz.compnayService.CompanyService;

public class CompanyImpl implements CompanyService {

    @Override
    public boolean validate(CompanyDTO dto) {
        boolean valid = true;

        if (dto != null) {
            String companyName = dto.getCompanyName();
            if (companyName != null && !companyName.isEmpty() && companyName.length() > 5 && companyName.length() <= 500) {
                System.out.println("Company name is valid.");
            } else {
                valid = false;
                System.out.println("Invalid company name: It must be between 5 and 500 characters.");
            }

            String productName = dto.getProductName();
            if (productName != null && !productName.isEmpty() && productName.length() > 5 && productName.length() <= 500) {
                System.out.println("Product name is valid.");
            } else {
                valid = false;
                System.out.println("Invalid product name: It must be between 5 and 500 characters.");
            }

            int quantity = dto.getProductQuantity();
            if (quantity > 0 && quantity <= 10) {
                System.out.println("Product quantity is valid.");
            } else {
                valid = false;
                System.out.println("Invalid product quantity: It must be between 1 and 10.");
            }

            double cost = dto.getProductCost();
            if (cost > 100) {
                System.out.println("Product cost is valid.");
            } else {
                valid = false;
                System.out.println("Invalid product cost: It must be greater than 100.");
            }

        } else {
            valid = false;
            System.out.println("CompanyDTO object is null.");
        }

        return valid;
    }

}
