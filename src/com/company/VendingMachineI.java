package com.company;

import com.company.Constants.Coin;
import com.company.Constants.Item;
import com.company.Exception.NotFullPaidException;
import com.company.Exception.NotSufficientChangeException;
import com.company.util.Bucket;

import java.util.List;

public interface VendingMachineI {

        public long selectItemAndGetPrice(Item item);
        public void InsertCoin(Coin coin);
        List<Coin> refund();
        public Bucket<Item, List<Coin>> collectItemAndChange() throws NotSufficientChangeException, NotFullPaidException;
        public void reset();
}
