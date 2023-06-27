package com.twitter.teruteru128.bitmessage.protocol.payload;

import java.util.List;

import com.twitter.teruteru128.bitmessage.inventory.InventoryVector;

public record GetData(List<InventoryVector> invList) implements PacketPayload {

}
