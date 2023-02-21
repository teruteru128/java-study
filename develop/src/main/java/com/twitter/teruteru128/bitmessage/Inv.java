package com.twitter.teruteru128.bitmessage;

import java.util.List;

public record Inv(List<InventoryVector> invList) implements PacketPayload {

}
