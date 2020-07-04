package com.jimang.restful.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jw
 * @since 2020-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("devices")
public class Devices implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("sn")
    private String sn;

    @TableField("firm_id")
    private Long firmId;

    @TableField("state")
    private Integer state;


    public static final String ID = "id";

    public static final String SN = "sn";

    public static final String FIRM_ID = "firm_id";

    public static final String STATE = "state";

}
