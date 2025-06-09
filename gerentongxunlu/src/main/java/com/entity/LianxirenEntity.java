package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 联系人
 *
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("lianxiren")
public class LianxirenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LianxirenEntity() {

	}

	public LianxirenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 姓名
     */
    @TableField(value = "lianxiren_name")

    private String lianxirenName;


    /**
     * 性别
     */
    @TableField(value = "lianxirensex_types")

    private Integer lianxirensexTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 分类
     */
    @TableField(value = "lianxiren_types")

    private Integer lianxirenTypes;


    /**
     * 年龄
     */
    @TableField(value = "lianxiren_age")

    private Integer lianxirenAge;


    /**
     * 联系方式
     */
    @TableField(value = "lianxiren_phone")

    private String lianxirenPhone;


    /**
     * 电子邮箱
     */
    @TableField(value = "lianxiren_email")

    private String lianxirenEmail;


    /**
     * QQ
     */
    @TableField(value = "lianxiren_qq")

    private String lianxirenQq;


    /**
     * 住址
     */
    @TableField(value = "lianxiren_zhuzhi")

    private String lianxirenZhuzhi;


    /**
     * 工作单位
     */
    @TableField(value = "lianxiren_danwei")

    private String lianxirenDanwei;


    /**
     * 备注信息
     */
    @TableField(value = "lianxiren_content")

    private String lianxirenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：姓名
	 */
    public String getLianxirenName() {
        return lianxirenName;
    }


    /**
	 * 获取：姓名
	 */

    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getLianxirensexTypes() {
        return lianxirensexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setLianxirensexTypes(Integer lianxirensexTypes) {
        this.lianxirensexTypes = lianxirensexTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：分类
	 */
    public Integer getLianxirenTypes() {
        return lianxirenTypes;
    }


    /**
	 * 获取：分类
	 */

    public void setLianxirenTypes(Integer lianxirenTypes) {
        this.lianxirenTypes = lianxirenTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getLianxirenAge() {
        return lianxirenAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setLianxirenAge(Integer lianxirenAge) {
        this.lianxirenAge = lianxirenAge;
    }
    /**
	 * 设置：联系方式
	 */
    public String getLianxirenPhone() {
        return lianxirenPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setLianxirenPhone(String lianxirenPhone) {
        this.lianxirenPhone = lianxirenPhone;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getLianxirenEmail() {
        return lianxirenEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setLianxirenEmail(String lianxirenEmail) {
        this.lianxirenEmail = lianxirenEmail;
    }
    /**
	 * 设置：QQ
	 */
    public String getLianxirenQq() {
        return lianxirenQq;
    }


    /**
	 * 获取：QQ
	 */

    public void setLianxirenQq(String lianxirenQq) {
        this.lianxirenQq = lianxirenQq;
    }
    /**
	 * 设置：住址
	 */
    public String getLianxirenZhuzhi() {
        return lianxirenZhuzhi;
    }


    /**
	 * 获取：住址
	 */

    public void setLianxirenZhuzhi(String lianxirenZhuzhi) {
        this.lianxirenZhuzhi = lianxirenZhuzhi;
    }
    /**
	 * 设置：工作单位
	 */
    public String getLianxirenDanwei() {
        return lianxirenDanwei;
    }


    /**
	 * 获取：工作单位
	 */

    public void setLianxirenDanwei(String lianxirenDanwei) {
        this.lianxirenDanwei = lianxirenDanwei;
    }
    /**
	 * 设置：备注信息
	 */
    public String getLianxirenContent() {
        return lianxirenContent;
    }


    /**
	 * 获取：备注信息
	 */

    public void setLianxirenContent(String lianxirenContent) {
        this.lianxirenContent = lianxirenContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lianxiren{" +
            "id=" + id +
            ", lianxirenName=" + lianxirenName +
            ", lianxirensexTypes=" + lianxirensexTypes +
            ", yonghuId=" + yonghuId +
            ", lianxirenTypes=" + lianxirenTypes +
            ", lianxirenAge=" + lianxirenAge +
            ", lianxirenPhone=" + lianxirenPhone +
            ", lianxirenEmail=" + lianxirenEmail +
            ", lianxirenQq=" + lianxirenQq +
            ", lianxirenZhuzhi=" + lianxirenZhuzhi +
            ", lianxirenDanwei=" + lianxirenDanwei +
            ", lianxirenContent=" + lianxirenContent +
            ", createTime=" + createTime +
        "}";
    }
}
