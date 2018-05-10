package cn.sharesdk.testgreendao.sqlite;

import com.google.gson.Gson;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.List;

import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018\5\9 0009.
 *  装置表
 */
@Entity
public class DeviceInfo {
    @Convert(columnType = String.class, converter = Flag.class)
    private List<FlagInfo> flags;//flag
    @Convert(columnType = String.class, converter = Area.class)
    private List<AreaInfo> area;//区域

    @Generated(hash = 471109223)
    public DeviceInfo(List<FlagInfo> flags, List<AreaInfo> area) {
        this.flags = flags;
        this.area = area;
    }

    @Generated(hash = 2125166935)
    public DeviceInfo() {
    }

    public List<FlagInfo> getFlags() {
        return this.flags;
    }

    public void setFlags(List<FlagInfo> flags) {
        this.flags = flags;
    }

    public List<AreaInfo> getArea() {
        return this.area;
    }

    public void setArea(List<AreaInfo> area) {
        this.area = area;
    }

    /**
     *  填加List<E>类型的方法
     */
    public static class Flag implements PropertyConverter<List<FlagInfo>, String> {
        @Override
        public List<FlagInfo> convertToEntityProperty(String databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            return new Gson().fromJson(databaseValue, FlagInfo.class);
        }

        @Override
        public String convertToDatabaseValue(List<FlagInfo> entityProperty) {
            if (entityProperty == null) {
                return null;
            }
            return new Gson().toJson(entityProperty);
        }
    }

    public static class Area implements PropertyConverter<List<AreaInfo>, String> {
        @Override
        public List<AreaInfo> convertToEntityProperty(String databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            return new Gson().fromJson(databaseValue, AreaInfo.class);
        }

        @Override
        public String convertToDatabaseValue(List<AreaInfo> entityProperty) {
            if (entityProperty == null) {
                return null;
            }
            return new Gson().toJson(entityProperty);
        }
    }

}
