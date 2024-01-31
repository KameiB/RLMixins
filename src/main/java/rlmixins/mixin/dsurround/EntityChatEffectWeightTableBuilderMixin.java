package rlmixins.mixin.dsurround;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import java.util.regex.Pattern;

@Mixin(targets = "org.orecruncher.dsurround.client.handlers.effects.EntityChatEffect$WeightTableBuilder")
public abstract class EntityChatEffectWeightTableBuilderMixin {

    @Final
    @Shadow(remap = false)
    private final Pattern TYPE_PATTERN = Pattern.compile("chat\\.([a-zA-Z_.]*)\\.[0-9]*$");
}