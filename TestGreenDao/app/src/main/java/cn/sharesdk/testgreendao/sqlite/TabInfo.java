package cn.sharesdk.testgreendao.sqlite;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018\5\9 0009.
 *  标签表
 */
@Entity
public class TabInfo {
    private String tab_Label;//标签编号
    private String tab_img_number;//数量（图片上点的数量）
    private String tab_img;//图片
    private String tab_device;//装置；
    private String tab_area;//区域
    private String tab_equipment;//设备
    private String tab_number;//标签号
    private String tab_flag;//flag
    private String tab_medium;//介质
    private String tab_floor;//楼层
    private String tab_height;//高度
    private String tab_reference_material;//参考物
    private String tab_position;//位置
    private String tab_direction;//方向
    private boolean tab_arrive;//是否可达（true:是；false:否）
    private String tab_unarrive;//不可达原因
    private String tab_additional_description;//附加描述
    @Generated(hash = 1317227052)
    public TabInfo(String tab_Label, String tab_img_number, String tab_img,
            String tab_device, String tab_area, String tab_equipment,
            String tab_number, String tab_flag, String tab_medium, String tab_floor,
            String tab_height, String tab_reference_material, String tab_position,
            String tab_direction, boolean tab_arrive, String tab_unarrive,
            String tab_additional_description) {
        this.tab_Label = tab_Label;
        this.tab_img_number = tab_img_number;
        this.tab_img = tab_img;
        this.tab_device = tab_device;
        this.tab_area = tab_area;
        this.tab_equipment = tab_equipment;
        this.tab_number = tab_number;
        this.tab_flag = tab_flag;
        this.tab_medium = tab_medium;
        this.tab_floor = tab_floor;
        this.tab_height = tab_height;
        this.tab_reference_material = tab_reference_material;
        this.tab_position = tab_position;
        this.tab_direction = tab_direction;
        this.tab_arrive = tab_arrive;
        this.tab_unarrive = tab_unarrive;
        this.tab_additional_description = tab_additional_description;
    }
    @Generated(hash = 1049119295)
    public TabInfo() {
    }
    public String getTab_Label() {
        return this.tab_Label;
    }
    public void setTab_Label(String tab_Label) {
        this.tab_Label = tab_Label;
    }
    public String getTab_img_number() {
        return this.tab_img_number;
    }
    public void setTab_img_number(String tab_img_number) {
        this.tab_img_number = tab_img_number;
    }
    public String getTab_img() {
        return this.tab_img;
    }
    public void setTab_img(String tab_img) {
        this.tab_img = tab_img;
    }
    public String getTab_device() {
        return this.tab_device;
    }
    public void setTab_device(String tab_device) {
        this.tab_device = tab_device;
    }
    public String getTab_area() {
        return this.tab_area;
    }
    public void setTab_area(String tab_area) {
        this.tab_area = tab_area;
    }
    public String getTab_equipment() {
        return this.tab_equipment;
    }
    public void setTab_equipment(String tab_equipment) {
        this.tab_equipment = tab_equipment;
    }
    public String getTab_number() {
        return this.tab_number;
    }
    public void setTab_number(String tab_number) {
        this.tab_number = tab_number;
    }
    public String getTab_flag() {
        return this.tab_flag;
    }
    public void setTab_flag(String tab_flag) {
        this.tab_flag = tab_flag;
    }
    public String getTab_medium() {
        return this.tab_medium;
    }
    public void setTab_medium(String tab_medium) {
        this.tab_medium = tab_medium;
    }
    public String getTab_floor() {
        return this.tab_floor;
    }
    public void setTab_floor(String tab_floor) {
        this.tab_floor = tab_floor;
    }
    public String getTab_height() {
        return this.tab_height;
    }
    public void setTab_height(String tab_height) {
        this.tab_height = tab_height;
    }
    public String getTab_reference_material() {
        return this.tab_reference_material;
    }
    public void setTab_reference_material(String tab_reference_material) {
        this.tab_reference_material = tab_reference_material;
    }
    public String getTab_position() {
        return this.tab_position;
    }
    public void setTab_position(String tab_position) {
        this.tab_position = tab_position;
    }
    public String getTab_direction() {
        return this.tab_direction;
    }
    public void setTab_direction(String tab_direction) {
        this.tab_direction = tab_direction;
    }
    public boolean getTab_arrive() {
        return this.tab_arrive;
    }
    public void setTab_arrive(boolean tab_arrive) {
        this.tab_arrive = tab_arrive;
    }
    public String getTab_unarrive() {
        return this.tab_unarrive;
    }
    public void setTab_unarrive(String tab_unarrive) {
        this.tab_unarrive = tab_unarrive;
    }
    public String getTab_additional_description() {
        return this.tab_additional_description;
    }
    public void setTab_additional_description(String tab_additional_description) {
        this.tab_additional_description = tab_additional_description;
    }
}
