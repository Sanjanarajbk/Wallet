package com.thoughtworks.wallet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import static org.hamcrest.MatcherAssert.assertThat;

import static  org.hamcrest.Matchers.closeTo;
public class WalletTest {
    @Test
    void ShouldReturnZeroWhenWalletIsNew()throws Exception{
      Wallet wallet = new Wallet();
      Rupee amount = wallet.balance();
      assertTrue(amount.equals(new Rupee(0)));
    }
    @Test
    void ShouldBeAbleToAddRupees() throws Exception{
      Wallet wallet = new Wallet();
    Rupee rupee = new Rupee(10);
    wallet.put(rupee);
      Rupee amount = wallet.balance();
      assertTrue(amount.equals(new Rupee(10)));
      

    }
    @Test
    void ShouldReturnTotalWhenSameWalletIsUsed() throws Exception{
      Wallet wallet = new Wallet();
      
        Rupee rupee = new Rupee(20);
        wallet.put(rupee);
        Rupee rupee1 = new Rupee(10.50);
        wallet.put(rupee1);
    
      Rupee amount = wallet.balance();
      assertTrue(amount.equals(new Rupee(30.50)));

    }
    @Test
    void ShouldNotBeAbleToAddNegativeRupees() throws Exception {
      Assertions.assertThrows(Exception.class, () -> {
        Rupee rupee = new Rupee(2.5-5.0);
    });
   

    }
}
