package person.pluto.natcross.bean;

import lombok.extern.slf4j.Slf4j;
import person.pluto.natcross.common.NatcrossConstants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 * natcross通用参数
 * </p>
 *
 * @author wangmin1994@qq.com
 * @since 2019-03-28 11:01:04
 */
@Slf4j
@Component
@ConfigurationProperties(prefix = "natcross.constants")
public class NatcrossSpringConstants {

    public void setSTREAM_CACHE_SIZE(Integer sTREAM_CACHE_SIZE) {
        NatcrossConstants.STREAM_CACHE_SIZE = sTREAM_CACHE_SIZE;
        log.trace("STREAM_CACHE_SIZE[{}]", NatcrossConstants.STREAM_CACHE_SIZE);
    }

    public void setCLIENT_SERVER_PORT(Integer cLIENT_SERVER_PORT) {
        NatcrossConstants.CLIENT_SERVER_PORT = cLIENT_SERVER_PORT;
        log.trace("CLIENT_SERVER_PORT[{}]", NatcrossConstants.CLIENT_SERVER_PORT);
    }

}
