package com.ecps.seckill.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class MenuDemo {
    private Integer id;

    private String menuName;

    private Integer menuStatus;

    private Integer menuType;

    private String menuUrl;

    private Integer menuFid;

    private Date createTime;

    private Date updateTime;

    private Integer menuLevel;

    private BigDecimal menuOrder;

    private String menuIcon;

    private String menuNameEn;

    private String menuNameJa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuFid() {
        return menuFid;
    }

    public void setMenuFid(Integer menuFid) {
        this.menuFid = menuFid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public BigDecimal getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(BigDecimal menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuNameEn() {
        return menuNameEn;
    }

    public void setMenuNameEn(String menuNameEn) {
        this.menuNameEn = menuNameEn == null ? null : menuNameEn.trim();
    }

    public String getMenuNameJa() {
        return menuNameJa;
    }

    public void setMenuNameJa(String menuNameJa) {
        this.menuNameJa = menuNameJa == null ? null : menuNameJa.trim();
    }
}