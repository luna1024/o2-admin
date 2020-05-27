package beer.o2.modules.sys.domain.user.vo;

import beer.o2.common.util.PageUtils;
import beer.o2.modules.sys.domain.user.entity.SysUserDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author:bomber
 * @Date:Created in 12:08 下午 2020/5/26
 * @Description:
 * @Modified By:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserResponseVO {

    SysUserDO user;

    PageUtils page;


}
