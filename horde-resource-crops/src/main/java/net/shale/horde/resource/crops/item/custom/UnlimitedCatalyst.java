package net.shale.horde.resource.crops.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.shale.horde.resource.crops.item.RemainderItem;
import net.shale.horde.resource.crops.item.item_group;

public class UnlimitedCatalyst extends RemainderItem {
    public UnlimitedCatalyst() {
        super(new FabricItemSettings().group(item_group.MISC).maxDamage(1000), false);
    }
}
