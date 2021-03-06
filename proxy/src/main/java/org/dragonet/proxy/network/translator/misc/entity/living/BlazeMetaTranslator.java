package org.dragonet.proxy.network.translator.misc.entity.living;

import com.github.steveice10.mc.protocol.data.game.entity.metadata.EntityMetadata;
import com.nukkitx.protocol.bedrock.data.EntityDataMap;
import com.nukkitx.protocol.bedrock.data.EntityFlag;
import org.dragonet.proxy.network.session.ProxySession;
import org.dragonet.proxy.network.translator.misc.entity.AbstractInsentientMetaTranslator;

public class BlazeMetaTranslator extends AbstractInsentientMetaTranslator {

    @Override
    public void translateToBedrock(ProxySession session, EntityDataMap dictionary, EntityMetadata metadata) {
        if(metadata.getId() == 15) {
            // 0x01 is on fire
            dictionary.getFlags().setFlag(EntityFlag.ON_FIRE, ((byte) metadata.getValue() & 0x01) > 0);
        }
        super.translateToBedrock(session, dictionary, metadata);
    }
}
