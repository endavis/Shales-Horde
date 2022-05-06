package net.shale.horde.resource.crops.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.shale.horde.resource.crops.item.RemainderItem;
import net.shale.horde.resource.crops.item.item_group;

public class CatalystItem extends RemainderItem {
    public CatalystItem() {
        super(new FabricItemSettings().group(item_group.MISC).maxDamage(32), true);
    }
}
