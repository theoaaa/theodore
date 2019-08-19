package org.scau.internshipsystem.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * <p>
 * 
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
@Data
public class Offer  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String company;

    private String job;

    private String imagePath;

    private Integer state;


}
