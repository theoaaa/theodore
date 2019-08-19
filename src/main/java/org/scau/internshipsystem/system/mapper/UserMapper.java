package org.scau.internshipsystem.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.scau.internshipsystem.system.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
public interface UserMapper extends BaseMapper<User> {
    public IPage<User> findUserMessage(Page page, @Param("user") User user);
    public User findUserMessageByUserId(int id);

    @Select("select code from menu where id in (select menu_id from role_menu_ref where role_id in (select role_id from user_role_ref where user_id=#{userId}))")
    public List<String> getMenuCodeByUserId(int userId);
}
