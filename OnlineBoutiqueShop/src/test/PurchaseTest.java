/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.CyclePurchase;
import java.util.Date;
import service.PurchaseService;


public class PurchaseTest {
    
    public static void main(String[] args) {
        //PurchaseService.createTable();
       CyclePurchase cp = new CyclePurchase("babyDress", "by01", 2000, 200, 4000000, new Date());
       PurchaseService.insertToPurchase(cp);
        
    }
}
