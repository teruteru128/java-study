package com.twitter.teruteru128.bitmessage;

import java.util.List;

public record GetData(List<InventoryVector> invList) implements PacketPayload {

}
