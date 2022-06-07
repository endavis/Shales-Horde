package net.shale.horde.deco.block.custom;

import alexiil.mc.lib.multipart.api.AbstractPart;
import alexiil.mc.lib.multipart.api.MultipartHolder;
import alexiil.mc.lib.multipart.api.MultipartUtil;
import alexiil.mc.lib.multipart.api.PartDefinition;
import alexiil.mc.lib.multipart.api.render.PartModelKey;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BedPart extends AbstractPart {

    public BedPart(PartDefinition definition, MultipartHolder holder) {
        super(definition, holder);
    }

    @Override
    public VoxelShape getShape() {
        return null;
    }

    @Nullable
    @Override
    public PartModelKey getModelKey() {
        return null;
    }
}
