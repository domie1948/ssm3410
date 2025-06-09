package com.entity.model;

import com.entity.LianxirenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 联系人
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-20
 */
public class LianxirenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 姓名
     */
    private String lianxirenName;


    /**
     * 性别
     */
    private Integer lianxirensexTypes;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 分类
     */
    private Integer lianxirenTypes;


    /**
     * 年龄
     */
    private Integer lianxirenAge;


    /**
     * 联系方式
     */
    private String lianxirenPhone;


    /**
     * 电子邮箱
     */
    private String lianxirenEmail;


    /**
     * QQ
     */
    private String lianxirenQq;


    /**
     * 住址
     */
    private String lianxirenZhuzhi;


    /**
     * 工作单位
     */
    private String lianxirenDanwei;


    /**
     * 备注信息
     */
    private String lianxirenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：姓名
	 */
    public String getLianxirenName() {
        return lianxirenName;
    }


    /**
	 * 设置：姓名
	 */
    public void setLianxirenName(String lianxirenName) {
        this.lianxirenName = lianxirenName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getLianxirensexTypes() {
        return lianxirensexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setLianxirensexTypes(Integer lianxirensexTypes) {
        this.lianxirensexTypes = lianxirensexTypes;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：分类
	 */
    public Integer getLianxirenTypes() {
        return lianxirenTypes;
    }


    /**
	 * 设置：分类
	 */
    public void setLianxirenTypes(Integer lianxirenTypes) {
        this.lianxirenTypes = lianxirenTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getLianxirenAge() {
        return lianxirenAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setLianxirenAge(Integer lianxirenAge) {
        this.lianxirenAge = lianxirenAge;
    }
    /**
	 * 获取：联系方式
	 */
    public String getLianxirenPhone() {
        return lianxirenPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setLianxirenPhone(String lianxirenPhone) {
        this.lianxirenPhone = lianxirenPhone;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getLianxirenEmail() {
        return lianxirenEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setLianxirenEmail(String lianxirenEmail) {
        this.lianxirenEmail = lianxirenEmail;
    }
    /**
	 * 获取：QQ
	 */
    public String getLianxirenQq() {
        return lianxirenQq;
    }


    /**
	 * 设置：QQ
	 */
    public void setLianxirenQq(String lianxirenQq) {
        this.lianxirenQq = lianxirenQq;
    }
    /**
	 * 获取：住址
	 */
    public String getLianxirenZhuzhi() {
        return lianxirenZhuzhi;
    }


    /**
	 * 设置：住址
	 */
    public void setLianxirenZhuzhi(String lianxirenZhuzhi) {
        this.lianxirenZhuzhi = lianxirenZhuzhi;
    }
    /**
	 * 获取：工作单位
	 */
    public String getLianxirenDanwei() {
        return lianxirenDanwei;
    }


    /**
	 * 设置：工作单位
	 */
    public void setLianxirenDanwei(String lianxirenDanwei) {
        this.lianxirenDanwei = lianxirenDanwei;
    }
    /**
	 * 获取：备注信息
	 */
    public String getLianxirenContent() {
        return lianxirenContent;
    }


    /**
	 * 设置：备注信息
	 */
    public void setLianxirenContent(String lianxirenContent) {
        this.lianxirenContent = lianxirenContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
