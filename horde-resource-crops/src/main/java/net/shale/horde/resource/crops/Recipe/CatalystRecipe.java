package net.shale.horde.resource.crops.Recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

public class CatalystRecipe extends ShapedRecipe {
    public CatalystRecipe(Identifier id, String group, int width, int height, DefaultedList<Ingredient> input, ItemStack output) {
        super(id, group, width, height, input, output);
    }


    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeManager.CRAFTING_CATALYST;
    }
}
