package net.shale.horde.resource.crops.Recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.registry.Registry;
import net.shale.horde.resource.crops.Main;

public class RecipeManager {
    public static final RecipeSerializer<?> CRAFTING_FIXED = new FixedRecipe.Serializer();
    public static final RecipeSerializer<?> CRAFTING_CATALYST = new ShapedRecipe.Serializer();

    public static void registerRecipeSerializers() {
        Registry.register(Registry.RECIPE_SERIALIZER, Main.id("fixed"), CRAFTING_FIXED);
        Registry.register(Registry.RECIPE_SERIALIZER, Main.id("catalyst"), CRAFTING_CATALYST);
    }
}
