package com.twitter.teruteru128.bitmessage.dandelion;

import com.twitter.teruteru128.bitmessage.inventory.InventoryVector;

public record Inventory(int streamNumber, InventoryVector hashId, Object child) {
    
}
