package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        try {
            Cart cart = service.get("2023314964100");
            System.out.println(cart.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
